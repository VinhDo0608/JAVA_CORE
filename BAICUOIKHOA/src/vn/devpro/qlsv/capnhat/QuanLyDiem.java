package vn.devpro.qlsv.capnhat;

import java.util.ArrayList;
import java.util.Scanner;

import vn.devpro.qlsv.hienthi.HienThiMonHoc;

public class QuanLyDiem {

	static Scanner sc = new Scanner(System.in);

	private static ArrayList<SinhVien> list_sv = QuanLySinhVien.getList();
	private static ArrayList<MonHoc> list_mh = QuanLyMonHoc.getList();
	private static ArrayList<Diem> list = new ArrayList<Diem>();

	public static ArrayList<Diem> getList() {
		return list;
	}

	public static void setList(ArrayList<Diem> list) {
		QuanLyDiem.list = list;
	}

	public static void init() {
		list.add(new Diem(QuanLySinhVien.getList().get(0).getID_SV(), QuanLyMonHoc.getList().get(0).getID_MH(), 10));
		list.add(new Diem(QuanLySinhVien.getList().get(1).getID_SV(), QuanLyMonHoc.getList().get(2).getID_MH(), 9));
		list.add(new Diem(QuanLySinhVien.getList().get(2).getID_SV(), QuanLyMonHoc.getList().get(3).getID_MH(), 8));
		list.add(new Diem(QuanLySinhVien.getList().get(3).getID_SV(), QuanLyMonHoc.getList().get(4).getID_MH(), 5.5));
		list.add(new Diem(QuanLySinhVien.getList().get(4).getID_SV(), QuanLyMonHoc.getList().get(5).getID_MH(), 6.5));
		list.add(new Diem(QuanLySinhVien.getList().get(0).getID_SV(), QuanLyMonHoc.getList().get(2).getID_MH(), 4.5));
		list.add(new Diem(QuanLySinhVien.getList().get(1).getID_SV(), QuanLyMonHoc.getList().get(1).getID_MH(), 8.5));
		list.add(new Diem(QuanLySinhVien.getList().get(2).getID_SV(), QuanLyMonHoc.getList().get(2).getID_MH(), 9.5));
		list.add(new Diem(QuanLySinhVien.getList().get(3).getID_SV(), QuanLyMonHoc.getList().get(5).getID_MH(), 7));
		list.add(new Diem(QuanLySinhVien.getList().get(4).getID_SV(), QuanLyMonHoc.getList().get(3).getID_MH(), 6));
	}

	public static void activate() {
		do {
			System.out.println("\n=========CAP NHAT DIEM CHO  SINH VIEN=========");
			System.out.println("Moi ban lua chon mot chuc nang cap nhat");
			System.out.println("\t1. Them diem mon hoc cho sinh vien sinh vien");
			System.out.println("\t2. Sua thong tin diem mot mon hoc cua sinh vien");
			System.out.println("\t3. Xoa diem mot mon hoc cua sinh vien");
			System.out.println("\t4. Xem danh sach bang diem");
			System.out.println("\t0. Quay lai");
			System.out.print("Lua chon cua ban: ");
			int chon = Integer.parseInt(sc.nextLine());

			switch (chon) {
			case 1:
				them();
				break;
			case 2:
				sua();
				break;
			case 3:
				xoa();
				break;
			case 4:
				xem();
				break;
			case 0:
				return;
			default:
				System.out.println("Lua chon khong hop le!");
			}
		} while (true);
	}

	private static void xem() {
		System.out.println("\n---------DANH SACH DIEM---------");
		System.out.printf("%-3s %-10s %-10s %-5s %n", "STT", "Ma sinh vien" , "Ma mon hoc", "Diem");
		int stt = 1;
		for (Diem diem : list) {
			System.out.printf("%3d ", stt++);
			diem.display();
		}
	}

	private static void them() {
		System.out.println("\n---------THEM DIEM CHO SINH VIEN---------");

		System.out.print("\tNhap ma sinh vien muon them diem: ");
		int id1 = Integer.parseInt(sc.nextLine());
		int index_sv = QuanLySinhVien.indexOf(id1);
		if (index_sv == -1) {
			System.out.println("\tSinh vien khong co trong danh sach!");
			return;
		}

		System.out.print("\tNhap ma mon hoc hoc them diem: ");
		int id2 = Integer.parseInt(sc.nextLine());
		int index_mh = indexOfMH(id2);
		if (index_mh != -1) {
			System.out.println("\tMon hoc da co diem!");
			return;
		}

		System.out.print("\tNhap diem cho mon hoc: ");
		double score = Double.parseDouble(sc.nextLine());
		Diem d = new Diem(id1, id2, score);
		list.add(d);
		System.out.println("Them diem thanh cong!");
	}

	private static void sua() {
		System.out.println("\n---------SUA DIEM MON HOC---------");
		System.out.print("\tNhap ma (id) mon hoc can sua: ");
		int id = Integer.parseInt(sc.nextLine());

		int index = QuanLyMonHoc.indexOf(id);
		if (index == -1) {
			System.out.println("\tMon hoc khong co trong danh sach!");
			return;
		}
		System.out.print("Nhap diem moi: ");
		Double diem = Double.parseDouble(sc.nextLine());
		list.get(index).setDiem(diem);
		System.out.println("\tSua diem thanh cong!");
	}

	private static void xoa() {
		System.out.println("\t---------XOA DIEM MON HOC---------");
		System.out.print("\tNhap ma sinh vien muon xoa diem: ");
		int id1 = Integer.parseInt(sc.nextLine());
		int index_sv = QuanLySinhVien.indexOf(id1);
		if (index_sv == -1) {
			System.out.println("\tSinh vien khong co trong danh sach!");
			return;
		}

		System.out.print("\tNhap ma mon hoc hoc xoa diem: ");
		int id2 = Integer.parseInt(sc.nextLine());
		int index_mh = QuanLyMonHoc.indexOf(id2);
		if (index_mh == -1) {
			System.out.println("\tMon hoc khong co trong danh sach!");
			return;
		}
		int index = indexOf(index_mh, index_sv);
		list.remove(index);
		System.out.println("\tXoa diem thanh cong!");
	}

	public static double tongDiem(int maSv) {
		double sum = 0;
		double sumOC = 0;
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getID_SV() == maSv) {
				sum += list.get(i).getDiem() * list_mh.get(QuanLyMonHoc.indexOf(list.get(i).getID_MH())).getCoefficient();
				sumOC += list_mh.get(QuanLyMonHoc.indexOf(list.get(i).getID_MH())).getCoefficient();

			}
		}
		return sum / sumOC;
	}
	
	public static double diemTB(int mMH) {
		double sum = 0;
		double dem = 0;
		for (int i = 0; i < list.size(); i++) {
			if(list.get(i).getID_MH() == mMH) {
				sum += list.get(i).getDiem();
				dem++;
			} 	
		}
		return sum / dem;
	}

	public static int indexOf(int id1, int id2) {
		for (int index = 0; index < list.size(); index++)
			if (list.get(index).getID_MH() == id1 && list.get(index).getID_SV() == id2)
				return index;

		return -1;
	}

	public static int indexOfSV(int id) {
		for (int index = 0; index < list_sv.size(); index++)
			if (list.get(index).getID_SV() == id)
				return index;

		return -1;
	}

	public static int indexOfMH(int id) {
		for (int index = 0; index < list.size(); index++)
			if (list.get(index).getID_MH() == id && list.get(index).getID_SV() == id)
				return index;

		return -1;
	}

	public static void checkMhOfSv(SinhVien x) {
		for (int i = 0; i < list.size(); i++) {
			for (int j = 0; j < list_sv.size(); j++) {
				if (list_sv.get(j).getID_SV() == list.get(i).getID_SV()) {
					list_mh.add(QuanLyMonHoc.getList().get(i));
				}
			}
		}
	}

}

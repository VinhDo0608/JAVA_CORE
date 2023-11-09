package vn.devpro.qlsv.capnhat;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class QuanLyMonHoc {

	private static int autoNumber = 201;

	static Scanner sc = new Scanner(System.in);

	private static ArrayList<MonHoc> list = new ArrayList<MonHoc>();
	public static ArrayList<MonHoc> getList() {
		return list;
	}

	public static void setList(ArrayList<MonHoc> list) {
		QuanLyMonHoc.list = list;
	}

	public static void init() {
		list.add(new MonHoc(autoNumber++, "Lap trinh Java", 2.5));
		list.add(new MonHoc(autoNumber++, "Ung dung thuat toan", 3));
		list.add(new MonHoc(autoNumber++, "Tinh toan hieu nang cao", 3.5));
		list.add(new MonHoc(autoNumber++, "Tieng anh cong nghe thong tin 1", 2));
		list.add(new MonHoc(autoNumber++, "Phan tich thiet ke phan mem", 3));
		list.add(new MonHoc(autoNumber++, "Toi uu hoa", 3));
	}

	public static void activate() {
		do {
			System.out.println("\n=========CAP NHAT THONG TIN HOC PHAN=========");
			System.out.println("Moi ban lua chon mot chuc nang cap nhat");
			System.out.println("\t1. Them hoc phan");
			System.out.println("\t2. Xem danh sach hoc phan");
			System.out.println("\t3. Sua thong tin hoc phan");
			System.out.println("\t4. Xoa hoc phan");
			System.out.println("\t0. Quay lai");
			System.out.print("Lua chon cua ban: ");
			int chon = Integer.parseInt(sc.nextLine());

			switch (chon) {
			case 1:
				them();
				break;
			case 2:
				xem();
				break;
			case 3:
				sua();
				break;
			case 4:
				xoa();
				break;
			case 0:
				return;
			default:
				System.out.println("Lua chon khong hop le!");
			}
		} while (true);
	}

	private static void them() {
		System.out.println("\n---------THEM MOI MOT MON HOC MOI VAO DANH SACH---------");

		System.out.print("Nhap ten mon hoc moi: ");
		String name = sc.nextLine();
		System.out.println("Nhap he so: ");
		double coefficient = Double.parseDouble(sc.nextLine());

		if (name.trim().length() == 0) {
			System.out.println("Ten mon hoc khong duoc de trong!");
			return;
		}

		MonHoc mh = new MonHoc(autoNumber++, name, coefficient);
		list.add(mh);
		System.out.println("Them moi thanh cong, bam 2 xem lai danh sach");

	}

	private static void xem() {
		sap();
		System.out.println("\n---------DANH SACH MON HOC---------");
		System.out.printf("%-3s %-5s %-33s %-3s %n", "STT", "Ma mh", "Ten mon hoc", "He so");
		int stt = 1;
		for (MonHoc x : list) {
			System.out.printf("%3d ", stt++);
			x.display();
		}
		if (stt == 1) {
			System.out.println("Danh sach rong!");
		}
	}

	private static void sua() {
		System.out.println("\n---------SUA THONG TIN MON HOC---------");

		System.out.print("\tNhap ma (id) mon hoc can sua: ");
		int id = Integer.parseInt(sc.nextLine());

		int index = indexOf(id);
		if (index == -1) {
			System.out.println("\tMon hoc khong co trong danh sach!");
			return;
		}
		do {
			System.out.println("Moi ban chon hinh thuc sua");
			System.out.println("\t1. Sua ten mon hoc");
			System.out.println("\t2. Sua he so mon hoc");
			System.out.println("\t0. Quay lai");
			int chon = Integer.parseInt(sc.nextLine());

			switch (chon) {
			case 1:
				System.out.print("Nhap ho dem sinh vien: ");
				String name = sc.nextLine();

				if (name.trim().length() == 0) {
					System.out.println("Ten mon hoc khong duoc de trong!");
					return;
				}
				list.get(index).setName(name);
				System.out.println("\tSua ten mon hoc thanh cong!");
				break;
			case 2:
				System.out.print("Nhap ten sinh vien: ");
				double coefficient = Double.parseDouble(sc.nextLine());
				if (coefficient < 0) {
					System.out.println("He so mon hoc khong the am!");
					return;
				}
				list.get(index).setCoefficient(coefficient);
				System.out.println("\tSua he so mon hoc thanh cong!");
				break;
			default:
				System.out.println("Lua chon khong hop le!");
			}
		} while (true);
	}

	private static void xoa() {
		System.out.println("\n---------XOA THONG TIN MON HOC---------");

		System.out.println("\tNhap ma (id) mon hoc can xoa: ");
		int id = Integer.parseInt(sc.nextLine());

		int index = indexOf(id);
		if (index == -1) {
			System.out.println("\tMon hoc khong co trong danh sach");
			return;
		}
		
		int index1 = QuanLyDiem.indexOfMH(id);
		if (index1 != -1) {
			System.out.println("\tSinh vien da nhap diem khong the xoa!");
			return;
		}
		list.remove(index);
		System.out.println("\tXoa mon hoc thanh cong!");

	}

	private static void sap() {
		Collections.sort(list, new Comparator<MonHoc>() {
			@Override
			public int compare(MonHoc o1, MonHoc o2) {
				return o1.getName().trim().compareToIgnoreCase(o2.getName().trim());
			}
		});
	}

	public static int indexOf(double d) {
		for (int index = 0; index < list.size(); index++)
			if (list.get(index).getID_MH() == d)
				return index;

		return -1;
	}
	
	public static MonHoc mHOfSV(int id) {
		for (int i = 0; i < list.size(); i++) {
			if(list.get(i).getID_MH() == id) {
				return list.get(i);
			}
		}
		return null;
	}
}

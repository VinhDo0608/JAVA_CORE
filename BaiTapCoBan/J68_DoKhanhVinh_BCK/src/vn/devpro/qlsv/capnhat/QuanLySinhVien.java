package vn.devpro.qlsv.capnhat;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class QuanLySinhVien {

	private static int autoNumber = 101;

	private static ArrayList<SinhVien> list = new ArrayList<SinhVien>();

	static Scanner sc = new Scanner(System.in);

	public static ArrayList<SinhVien> getList() {
		return list;
	}

	public static void setList(ArrayList<SinhVien> list) {
		QuanLySinhVien.list = list;
	}

	public static void init() {
		list.add(new SinhVien(autoNumber++, "Pham Van", "Duc", "2000", "Nam"));
		list.add(new SinhVien(autoNumber++, "Hoang Duc", "Hung", "1999", "Nam"));
		list.add(new SinhVien(autoNumber++, "Do Khanh", "Vinh", "1998", "Nam"));
		list.add(new SinhVien(autoNumber++, "Mguyen Thi", "Lan", "1999", "Nu"));
		list.add(new SinhVien(autoNumber++, "Le Hoang", "Yen", "2001", "Nu"));
	}

	public static void activate() {
		do {
			System.out.println("\n=========CAP NHAT THONG TIN SINH VIEN=========");
			System.out.println("Moi ban lua chon mot chuc nang cap nhat");
			System.out.println("\t1. Them sinh vien");
			System.out.println("\t2. Xem danh sach sinh vien");
			System.out.println("\t3. Sua thong tin sinh vien");
			System.out.println("\t4. Xoa sinh vien");
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
		System.out.println("\n---------THEM MOI MOT SINH VIEN MOI VAO DANH SACH---------");

		System.out.print("Nhap ho dem sinh vien moi: ");
		String fName = sc.nextLine();
		System.out.print("Nhap ten sinh vien moi: ");
		String lName = sc.nextLine();
		System.out.print("Nhap ngay sinh sinh vien moi: ");
		String dateOB = sc.nextLine();
		System.out.print("Nhap gioi tinh sinhh vien moi: ");
		String gender = sc.nextLine();

		if (fName.trim().length() == 0 || fName.trim().length() == 0 || gender.trim().length() == 0
				|| dateOB.trim().length() == 0) {
			System.out.println("Thong tin sinh vien khong duoc de trong!");
			return;
		}

		SinhVien sv = new SinhVien(autoNumber++, fName, lName, dateOB, gender);
		list.add(sv);
		System.out.println("Them moi thanh cong, bam 2 xem lai danh sach");

	}

	private static void xem() {
		sap();
		System.out.println("\n---------DANH SACH SINH VIEN---------");
		System.out.printf("%-3s %-5s %-20s %-5s %-10s %-3s %n", "STT", "Ma sv", "Ho dem", "Ten", "Ngay sinh",
				"Gioi Tinh");
		int stt = 1;
		for (SinhVien x : list) {
			System.out.printf("%3d ", stt++);
			x.display();
		}
		if (stt == 1) {
			System.out.println("Danh sach rong!");
		}
	}

	private static void sua() {
		System.out.println("\n---------SUA THONG TIN SINH VIEN---------");

		System.out.print("\tNhap ma (id) sinh vien can sua: ");
		int id = Integer.parseInt(sc.nextLine());

		int index = indexOf(id);
		if (index == -1) {
			System.out.println("\tSinh vien khong co trong danh sach!");
			return;
		}
		do {
			System.out.println("Moi ban chon hinh thuc sua");
			System.out.println("\t1. Sua toan bo thong tin mot sinh vien");
			System.out.println("\t2. Sua mot thong tin sinh vien");
			System.out.println("\t0. Quay lai");
			int chon = Integer.parseInt(sc.nextLine());

			switch (chon) {
			case 1:
				System.out.print("Nhap ho dem sinh vien: ");
				String fName = sc.nextLine();
				System.out.print("Nhap ten sinh vien: ");
				String lName = sc.nextLine();
				System.out.print("Nhap ngay sinh sinh vien: ");
				String dateOB = sc.nextLine();
				System.out.print("Nhap gioi tinh sinhh vien: ");
				String gender = sc.nextLine();

				if (fName.trim().length() == 0 || fName.trim().length() == 0 || gender.trim().length() == 0
						|| dateOB.trim().length() == 0) {
					System.out.println("Thong tin sinh vien khong duoc de trong!");
					return;
				}
				list.get(index).setfName(fName);
				list.get(index).setlName(lName);
				list.get(index).setDateOB(dateOB);
				list.get(index).setGender(gender);
				System.out.println("\tSua ten sinh vien thanh cong!");
				break;
			case 2:
				list.get(index).update();
				break;
			default:
				System.out.println("Lua chon khong hop le!");
			}
		} while (true);
	}

	private static void xoa() {
		System.out.println("\n---------XOA THONG TIN SINH VIEN---------");

		System.out.println("\tNhap ma (id) sinh vien can xoa: ");
		int id = Integer.parseInt(sc.nextLine());

		int index = indexOf(id);
		if (index == -1) {
			System.out.println("\tSinh vien khong co trong danh sach!");
			return;
		}
		
		int index1 = QuanLyDiem.indexOfSV(id);
		if (index1 != -1) {
			System.out.println("\tSinh vien da nhap diem khong the xoa!");
			return;
		}
		list.remove(index);
		System.out.println("\tXoa sinh vien thanh cong!");

	}

	public static void sap() {
		Collections.sort(list, new Comparator<SinhVien>() {
			@Override
			public int compare(SinhVien o1, SinhVien o2) {
				return o1.getlName().trim().compareToIgnoreCase(o2.getlName().trim());
			}
		});
	}

	public static int indexOf(int id) {
		for (int index = 0; index < list.size(); index++)
			if (list.get(index).getID_SV() == id)
				return index;

		return -1;
	}
	
	public static SinhVien sVOfMH(int id) {
		for (int i = 0; i < list.size(); i++) {
			if(list.get(i).getID_SV() == id) {
				return list.get(i);
			}
		}
		return null;
	}

}
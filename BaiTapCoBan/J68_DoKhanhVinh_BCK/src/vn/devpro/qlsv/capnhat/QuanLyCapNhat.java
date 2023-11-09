package vn.devpro.qlsv.capnhat;

import java.util.Scanner;


public class QuanLyCapNhat {
	static Scanner sc = new Scanner(System.in);

	public static void activate() {
		do {
			System.out.println("\n=========CAP NHAT THONG TIN HE THONG=========");
			System.out.println("Moi ban lua chon mot chuc nang cap nhat");
			System.out.println("\t1. Cap nhat danh sach sinh vien");
			System.out.println("\t2. Cap nhat danh sach mon hoc");
			System.out.println("\t3. Cap nhat danh sach diem");
			System.out.println("\t0. Quay lai");
			
			System.out.print("Lua chon cua ban: ");
			int chon = Integer.parseInt(sc.nextLine());
			
			
			switch(chon) {
			case 1: QuanLySinhVien.activate();; break;
			case 2: QuanLyMonHoc.activate();; break;
			case 3: QuanLyDiem.activate();; break;
			case 0:	return;
			default: System.out.println("Lua chon khong hop le!");
			}
		}while (true);
	}
}

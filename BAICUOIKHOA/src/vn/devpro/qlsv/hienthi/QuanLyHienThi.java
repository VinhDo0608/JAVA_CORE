package vn.devpro.qlsv.hienthi;

import java.util.Scanner;

public class QuanLyHienThi {

	static Scanner sc = new Scanner(System.in);

	public static void activate() {
		do {
			System.out.println("\t\t\t---------HIEN THI---------");
			System.out.println("\t1. Hien thi bang diem cua tat ca sinh vien theo tung sinh vien");
			System.out.println("\t2. Hien thi bang diem cua tat ca mon hoc theo tung mon hoc");
			System.out.println("\t0. Quay lai");
			
			System.out.print("Nhap lua chon cua ban: ");
			int chon = Integer.parseInt(sc.nextLine());

			switch (chon) {
			case 1:
				HienThiSinhVien.activate();
				break;
			case 2:
				HienThiMonHoc.activate();
				break;
			}
		} while (true);
	}
}

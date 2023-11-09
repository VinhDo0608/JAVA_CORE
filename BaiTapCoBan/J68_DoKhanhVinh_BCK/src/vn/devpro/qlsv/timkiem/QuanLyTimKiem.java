package vn.devpro.qlsv.timkiem;

import java.util.Scanner;

public class QuanLyTimKiem {
	
	static Scanner sc = new Scanner(System.in);

	public static void activate () {
		do {
			System.out.println("\n---------TIM KIEM THONG TIN HE THONG---------");
			System.out.println("\tChon loai thong tin tim kiem");
			System.out.println("\t1. Tim kiem thong tin sinh vien");
			System.out.println("\t2. Tim kiem thong tin mon hoc");
			System.out.println("\t0. Quay lai");

			System.out.print("Lua chon cua ban: ");
			int chon = Integer.parseInt(sc.nextLine());
			switch (chon) {
			case 1:
				TimKiemSinhVien.timKiemSinhVien();
				break;
			case 2:
				TimKiemMonHoc.timKiemMonHoc();
				break;
			case 0:
				return;
			default:
				System.out.println("Lua chon khong hop le!");
			}
		} while (true);
	}
}

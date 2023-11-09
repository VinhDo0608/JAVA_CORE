package vn.devpro.qlch.timkiem;

import java.util.Scanner;

public class QuanLyTimKiem {

	static Scanner sc = new Scanner(System.in);

	public static void thucThi() {
		do {
			System.out.println("\n---------TIM KIEM THONG TIN HE THONG---------");
			System.out.println("\tChon loai thong tin tim kiem");
			System.out.println("\t1. Tim kiem thong tin loai hang");
			System.out.println("\t2. Tim kiem thong tin hang hoa");
			System.out.println("\t3. Tim kiem thong tin khach hang");
			System.out.println("\t4. Tim kiem thong tin gio hang");
			System.out.println("\t0. Quay lai");

			System.out.print("Lua chon cua ban: ");
			int chon = Integer.parseInt(sc.nextLine());
			switch (chon) {
			case 1:
				TimKiemLoaiHang.timKiemLoaiHang();
				break;
			case 2:
				TimKiemHangHoa.timKiemHangHoa();
				break;
			case 3:
				TimKiemKhachHang.timKiemKhachHang();
				break;
			case 4:
				TimKiemGioHang.timKiemGioHang();
				break;
			case 0:
				return;
			default:
				System.out.println("Lua chon khong hop le!");
			}
		} while (true);
	}
}

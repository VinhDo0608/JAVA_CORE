package vn.devpro.qlch.qlcn;

import java.util.Scanner;

import vn.devpro.qlch.capnhat.QuanLyCapNhat;
import vn.devpro.qlch.capnhat.QuanLyHangHoa;
import vn.devpro.qlch.capnhat.QuanLyKhachHang;
import vn.devpro.qlch.capnhat.QuanLyLoaiHang;
import vn.devpro.qlch.qlbh.QuanLyBanHang;
import vn.devpro.qlch.thongke.ThongKeGioHang;
import vn.devpro.qlch.timkiem.QuanLyTimKiem;

public class QuanLyCuaHang {
	
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		QuanLyLoaiHang.init();
		QuanLyHangHoa.init();
		QuanLyKhachHang.init();
		
		do {
			System.out.println("\n=========CHUONG TRINH QUAN LY CUA HANG=========");
			System.out.println("Moi ban lua chon mot chuc nang quan ly");
			System.out.println("\t1. Cap nhat thong tin he thong");
			System.out.println("\t2. Quan ly ban hang");
			System.out.println("\t3. Thong ke gio hang");
			System.out.println("\t4. Tim kiem thong tin");
			System.out.println("\t0. Dong ung dung");
			
			System.out.print("Lua chon cua ban: ");
			int chon = Integer.parseInt(sc.nextLine());
			
			
			switch(chon) {
			case 1: QuanLyCapNhat.thucThi(); break;
			case 2: QuanLyBanHang.thucThi(); break;
			case 3: ThongKeGioHang.thongKe(); break;
			case 4: QuanLyTimKiem.thucThi(); break;
			case 0:
				System.out.println("Da dong chuong trinh!");
				System.exit(0);
			default: System.out.println("Lua chon khong hop le!");
			}
		}while (true);
	}

}

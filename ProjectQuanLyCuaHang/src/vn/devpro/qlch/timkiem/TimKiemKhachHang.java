package vn.devpro.qlch.timkiem;

import java.util.Scanner;

import vn.devpro.qlch.capnhat.HangHoa;
import vn.devpro.qlch.capnhat.KhachHang;
import vn.devpro.qlch.capnhat.QuanLyHangHoa;
import vn.devpro.qlch.capnhat.QuanLyKhachHang;

public class TimKiemKhachHang {
	
	//Tim theo ma khach hang
	//Tim theo ten khach hang
	
static Scanner sc = new Scanner(System.in);
	
	public static void timKiemKhachHang() {
	do {
		System.out.println("\n---------TIM KIEM KHACH HANG---------");
		System.out.println("\tLua chon tieu chi tim kiem:");
		System.out.println("\t1. Tim kiem theo ma khach hang");
		System.out.println("\t2. Tim kiem theo ten khach hang");
		System.out.println("\t0. Quay lai");
		
		System.out.print("Lua chon cua ban: ");
		int chon = Integer.parseInt(sc.nextLine());
		switch (chon) {
		case 1: timKiemTheoMa(); break;
		case 2: timKiemTheoTen(); break;
		case 0: return;
		default: System.out.println("Lua chon khong hop le!");
		}
	}while(true);
	}

	private static void timKiemTheoMa() {
		System.out.print("Nhap ma khach hang muon tim: ");
		int id = Integer.parseInt(sc.nextLine());
		
		int index = QuanLyKhachHang.indexOf(id);
		
		if(index == -1) {
			System.out.println("Khong tim thay ket qua nao!");
		} else {
			System.out.println("Ket qua: ");
			QuanLyKhachHang.getList().get(index).display();
		}
	}

	private static void timKiemTheoTen() {
		System.out.print("Nhap ten khach hang muon tim: ");
		String name = sc.nextLine();

		System.out.println("Ket qua tim kiem:");
		int dem = 0;
		for (KhachHang x : QuanLyKhachHang.getList()) {
			if (x.getName().trim().compareToIgnoreCase(name.trim()) == 0) {
				x.display();
				dem++;
			}
		}
		if (dem == 0) {
			System.out.println("Khong tim thay ket qua nao!");
		}
	}
}

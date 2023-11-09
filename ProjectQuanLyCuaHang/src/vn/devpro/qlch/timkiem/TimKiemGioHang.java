package vn.devpro.qlch.timkiem;

import java.util.Scanner;

import vn.devpro.qlch.capnhat.LoaiHang;
import vn.devpro.qlch.capnhat.QuanLyKhachHang;
import vn.devpro.qlch.capnhat.QuanLyLoaiHang;
import vn.devpro.qlch.qlbh.QuanLyBanHang;

public class TimKiemGioHang {
	
	//Tim theo ma gio hang
	//Tim theo ma khach hang
	
static Scanner sc = new Scanner(System.in);
	
	public static void timKiemGioHang() {
	do {
		System.out.println("\n---------TIM KIEM GIO HANG---------");
		System.out.println("\tLua chon tieu chi tim kiem:");
		System.out.println("\t1. Tim kiem theo ma gio hang");
		System.out.println("\t2. Tim kiem theo ma khach hang");
		System.out.println("\t0. Quay lai");
		
		System.out.print("Lua chon cua ban: ");
		int chon = Integer.parseInt(sc.nextLine());
		switch (chon) {
		case 1: timKiemTheoMaGH(); break;
		case 2: timKiemTheoMaKH(); break;
		case 0: return;
		default: System.out.println("Lua chon khong hop le!");
		}
	}while(true);
	}

	private static void timKiemTheoMaGH() {
		System.out.print("Nhap ma gio hang muon tim: ");
		int id = Integer.parseInt(sc.nextLine());
		
		int index = QuanLyBanHang.indexOf(id);
		
		if(index == -1) {
			System.out.println("Khong tim thay ket qua nao!");
		} else {
			System.out.println("Ket qua: ");
			QuanLyBanHang.getList().get(index).display();
		}
	}

	private static void timKiemTheoMaKH() {
		System.out.print("Nhap ma khach hang muon tim: ");
		int id = Integer.parseInt(sc.nextLine());
		
		int index = QuanLyKhachHang.indexOf(id);
		
		System.out.println("Ket qua tim kiem:");
		if(index == -1) {
			System.out.println("Khong tim thay ket qua nao!");
		} else {
			System.out.println("Ket qua: ");
			QuanLyBanHang.getList().get(index).display();
		}
	}
}

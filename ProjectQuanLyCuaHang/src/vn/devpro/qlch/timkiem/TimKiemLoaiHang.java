package vn.devpro.qlch.timkiem;

import java.util.Scanner;

import vn.devpro.qlch.capnhat.LoaiHang;
import vn.devpro.qlch.capnhat.QuanLyLoaiHang;

public class TimKiemLoaiHang {
	
	//Tim theo ma loai hang
	//Tim theo ten loai hang
	static Scanner sc = new Scanner(System.in);
	
	public static void timKiemLoaiHang() {
	do {
		System.out.println("\n---------TIM KIEM LOAI HANG---------");
		System.out.println("\tLua chon tieu chi tim kiem:");
		System.out.println("\t1. Tim kiem theo ma loai hang");
		System.out.println("\t2. Tim kiem theo ten loai hang");
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
		System.out.print("Nhap ma loai hang muon tim: ");
		int id = Integer.parseInt(sc.nextLine());
		
		int index = QuanLyLoaiHang.indexOf(id);
		
		if(index == -1) {
			System.out.println("Khong tim thay ket qua nao!");
		} else {
			System.out.println("Ket qua: ");
			QuanLyLoaiHang.getList().get(index).display();
		}
	}

	private static void timKiemTheoTen() {
		System.out.print("Nhap ten loai hang muon tim: ");
		String name = sc.nextLine();

		System.out.println("Ket qua tim kiem:");
		int dem = 0;
		for (LoaiHang x : QuanLyLoaiHang.getList()) {
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

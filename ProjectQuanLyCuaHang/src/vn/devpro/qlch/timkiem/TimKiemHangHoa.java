package vn.devpro.qlch.timkiem;

import java.util.Scanner;

import vn.devpro.qlch.capnhat.HangHoa;
import vn.devpro.qlch.capnhat.LoaiHang;
import vn.devpro.qlch.capnhat.QuanLyHangHoa;
import vn.devpro.qlch.capnhat.QuanLyLoaiHang;

public class TimKiemHangHoa {

	//Tim theo ma hang hoa
	//Tim theo ten hang hoa
	static Scanner sc = new Scanner(System.in);
	
	public static void timKiemHangHoa() {
	do {
		System.out.println("\n---------TIM KIEM HANG HOA---------");
		System.out.println("\tLua chon tieu chi tim kiem:");
		System.out.println("\t1. Tim kiem theo ma hang hoa");
		System.out.println("\t2. Tim kiem theo ten hang hoa");
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
		System.out.print("Nhap ma hang hoa muon tim: ");
		int id = Integer.parseInt(sc.nextLine());
		
		int index = QuanLyHangHoa.indexOf(id);
		
		if(index == -1) {
			System.out.println("Khong tim thay ket qua nao!");
		} else {
			System.out.println("Ket qua: ");
			QuanLyHangHoa.getList().get(index).display();
		}
	}

	private static void timKiemTheoTen() {
		System.out.print("Nhap ten hang hoa muon tim: ");
		String name = sc.nextLine();

		System.out.println("Ket qua tim kiem:");
		int dem = 0;
		for (HangHoa x : QuanLyHangHoa.getList()) {
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

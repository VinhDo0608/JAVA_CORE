package vn.devpro.bai7.baitap2;

import java.util.Scanner;

public class QuanLySanPham {
	
	public static void nhapDs(SanPham[] list) {
		System.out.println("Nhap danh sach san pham");
		for (int i = 0; i < list.length; i++) {
			System.out.println("Nhap thong tin san pham thu " + (i + 1));
			list[i] = new HangDienTu();
			list[i].input();
		}
	}
	
	public static void hienThiDs(SanPham[] list) {
		System.out.println("\n-------------DANH SACH SAN PHAM-------------");
		System.out.printf("%3s %-10s %-25s %-10s %-9s %-13s%n",
				"STT", "Ma SP", "Ten san pham", "Ngay SX", "Cong suat", "Gia ban");
		int stt = 1;
		for (SanPham x : list) {
			System.out.printf("%3d ", stt++);
			x.display();
		}
	}

	public static void hienThiHdtGiaThapNhat(HangDienTu[] list) {
		//Tim gia thap nhat trong danh sach
		double min = list[0].getPrice();
		for (HangDienTu x : list) {
			if (x.getPrice() < min) {
				min = x.getPrice();
			}
		}
		
		System.out.println("\n-------------DANH SACH SAN PHAM GIA THAP NHAT-------------");
		System.out.printf("%3s %-10s %-25s %-10s %-9s %-13s%n",
				"STT", "Ma SP", "Ten san pham", "Ngay SX", "Cong suat", "Gia ban");
		int stt = 1;
		for (HangDienTu x : list) {
			if (x.getPrice() == min) {
				System.out.printf("%3d ", stt++);
				x.display();
			}
		}
	}
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap so luong san pham: ");
//		SanPham[] list = new HangDienTu[Integer.parseInt(sc.nextLine())];
		HangDienTu[] lists = new HangDienTu[Integer.parseInt(sc.nextLine())];
		nhapDs(lists);
		hienThiDs(lists);
		hienThiHdtGiaThapNhat(lists);
	}

}

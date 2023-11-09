package vn.devpro.baitap4;

import java.util.Scanner;

public class HangHoa {
	String ten;
	int soLuong;
	double donGia;
	
	static Scanner sc = new Scanner(System.in);
	
	public static HangHoa nhap() {
		HangHoa hH = new HangHoa();
		System.out.print("\tNhap ten hang: ");
		hH.ten = sc.nextLine();
		System.out.print("\tNhap so luong: ");
		hH.soLuong = Integer.parseInt(sc.nextLine());
		System.out.print("\tNhap don gia: ");
		hH.donGia = Double.parseDouble(sc.nextLine());
		
		return hH;
	}
	
	public static double thanhTien(HangHoa hH) {
		return hH.donGia * hH.soLuong;
	}
	
	public static void xuat(HangHoa hH) {
		System.out.printf("%-30s %15d %15.3f %19.3f%n",
				hH.ten, hH.soLuong, hH.donGia, thanhTien(hH));
	}
}

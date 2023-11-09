package vn.devpro.baitap4;

import java.util.Scanner;

public class HoaDon {
	String ma;
	String hoTen;
	String ngMua;
	
	static int soHD = 1001;
	static Scanner sc = new Scanner(System.in);
	
	HangHoa hH1 = new HangHoa();
	HangHoa hH2 = new HangHoa();
	HangHoa hH3 = new HangHoa();
	HangHoa hH4 = new HangHoa();
	HangHoa hH5 = new HangHoa();
	
	public static void nhap(HoaDon hd) {
		hd.ma = "HD" + soHD++;
		System.out.print("Nhap ho ten khach hang: ");
		hd.hoTen = sc.nextLine();
		System.out.print("Nhap ngay mua (Ngay/Thang/Nam): ");
		hd.ngMua = sc.nextLine();
		System.out.println("Nhap thong tin mat hang thu nhat:");
		hd.hH1 = HangHoa.nhap();
		System.out.println("Nhap thong tin mat hang thu hai:");
		hd.hH2 = HangHoa.nhap();
		System.out.println("Nhap thong tin mat hang thu ba:");
		hd.hH3 = HangHoa.nhap();
		System.out.println("Nhap thong tin mat hang thu tu:");
		hd.hH4 = HangHoa.nhap();
		System.out.println("Nhap thong tin mat hang thu nam:");
		hd.hH5 = HangHoa.nhap();
	}
	
	public static double tongTien(HoaDon hd) {
		return hd.hH1.thanhTien(hd.hH1) + hd.hH2.thanhTien(hd.hH2) + hd.hH3.thanhTien(hd.hH3) + hd.hH4.thanhTien(hd.hH4) + hd.hH4.thanhTien(hd.hH4);
	}
	
	public static double tienPT(HoaDon hd) {
		return tongTien(hd) + tongTien(hd)*0.1;
	}
	
	public static void xuat(HoaDon hd) {
		System.out.println("\n\tTHONG TIN HOA DON");
		System.out.println("\tMa hoa don: " + hd.ma);
		System.out.println("\tTen khach hang: " + hd.hoTen);
		System.out.println("\tNgay mua: " + hd.ngMua);
		System.out.println("DANH SACH HANG HOA DA MUA");
		System.out.printf("%-30s %15s %15s %19s%n", "Ten hang hoa", "So luong", "Don gia", "Thanh tien");
		HangHoa.xuat(hd.hH1);
		HangHoa.xuat(hd.hH2);
		HangHoa.xuat(hd.hH3);
		HangHoa.xuat(hd.hH4);
		HangHoa.xuat(hd.hH5);
	}
}

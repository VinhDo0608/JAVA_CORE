package vn.devpro.baitap2;

import java.util.Scanner;

public class QLCD {
	
	static Scanner sc = new Scanner(System.in);
	
	public static CONGDAN nhap() {
		CONGDAN cd = new CONGDAN();
		System.out.print("Nhap can cuoc cong dan: ");
		cd.CCCD = sc.nextLine();
		System.out.print("Nhap ho dem: ");
		cd.hoDem = sc.nextLine();
		System.out.print("Nhap ten: ");
		cd.ten = sc.nextLine();
		System.out.print("Nhap ngay sinh (Ngay/Thang/Nam): ");
		cd.ngSinh = sc.nextLine();
		System.out.print("Nhap gioi tinh: ");
		cd.gioiTinh = sc.nextLine();
		System.out.print("Nhap dia chi: ");
		cd.diaChi = sc.nextLine();
		System.out.print("Nhap so dien thoai: ");
		cd.sdt = sc.nextLine();
		
		return cd;
	}
	
	public static void xuat(CONGDAN cd) {
		System.out.printf("%12s %-25s %9s %-9s %-30s %10s%n",
				cd.CCCD, cd.hoDem + " " + cd.ten, cd.ngSinh, cd.gioiTinh, cd.diaChi, cd.sdt);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Nhap thong tin cong dan thu nhat: ");
		CONGDAN cd1 = nhap();
		
		System.out.println("Nhap thong tin cong dan thu hai: ");
		CONGDAN cd2 = nhap();
		
		System.out.println("Nhap thong tin cong dan thu ba: ");
		CONGDAN cd3 = nhap();
		
		
		System.out.println("\n\tTHONG TIN BA CONG DAN VUA NHAP");
		System.out.printf("%-12s %-25s %-10s %-9s %-30s %-13s%n",
				"CCCD", "Ho va ten", "Ngay sinh", "Gioi tinh", "Dia chi", "So dien thoai");
		xuat(cd1);
		xuat(cd2);
		xuat(cd3);
	}

}
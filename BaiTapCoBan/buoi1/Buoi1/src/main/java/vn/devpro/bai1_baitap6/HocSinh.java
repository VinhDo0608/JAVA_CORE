package vn.devpro.bai1_baitap6;

import java.util.Scanner;

public class HocSinh {
	//Khai bao thuoc tinh cua lop
	String hoDem;
	String ten;
	int ngay, thang , nam;
	String gioiTinh;
	double diemTB;
	String daoDuc;

	
	//Viet cac phuong thuc xu ly doi tuong hoc sinh
	//Phuong thuc nhap du lieu cho doi tương hoc sinh
	public void nhap() {
		Scanner sc = new Scanner(System.in);
		System.out.print("\tNhap ho dem: ");
		hoDem = sc.nextLine();
		System.out.print("\tNhap ten: ");
		ten = sc.nextLine();
		System.out.print("\tNhap ngay: ");
		ngay = sc.nextInt();
		System.out.print("\tNhap thang: ");
		thang = sc.nextInt();
		System.out.print("\tNhap nam: ");
		nam = sc.nextInt();
		sc.nextLine();
		System.out.print("\tNhap gioi tinh: ");
		gioiTinh = sc.nextLine();
		System.out.print("\tNhap dtb: ");
		diemTB = sc.nextDouble();
		sc.nextLine();
		System.out.print("\tNhap xep loai dao duc: ");
		daoDuc = sc.nextLine();
	}
	
	//Phuong thuc hien thi thong tin
	public void hienThi() {
		System.out.printf("%-25s %02d-%02d-%4d %-9s %7.2f %-10s%n", 
				hoDem + " " + ten, ngay, thang, nam, gioiTinh, diemTB, daoDuc);
	}
}

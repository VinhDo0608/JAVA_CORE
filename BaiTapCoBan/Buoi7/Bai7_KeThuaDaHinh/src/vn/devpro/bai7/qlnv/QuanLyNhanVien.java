package vn.devpro.bai7.qlnv;

import java.util.Scanner;

public class QuanLyNhanVien {
	
	static Scanner sc = new Scanner(System.in);
	
	//Nhap danh sach nhan vien
	public static void nhapDs(NhanVien[] list) {
		System.out.println("\n------------NHAP DANH SACH NHAN VIEN------------");
		for (int i = 0; i < list.length; i++) {
			System.out.println("Nhap thong tin nhan vien thu " + (i + 1));
			System.out.println("Chon loai nhan vien (1 - NVVP, 2 - NVSX): ");
			int chon = Integer.parseInt(sc.nextLine());
			if (chon == 1) {
				list[i] = new NhanVienVanPhong();
			}
			else if (chon == 2){
				list[i] = new NhanVienSanXuat();
			}
			else {
				System.out.println("Lua chon khong hop le");
				i--;
				continue;
			}
			list[i].nhap();
		}
	}
	//Ham hien thi danh sach nhan vien
	public static void hienThiDs(NhanVien[] list) {
		System.out.println("\n-----------DANH SACH NHAN VIEN--------------");
		for (NhanVien x : list)
			x.hienThi();
	}
	
	//Tinh tong tien luong cua dsnv
	public static double tongLuong(NhanVien[] list) {
		double t = 0;
		for (NhanVien x : list)
			t += x.luong();
		return t;
	}

	public static void main(String[] args) {
		System.out.print("Cho biet so luong nhan vien: ");
		NhanVien[] list = new NhanVien[Integer.parseInt(sc.nextLine())];
		nhapDs(list);
		hienThiDs(list);
		System.out.printf("\nTong luong nhan vien: %,.2f", tongLuong(list));
	}

}

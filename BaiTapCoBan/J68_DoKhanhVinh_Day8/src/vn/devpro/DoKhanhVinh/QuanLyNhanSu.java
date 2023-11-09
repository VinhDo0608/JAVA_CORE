package vn.devpro.DoKhanhVinh;

import java.util.Iterator;
import java.util.Scanner;

public class QuanLyNhanSu {
private static int Id = 10001;
	
	private NhanSu[] nhanSu = new NhanSu[] {
			new CanBo(Id++,	"Nguyen Van", 	"A", 	1990, "Nam", 	DanhSachPhong.getPhongs()[0].getMaPhong(),		"Giam doc" , 	1.5, "B"),
			
			new CongNhan(Id++,	"Hoang Van", 	"B",	1991, "Nam",	DanhSachXuong.getXuongSXs()[1].getMaXuong(), 	"Phu ho", 		22),
			
			new CanBo(Id++,		"Vu Van", 	"c", 1992, "Nam", 	DanhSachPhong.getPhongs()[3].getMaPhong(),		"Truong phong", 2.7, "C"),
			
			new CongNhan(Id++,	"Nguyen Thu", 	"D",1999, "Nu",		DanhSachXuong.getXuongSXs()[2].getMaXuong(), 	"Sua chua", 	15),
			
			new CanBo(Id++,		"Tran Khanh", 	"Minh", 1991, "Nam", 	DanhSachPhong.getPhongs()[1].getMaPhong(),		"Quan ly" , 	3.7, "A"),
			
			new CongNhan(Id++,	"Nguyen Van", 	"Trieu",	1995, "Nam",	DanhSachXuong.getXuongSXs()[3].getMaXuong(), 	"Xay dung", 	18),
			
			new CanBo(Id++,		"Nguyen Thu", 	"Thuy", 1994, "Nu", 	DanhSachPhong.getPhongs()[0].getMaPhong(),		"Truong Phong", 1.9, "C"),
			
			new CongNhan(Id++,	"Hoang Thanh", 	"Lan",	1997, "Nu",		DanhSachXuong.getXuongSXs()[2].getMaXuong(), 	"Van chuyen", 	21),
	};
	
	
	
	public void xuat() {
		System.out.println("\t\t\t----------DANH SACH NHAN SU----------");
		System.out.printf("%-3s %10s %-20s %8s %-10s %-12s %-15s %-15s %8s %8s %-10s %-15s%n",
							"STT", "MaNS", "Ho va ten", "Nam sinh", "Gioi tinh", "Noi lam viec","Chuc vu", "Cong Viec", "He so" , "So ngay", "Xep loai", "Luong");
		int stt = 1;
		for (NhanSu x : nhanSu) {
			System.out.printf("%-3d ", stt++);
			x.xuat();
		}
	}
	
	public void hienThiCnNam() {
		System.out.printf("%-3s %10s %-20s %8s %-10s %-12s %-15s %-15s %8s %8s %-10s %-15s%n",
				"STT", "MaNS", "Ho va ten", "Nam sinh", "Gioi tinh", "Noi lam viec"," ", "Cong Viec", " " , "So ngay", " ", "Luong");
		int stt = 1;
		for (NhanSu x : nhanSu) {
			if( x instanceof CongNhan && x.getGioiTinh().equals("Nam")) {
				System.out.printf("%-3d ", stt++);
				x.xuat();
			}
		}
	}
	
	public void hienThiCbNu() {
		System.out.printf("%-3s %10s %-20s %8s %-10s %-12s %-15s %-15s %8s %8s %-10s %-15s%n",
				"STT", "MaNS", "Ho va ten", "Nam sinh", "Gioi tinh", "Noi lam viec","Chuc vu", " ", "He so" , " ", "Xep loai", "Luong");
		int stt = 1;
		for (NhanSu x : nhanSu) {
			if( x instanceof CanBo && x.getGioiTinh().equals("Nu")) {
				System.out.printf("%-3d ", stt++);
				x.xuat();
			}
		}
	}
	
	public void canBoLuongMax() {
		double max = 0;
		for (NhanSu x : nhanSu) 
			if(x instanceof CanBo && x.luong() >= max) 
				max = x.luong();
		System.out.printf("%-3s %10s %-20s %8s %-10s %-12s %-15s %-15s %8s %8s %-10s %-15s%n",
				"STT", "MaNS", "Ho va ten", "Nam sinh", "Gioi tinh", "Noi lam viec","Chuc vu", " ", "He so" , " ", "Xep loai", "Luong");
		int stt = 1;
		for (NhanSu x : nhanSu)
			if(x.luong() == max) {
				System.out.printf("%-3d ", stt++);
				x.xuat();
			}
	}
	
	public void congNhanLuongMin() {
		double min = 0;
		int index = 0;
		for (int i = 0; i < nhanSu.length; i++) {
			if (nhanSu[i] instanceof CongNhan) {
				min = nhanSu[i].luong();
				index = i;
				break;
			}
		}
		System.out.printf("%-3s %10s %-20s %8s %-10s %-12s %-15s %-15s %8s %8s %-10s %-15s%n",
				"STT", "MaNS", "Ho va ten", "Nam sinh", "Gioi tinh", "Noi lam viec"," ", "Cong Viec", " " , "So ngay", " ", "Luong");
		int stt = 1;
		for (int i = index + 1; i < nhanSu.length; i++) {
			if(nhanSu[i] instanceof CongNhan && nhanSu[i].luong() <= min) {
				min = nhanSu[i].luong();
			}
		}
		for (NhanSu nhanSu2 : nhanSu) {
			if (nhanSu2.luong() == min) {
				System.out.printf("%-3d ", stt++);
				nhanSu2.xuat();
			}
		}
	}
	
	public void tongLuongCanBo() {
		double tong = 0;
		int stt = 1;
		for (NhanSu x : nhanSu) 
			if(x instanceof CanBo) {
				tong += x.luong();
			}
		System.out.printf("Tong luong can bo la: %,.3f", tong);
	}
	
	public void tongLuongCongNhan() {
		double tong = 0;
		int stt = 1;
		for (NhanSu x : nhanSu) 
			if(x instanceof CongNhan) {
				tong += x.luong();
			}
		System.out.printf("Tong luong cong nhan la: %,.3f", tong);
	}
	
	public void chuyenCnXuongCuoi() {
		int right = nhanSu.length - 1;
		for(int i = 0 ; i < nhanSu.length; i++) {
			if(right == i)
				break;
			else {
				if(nhanSu[i] instanceof CongNhan) {
					if(nhanSu[right] instanceof CanBo) {
						NhanSu tmp = nhanSu[i];
						nhanSu[i] = nhanSu[right];
						nhanSu[right] = tmp;
					}
					else {
						right--;
						i--;
					}
				}
			}
		}
	}
	
	public void sapXepTen() {
		for(int i = 0 ; i < nhanSu.length - 1; i++)
			for(int j = i + 1; j < nhanSu.length; j++)
				if(nhanSu[i].getTen().compareToIgnoreCase(nhanSu[j].getTen()) > 0) {
					NhanSu tmp = nhanSu[i];
					nhanSu[i] = nhanSu[j];
					nhanSu[j] = tmp;
				}
	}
	
	public static void main(String[] args) {
		QuanLyNhanSu quanLyNhanSu = new QuanLyNhanSu();	
		quanLyNhanSu.xuat();
		System.out.println("\n---------Danh sach can bo nam---------");
		quanLyNhanSu.hienThiCnNam();
		System.out.println("\n---------Danh sach can bo nu---------");
		quanLyNhanSu.hienThiCbNu();
		System.out.println("\n---------Can bo luong cao nhat---------");
		quanLyNhanSu.canBoLuongMax();
		System.out.println("\n---------Cong nhan luong thap nhat---------");
		quanLyNhanSu.congNhanLuongMin();
		System.out.println("\n---------Tong luong can bo---------");
		quanLyNhanSu.tongLuongCanBo();
		System.out.println("\n\n---------Tong luong cong nhan---------");
		quanLyNhanSu.tongLuongCongNhan();
		
	}
}

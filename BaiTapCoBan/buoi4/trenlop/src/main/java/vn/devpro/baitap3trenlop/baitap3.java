package vn.devpro.baitap3trenlop;

import java.util.Scanner;

public class baitap3 {
	
	static Scanner sc = new Scanner(System.in);
	
	static String[] name = {"Tung", "Cuc", "Truc", "Mai", "Truong", "Hung", "Binh", "Bich", "Phuong", "Trang", "Tu", "Huong"};
	
	static int[] kWh = {256, 1003, 564, 986, 1231, 721, 306, 562, 452, 908, 680, 850};

	public static void main(String[] args) {
		do {
		System.out.println("\n=====CHUONG TRINH QUAN LY TIEN======");
		System.out.println("Chon 1 chuc nang quan ly");
		System.out.println("\t1. Hien thi dnah sach ");
		System.out.println("\t2. Hien thi 3 ho GD su dung dien nhieu nhat");
		System.out.println("\t3. Hien thi cac ho GD co chu ho ten 'Truong'");
		System.out.println("\t4. Sap xep danh sach theo ten");
		System.out.println("\t5. Sap xep theo so kWh dien tang dan");
		System.out.println("\t0. Thoat");
		
		System.out.print("Nhap lua chon cua ban: ");
		int chon = Integer.parseInt(new Scanner(System.in).nextLine());
		switch(chon) {
		case 1: 
			hienThiDs(); 
			break;
		case 2:
			hienThi3Gd();
			break;
		case 3:
			hienThiGdTruong();
			break;
		case 4:
			sapTheoTen();
			System.out.println("Da sap xem theo danh sach, bam phim 1 de xem lai");
			break;
		case 5:
			sapXepTheoKWh();
			System.out.println("Da sap xem theo danh sach, bam phim 1 de xem lai");
			break;
		case 0:
			System.out.println("Da thoat chuong trinh!");
			System.exit(0);
		default:
			System.out.println("Lua chon khong hop le!");
			}
		}while(true);
	}
	
	public static double tienDien(double kwh) {
		double t = 0;
		if (kwh <= 50) {
			t = kwh * 1678;
		}
		else if (kwh <= 100) {
			t = 50 * 1678 + (kwh - 50) * 1734;
		}
		else if (kwh <= 200) {
			t = 50 * 1678 + 50 * 1734 + (kwh - 100) * 2014;
		}
		else if (kwh <= 300) {
			t = 50 * 1678 + 50 * 1734 + 100 * 2014 + 
					(kwh - 200) * 2536;
		}
		else if (kwh <= 400) {
			t = 50 * 1678 + 50 * 1734 + 100 * 2014 + 
					100 * 2536 + (kwh - 300) * 2834;
		}
		else { // tren 400 kwh
			t = 50 * 1678 + 50 * 1734 + 100 * 2014 + 
				100 * 2536 + 100 * 2834 + (kwh - 400) * 2927;
		}
		return t * 1.08; //8% VAT
	}

	private static void hienThiDs() {
		// TODO Auto-generated method stub
		System.out.println("\n---------DANH SACH HO GD SU DUNG DIEN---------");
		System.out.printf("%3s %-7s %6s %15s%n",
				"STT", "Ten", "So kWh", "Thanh Tien");
		for (int i = 0; i < name.length; i++) {
			System.out.printf("%3d %-7s %6d %,15.3f%n", i+1, name[i], kWh[i], tienDien(kWh[i]));
		}
	}

	private static void hienThi3Gd() {
		
	}

	private static void hienThiGdTruong() {
		
	}

	private static void sapTheoTen() {
		
	}

	private static void sapXepTheoKWh() {
		
	}
}

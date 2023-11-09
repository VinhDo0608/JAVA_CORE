package vn.devpro.baitap2;

import java.util.Scanner;

import vn.devpro.baitap3.MarkTable;
import vn.devpro.baitap3.Student;
import vn.devpro.baitap3.Subject;

public class Manager {
	static Vouchers vou = new Vouchers(new Customer("KH001", "Bui Van An", "0378566329", "21 Quang Trung, Ha Dong, Ha Noi"),
			new Goods[] { new Goods("0503111", "Laptop", 3, 14990000),
							new Goods("0503112", "Chuot khong day", 5, 350000), 
							new Goods("0503112", "De tan nhiet", 4, 500000),
							new Goods("0503114", "Ban phim co", 3, 550000), 
							new Goods("0503115", "Lot chuot", 3, 150000) 
							});

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		do {
			System.out.println("\n---------CHUONG TRINH QUAN LY BAN HANG---------");
			System.out.println("Lua chon 1 chuc nang:");
			System.out.println("\t1. Hien thi phieu mua hang");
			System.out.println("\t2. Sua thong tin khach hang");
			System.out.println("\t3. Sua thong tin hang hoa");
			System.out.println("\t0. Thoat");

			System.out.print("Lua chon cua ban: ");
			int chon = Integer.parseInt(sc.nextLine());

			switch (chon) {
			case 1:
				vou.display();
				break;
			case 2:
				vou.updateInfoCus();;
				break;
			case 3:
				vou.updateGoods();;
				break;
			case 0:
				System.out.println("Thoat kho ung dung!");
				return;
			default:
				System.out.println("Lua chon khong hop le!");
			}
		} while (true);

	}
}

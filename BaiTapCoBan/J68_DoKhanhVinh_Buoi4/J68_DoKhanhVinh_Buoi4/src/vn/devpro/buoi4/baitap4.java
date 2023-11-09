package vn.devpro.buoi4;

import java.util.Scanner;

public class baitap4 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		do {
			System.out.println("\n------CHUONG TRINH GIAI QUYET CAC BAI TOAN------");
			System.out.println("Hay chon bai toan can giai quyet");
			System.out.println("\t1. Kiem tra so nguyen to bam phim 1");
			System.out.println("\t2. Tong cua n so nguyen dau tien bam phim 2");
			System.out.println("\t3. In ra bang cuu chuong tu 2 den 10 bam phim 3");
			System.out.println("\t4. Tinh gan dung sin(x) bam phim 4");
			System.out.println("\t5. In day n so fibonaccii bam phim 5");
			System.out.println("\t0. Thoat chuong trinh bam phim 0");
			
			System.out.print("Lua chon cua ban: ");
			int chon = Integer.parseInt(new Scanner(System.in).nextLine());
			
			switch (chon) {
			case 1:
				baitoan1.init();
				break;
			case 2: 
				baitoan2.init();
				break;
			case 3: 
				baitoan3.init();
				break;
			case 4: 
				baitoan4.init();
				break;
			case 5:
				baitoan5.init();
				break;
			case 0: 
				System.out.println("Da thoat chuong trinh");
				System.exit(0);
			default: System.out.println("Lua chon khong hop le");
			}
		}	while (true);
	}
}

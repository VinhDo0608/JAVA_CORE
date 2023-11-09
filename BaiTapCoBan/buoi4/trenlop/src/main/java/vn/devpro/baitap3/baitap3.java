package vn.devpro.baitap3;

import java.util.Scanner;

public class baitap3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		do {
			System.out.println("\n------CHUONG TRINH GIAI QUYET CAC BAI TOAN------");
			System.out.println("Hay chon bai toan can giai quyet");
			System.out.println("\t1. Doc so bam phim 1");
			System.out.println("\t2. Tinh gia tri bieu thuc bam phim 2");
			System.out.println("\t3. Tinh tien mua gao phim 3");
			System.out.println("\t4. Bai toan 3 diem bam phim 4");
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
			case 0: 
				System.out.println("Da thoat chuong trinh");
				System.exit(0);
			default: System.out.println("Lua chon khong hop le");
			}
		}	while (true);
	}

}

package vn.devpro.baitap1;

import java.util.Scanner;

public class baitap01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		do {
			System.out.println("\n------CHUONG TRINH GIAI QUYET CAC BAI TOAN------");
			System.out.println("Hay chon bai toan can giai quyet");
			System.out.println("\t1. Giai phuong trinh bac 2 bam phim 1");
			System.out.println("\t2. Xep loai hoc tap hoc sinh bam phim 2");
			System.out.println("\t3. Tinh luong nhan vien bam phim 3");
			System.out.println("\t4. Tinh so ngay trong nam bam phim 4");
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
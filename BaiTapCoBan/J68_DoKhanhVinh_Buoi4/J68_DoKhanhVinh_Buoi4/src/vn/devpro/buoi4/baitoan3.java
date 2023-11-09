package vn.devpro.buoi4;

public class baitoan3 {
	public static void xuatBCC() {
		for (int i = 2; i <= 10; i++) {
			System.out.printf("Bang cuu chuong %d%n",i);
			for (int j = 1; j <= 10; j++) {
				int t = i*j;
				System.out.println(i + " x " + j + " = " + t);
			}
		}
	}
	
	public static void init() {
		xuatBCC();
	}
}

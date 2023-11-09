package vn.devpro.buoi4;

import java.util.Scanner;

public class baitoan2 {
	
	static Scanner sc = new Scanner(System.in);

	public static boolean checkPrime(int n) {

        if (n < 2) {
            return false;
        }

        int s = (int) Math.sqrt(n);
        for (int i = 2; i <= s; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
	
	public static void init() {
		System.out.print("Nhap n: ");
		int n = sc.nextInt();
		int sum = 0;
		int dem = 0;
		for (int i = 0;; i++) {
			if (checkPrime(i)) {
				sum+=i;
				dem++;
			}
			if (dem == n)	break;
		}
		System.out.println("Tong cua " + n + " so nguyen to dau tien la: " + sum);
	}
}

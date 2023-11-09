package vn.devpro.buoi4;

import java.util.Scanner;

public class baitoan1 {
	
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
		if(checkPrime(n)) {
			System.out.printf("%d la so nguyen to",n);
		} else {
			System.out.printf("%d khong phai so nguyen to",n);
		}
	}
	
}		
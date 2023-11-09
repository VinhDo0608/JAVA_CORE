package vn.devpro.tiendien;

import java.util.Scanner;

public class TDSH {
	
	public static double inPut() {
		System.out.print("Nhap so kWh dien tieu thu: ");
		return new Scanner(System.in).nextDouble();
	}
	
	public static double elecBill(double m) {
		double b = 0;
		if(m <= 50) {
			b = m*1678;
		} else if(m <= 100) {
			b = 50*1678 + (m-50)*1734;
		} else if (m <= 200) {
			b = 50*1678 + 50*1734 +(m-100)*2014;
		} else if(m <= 300) {
			b = 50*1678 + 50*1734 +100*2014 + (m - 200)*2536;
		} else if(m <= 400) {
			b = 50*1678 + 50*1734 +100*2014 + 100*2536 + (m-300)*2834;
		} else {
			b = 50*1678 + 50*1734 +100*2014 + 100*2536 + 100*2834 +(m-400)*2927;
		}
		return b*1.1;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double a = inPut();
		System.out.printf("Ban su dung %.1f kWh%n", a);
		System.out.printf("So tien phai tra la: %,12.1f",elecBill(a));
	}

}

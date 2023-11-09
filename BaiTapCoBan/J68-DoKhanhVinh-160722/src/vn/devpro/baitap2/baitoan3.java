package vn.devpro.baitap2;

import java.util.Scanner;

public class baitoan3 {
	
	static Scanner sc = new Scanner(System.in);
	
	public static double tinhTien(double a) {
		double s = 0;
		
		if (a <= 50){
			s = a*14000;
		} else if(a <= 75) {
			s = 50*14000 + (a-50)*13500;
		} else if (a <= 90) {
			s = 50*14000 + 25*13500 + (a-25)*13250;
		} else if (a <= 105) {
			s = 50*14000 + 25*13500 + 25*13250 + (a-90)*13000;	
		} else{
			s = 50*14000 + 25*13500 + 25*13250 + 25*13000 + (a-105)*12500;
		}
		return s;
	}
	
	public static void init() {
		System.out.print("Nhap so gao muon mua: ");
		double a = Double.parseDouble(sc.nextLine());
		if (a<0) {
			System.out.println("So gao khong hop le!");
			return;
		}
		System.out.printf("So tien phai tra la: %.3f", tinhTien(a));
	}
}	

package vn.devpro.baitap2;

import java.util.Scanner;

public class baitoan4 {
	
	static Scanner sc = new Scanner(System.in);
	
	public static double tinhDoDai(double ax, double ay, double bx, double by) {
		return Math.sqrt(Math.pow(ax - bx, 2) + Math.pow(ay - by, 2));
	}
	
	public static boolean check(double a, double b, double c) {
		if (a == b && a == c) { return true;}
		else{return false;}
	}
	
	public static void init() {
		System.out.print("Nhap toa do Ax: ");
		double Ax = Double.parseDouble(sc.nextLine());
		System.out.print("Nhap toa do Ay: ");
		double Ay = Double.parseDouble(sc.nextLine());
		System.out.print("Nhap toa do Bx: ");
		double Bx = Double.parseDouble(sc.nextLine());
		System.out.print("Nhap toa do By: ");
		double By = Double.parseDouble(sc.nextLine());
		System.out.print("Nhap toa do Cx: ");
		double Cx = Double.parseDouble(sc.nextLine());
		System.out.print("Nhap toa do Cy: ");
		double Cy = Double.parseDouble(sc.nextLine());
		
		double AB = tinhDoDai(Ax, Ay, Bx, By);
		double BC = tinhDoDai(Bx, By, Cx, Cy);
		double AC = tinhDoDai(Ax, Ay, Cx, Cy);
		System.out.printf("Do dai canh AB: %.3f%n", AB);
		System.out.printf("Do dai canh AB: %.3f%n", BC);
		System.out.printf("Do dai canh AB: %.3f%n", AC);
		
		double cv, dt, R;
		
		if (check(Ax, Bx, Cx) || check(Ay, By, Cy)) {
			System.out.println("A, B, C khong tao thanh tam giac");
		} else {
			cv = AB + BC + AC;
			double p = cv/2;
			dt = Math.sqrt(p*(p-AB)*(p-BC)*(p-AC));
			R = (AB*BC*AC)/(4*dt);
			System.out.printf("Chu vi tam gia la: %.3f%n",cv);
			System.out.printf("Dien tich tam giac la: %.3f%n",dt);
			System.out.printf("Ban kinh duong tron ngoai tiep la: %.3f",R);
		}
	}
}

package vn.devpro.buoi4;

import java.util.Scanner;

public class tren_lop {

	static Scanner sc = new Scanner(System.in);
	
	
	public static void nhapMang(float[] a, int n) {
		System.out.println("Nhap mang" + n +" so thuc");
		for (int i = 0; i < n; i++) {
			System.out.printf("\ta[%d] = ",i);
			a[i] = Float.parseFloat(sc.nextLine());
		}
	}
	
	public static void xuatMang(float[] a, int n) {
		for (int i = 0; i < n; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println();
	}
	
	public static int viTri(float[] a, double x) {
		for(int i = 0; i < a.length; i++) {
			if (x == a[i]) {
				return i;
			}
		}
		return -1;
	}
	
	public static int count(float[] a, float x) {
		int count = 0;
		for (float i : a) {
			if(i == x) {
				count++;
			}
		}
		return count;
	}
	
	public static void xuatViTri(float[] a, float x) {
		System.out.print("Cac vi tri cua" + x + ": ");
		for(int i = 0; i < a.length; i++) {
			if(a[i] == x) {
				System.out.print(i + " ");
			}
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		System.out.print("Nhap so phan tu mang: ");
		n = Integer.parseInt(sc.nextLine());
		float[] a = new float[n];
		nhapMang(a, n);
//		System.out.println("Mang vua nhap: ");
//		xuatMang(a, n);
		float x;
		System.out.println("Nhap x: ");
		x = (float) Double.parseDouble(sc.nextLine());
		int index = viTri(a, x);
		if (index == -1) {
			System.out.printf("So %d khong co trong mang a",x);
		}else {
//			System.out.println("Vi tri cua"+ x + "trong mang a la: "+viTri(a, x) );
			System.out.printf("So %d co trong mang a",x);
			System.out.println("So lan xuat hien la: " + count(a, x));
			xuatViTri(a, x);
		}
	}
}

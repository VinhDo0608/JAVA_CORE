package vn.devpro.bai7.qlnv;

import java.util.Scanner;

public abstract class NhanVien {
	
	protected String maNv;
	protected String hoTen;
	protected int nam;
	
	public abstract double luong();
	
	Scanner sc = new Scanner(System.in);
	static int autoNumber = 101;
	
	public void nhap() {
		this.maNv = "NV" + autoNumber++;
		System.out.print("\tHo ten: ");
		this.hoTen = sc.nextLine();
		System.out.printf("\tNam vao lam: ");
		this.nam = Integer.parseInt(sc.nextLine());
	}
	
	public void hienThi() {
		System.out.printf("%5s %-20s %6s ", this.maNv, this.hoTen, this.nam);
	}
	
}

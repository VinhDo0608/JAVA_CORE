package vn.devpro.bai7.baitap2;

import java.util.Scanner;

public class SanPham {
	
	protected String code;
	protected String name;
	protected String date;
	
	Scanner sc = new Scanner(System.in);
	
	public void input() {
		System.out.print("\tMa sp: ");
		this.code = sc.nextLine();
		System.out.print("\tTen sp: ");
		this.name = sc.nextLine();
		System.out.print("\tNgay san xuat (dd/mm/yyyy): ");
		this.date = sc.nextLine();
	}
	
	public void display() {
		System.out.printf("%-10s %-25s %10s ", this.code, this.name, this.date);
	}
	public SanPham() {
		super();
	}

	public SanPham(String code, String name, String date) {
		super();
		this.code = code;
		this.name = name;
		this.date = date;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

}

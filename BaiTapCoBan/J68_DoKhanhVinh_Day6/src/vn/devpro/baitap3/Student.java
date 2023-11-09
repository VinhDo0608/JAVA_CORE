package vn.devpro.baitap3;

import java.util.Scanner;

public class Student {
	private String code;
	private String name;
	private String date;
	private String major;

	public void display() {
		System.out.println("\tMa sinh vien: " + code + "\t\tHo va ten: " + name);
		System.out.println("\tNgay sinh: " + date + "\t\tNganh hoc: " + major);
	}

	public Student() {
		super();
	}

	public Student(String code, String name, String date, String major) {
		super();
		this.code = code;
		this.name = name;
		this.date = date;
		this.major = major;
	}
	
	public void update() {
		do {
			System.out.println("\n-----SUA THONG TIN HOC VIEN-------");
			System.out.println("\t1. Sua ten sinh vien");
			System.out.println("\t2. Sua ngay sinh");
			System.out.println("\t3. Sua ten chuyen nganh");
			System.out.println("\t0. Quay lai");
			System.out.print("\tLua chon cua ban: ");

			Scanner sc = new Scanner(System.in);

			int chon = Integer.parseInt(sc.nextLine());

			switch (chon) {
			case 1:
				System.out.print("Nhap ten sinh vien moi: ");
				this.name = sc.nextLine();
				break;
			case 2:
				System.out.print("Nhap ngay sinh moi: ");
				this.date = sc.nextLine();
				break;
			case 3:
				System.out.print("Nhap ten chuyen nganh moi: ");
				this.major = sc.nextLine();
				break;
			case 0:
				return;
			default:
				System.out.println("Lua chon khong hop le");
			}
		} while (true);
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

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}
}

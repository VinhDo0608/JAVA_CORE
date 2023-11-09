package vn.devpro.baitap3;

import java.util.Scanner;

public class Subject {
	
	private String code;
	private String name;
	private double credit;
	private double mark;
	
	public void display() {
		System.out.printf("%-11s %-25s %-10.1f %-7.2f%n", code, name, credit, mark);
	}
	//Phuong thuc sua thong tin hoc phan
	public void update() {
		do {
			System.out.println("\n-----SUA THONG TIN HOC PHAN-------");
			System.out.println("\t1. Sua ten hoc phan");
			System.out.println("\t2. Sua so tin chi");
			System.out.println("\t3. Sua diem hoc phan");
			System.out.println("\t0. Quay lai");
			System.out.print("\tLua chon cua ban: ");
			
			Scanner sc = new Scanner(System.in);
			
			int chon = Integer.parseInt(sc.nextLine());
			
			switch (chon) {
			case 1:
				System.out.print("Nhap ten hoc phan moi: ");
				this.name = sc.nextLine();
				break;
			case 2:
				System.out.print("Nhap so tin chi moi: ");
				this.credit = Double.parseDouble(sc.nextLine()) ;
				break;
			case 3:
				System.out.print("Nhap diem so moi: ");
				this.mark = Double.parseDouble(sc.nextLine()) ;
				break;
			case 0: return;
			default: System.out.println("Lua chon khong hop le");
			}
		} while (true);
	}
	
	//Phuong thuc tra ve diem theo so tin chi
	public double markByCredit() {
		return this.credit * this.mark;
	}
	public Subject() {
		super();
	}

	public Subject(String code, String name, double credit, double mark) {
		super();
		this.code = code;
		this.name = name;
		this.credit = credit;
		this.mark = mark;
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

	public double getCredit() {
		return credit;
	}

	public void setCredit(double credit) {
		this.credit = credit;
	}

	public double getMark() {
		return mark;
	}

	public void setMark(double mark) {
		this.mark = mark;
	}
}

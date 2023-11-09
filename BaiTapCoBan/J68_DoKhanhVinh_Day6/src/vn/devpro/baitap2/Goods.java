package vn.devpro.baitap2;

import java.util.Scanner;

public class Goods {
	private String code;
	private String name;
	private double quantity;
	private double price;
	
	public void display() {
		System.out.printf("%-11s %-25s %8.1f %14.2f%n", code, name, quantity, price);
	}
	
	public void update() {
		do {
			System.out.println("\n-----SUA THONG TIN HANH HOA-------");
			System.out.println("\t1. Sua ten hang hoa");
			System.out.println("\t2. Sua so luong hang hoa");
			System.out.println("\t3. Sua don gia");
			System.out.println("\t0. Quay lai");
			System.out.print("\tLua chon cua ban: ");

			Scanner sc = new Scanner(System.in);

			int chon = Integer.parseInt(sc.nextLine());

			switch (chon) {
			case 1:
				System.out.print("Nhap ten hang hoa moi: ");
				this.name = sc.nextLine();
				break;
			case 2:
				System.out.print("Nhap so luong hang hoa moi: ");
				this.quantity = Double.parseDouble(sc.nextLine());
				break;
			case 3:
				System.out.print("Nhap don gia moi: ");
				this.price = Double.parseDouble(sc.nextLine());
				break;
			case 0:
				return;
			default:
				System.out.println("Lua chon khong hop le");
			}
		} while (true);
	}
	
	public double totalMoney() {
		return quantity * price;
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


	public double getQuantity() {
		return quantity;
	}


	public void setQuantity(double quantity) {
		this.quantity = quantity;
	}


	public double getPrice() {
		return price;
	}


	public void setPrice(double price) {
		this.price = price;
	}


	public Goods() {
		super();
	}

	
	public Goods(String code, String name, double quantity, double price) {
		super();
		this.code = code;
		this.name = name;
		this.quantity = quantity;
		this.price = price;
	}
}

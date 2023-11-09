package vn.devpro.qlch.capnhat;

import java.util.Scanner;

public class HangHoa {

	private int ID;
	private int ID_LH;
	private String name;
	private double amount;
	private double price;

	static Scanner sc = new Scanner(System.in);

	public void display() {
		System.out.printf("%3d %-20s %-30s %,9.1f %,14.2f%n", this.ID, QuanLyLoaiHang.nameOf(this.ID_LH), this.name,
				this.amount, this.price);
	}

	public void update() {
		do {
			System.out.println("\nChon thong tin hang hoa can sua: ");
			System.out.println("\t1. Sua ma loai hang");
			System.out.println("\t2. Sua ten hang hoa");
			System.out.println("\t3. Sua so luong hang hoa");
			System.out.println("\t4. Sua don gia hang hoa");
			System.out.println("\t0. Quay lai");

			System.out.print("Lua chon cua ban: ");
			int chon = Integer.parseInt(sc.nextLine());

			switch (chon) {
			case 1:
				updateIDLH();
				break;
			case 2:
				updateName();
				break;
			case 3:
				updateAmount();
				break;
			case 4:
				updatePrice();
				break;
			default:
				throw new IllegalArgumentException("Lua chon khong hop le!");
			}
		} while (true);
	}

	// Sua don gia hang hoa
	public void updatePrice() {
		System.out.print("\tNhap don gia hang hoa: ");
		double price = Double.parseDouble(sc.nextLine());
		if (price < 0) {
			System.out.println("\tSo luong khong the la so am!");
			return;
		}
		this.price = price;
		System.out.println("\tSua don gia thanh cong");
	}

	// Sua so luong hang hoa
	public void updateAmount() {
		System.out.print("\tNhap so luong hang hoa: ");
		double amount = Double.parseDouble(sc.nextLine());
		if (amount < 0) {
			System.out.println("\tSo luong khong the la so am!");
			return;
		}
		this.amount = amount;
		System.out.println("\tSua so luong thanh cong");
	}

	// Sua ten hang hoa
	public void updateName() {
		System.out.print("\tNhap ten hang hoa moi: ");
		String name = sc.nextLine();
		if (name.trim().length() == 0) {
			System.out.println("Ten hang hoa khong duoc de trong!");
			return;
		}
		this.name = name;
		System.out.println("\tSua ten thanh cong");
	}

	// Sua ma loai hang
	public void updateIDLH() {
		System.out.print("\tNhap ma loai hang moi: ");
		int id_lh = Integer.parseInt(sc.nextLine());
		if (QuanLyLoaiHang.indexOf(id_lh) == -1) {
			System.out.println("\tLoai hang nay chua co trong danh sach loai hang");
			return;
		}
		this.ID = id_lh;
		System.out.println("\tSua ma thanh cong");
	}

	public HangHoa() {
		super();
	}

	public HangHoa(int iD, int iD_LH, String name, double amount, double price) {
		super();
		this.ID = iD;
		this.ID_LH = iD_LH;
		this.name = name;
		this.amount = amount;
		this.price = price;
	}

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

}

package vn.devpro.baitap2;

import java.util.Scanner;

import vn.devpro.baitap3.Subject;

public class Vouchers {
	private Customer cus;
	private Goods[] list;
	
	static Scanner sc = new Scanner(System.in);
	
	public void display() {
		System.out.println("\t\t\tPHIEU MUA HANG");
		this.cus.display();
		System.out.printf("%3s %-11s %-25s %-10s %12s%n", "STT", "Ma hang", "Ten hang", "So luong", "Thanh tien");
		int stt = 1;
		for (Goods s : this.list) {
			System.out.printf("%3d ", stt++);
			s.display();
		}
		System.out.println();
		System.out.printf("\t\tTong thanh tien: %.2f%n", this.totalMoney());
	}
	
	public double totalMoney() {
		double sumPrice = 0;
		for (Goods g : list) {
			sumPrice += g.totalMoney();
		}
		return sumPrice;
	}
	
	public void updateInfoCus() {
		System.out.println("\n---------SUA THONG TIN KHACH HANG---------");
		this.cus.update();
	}
	
	public void updateGoods() {
		System.out.println("\n-------SUA THONG TIN HANG HOA--------");
		System.out.print("Nhap ma hang hoa can sua: ");
		String code = sc.nextLine();

		int index = indexOfSubject(code);
		if (index == -1) {
			System.out.println("\tHang hoa khong co trong danh sach");
			return;
		}

		this.list[index].update();
	}
	
	public int indexOfSubject(String code) {
		for (int index = 0; index < this.list.length; index++) {
			if (this.list[index].getCode().equals(code)) {
				return index;
			}
		}
		return -1;
	}

	public Vouchers(Customer cus, Goods[] list) {
		super();
		this.cus = cus;
		this.list = list;
	}

	public Customer getCus() {
		return cus;
	}

	public void setCus(Customer cus) {
		this.cus = cus;
	}

	public Goods[] getList() {
		return list;
	}

	public void setList(Goods[] list) {
		this.list = list;
	}

	public static Scanner getSc() {
		return sc;
	}

	public static void setSc(Scanner sc) {
		Vouchers.sc = sc;
	}

	public Vouchers() {
		super();
	}
	
	
}

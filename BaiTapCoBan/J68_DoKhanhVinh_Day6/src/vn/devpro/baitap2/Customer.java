package vn.devpro.baitap2;

import java.util.Scanner;

public class Customer {
	private String code;
	private String name;
	private String phone;
	private String address;
	
	public void display() {
		System.out.println("\tMa hoa don: "+ code + "\t\tHo va ten: " + name);
		System.out.println("\tSo dien thoai: " + phone + "\t\tDia chi: " + address);
	}

	public void update() {
		do {
			System.out.println("Lua chon 1 thong tin muon sua:");
			System.out.println("\t1. Sua ten khach hang");
			System.out.println("\t2. Sua so dien thoai khach hang");
			System.out.println("\t3. Sua dia chi khach hang");
			System.out.println("\t0. Quay lai");
			System.out.print("\tLua chon cua ban: ");

			Scanner sc = new Scanner(System.in);

			int chon = Integer.parseInt(sc.nextLine());

			switch (chon) {
			case 1:
				System.out.print("Nhap ten khach hang moi: ");
				this.name = sc.nextLine();
				break;
			case 2:
				System.out.print("Nhap so dien thoai moi: ");
				this.phone = sc.nextLine();
				break;
			case 3:
				System.out.print("Nhap dia chi moi: ");
				this.address = sc.nextLine();
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


	public String getPhone() {
		return phone;
	}


	public void setPhone(String phone) {
		this.phone = phone;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public Customer() {
		super();
	}


	public Customer(String code, String name, String phone, String address) {
		super();
		this.code = code;
		this.name = name;
		this.phone = phone;
		this.address = address;
	}
	
}

package vn.devpro.qlsv.capnhat;

import java.util.Scanner;

public class SinhVien {

	private int ID_SV;
	private String fName;
	private String lName;
	private String dateOB;
	private String gender;
	
	static Scanner sc = new Scanner(System.in);
	
	public void display() {
		System.out.printf("%5d %-20s %-5s %-10s %-3s %n", this.ID_SV, this.fName, this.lName, this.dateOB, this.gender);
	}
	
	public void update() {
		do {
			System.out.println("\nChon thong tin sinh vien can sua: ");
			System.out.println("\t1. Sua ho dem sinh vien");
			System.out.println("\t2. Sua ten sinh vien");
			System.out.println("\t3. Sua ngay sinh");
			System.out.println("\t4. Sua gioi tinh");
			System.out.println("\t0. Quay lai");

			System.out.print("Lua chon cua ban: ");
			int chon = Integer.parseInt(sc.nextLine());

			switch (chon) {
			case 1:
				updateFName();
				break;
			case 2:
				updateLName();
				break;
			case 3:
				updateDOB();
				break;
			case 4:
				updateGend();
				break;
			default:
				throw new IllegalArgumentException("Lua chon khong hop le!");
			}
		} while (true);
	}

	private void updateFName() {
		System.out.print("\tNhap ho dem sinh vien moi: ");
		String fName = sc.nextLine();
		if (fName.trim().length() == 0) {
			System.out.println("Ho dem sinh vien khong duoc de trong!");
			return;
		}
		this.fName = fName;
		System.out.println("\tSua ho dem thanh cong");
	}

	private void updateLName() {
		System.out.print("\tNhap ten sinh vien moi: ");
		String lName = sc.nextLine();
		if (lName.trim().length() == 0) {
			System.out.println("Ten sinh vien khong duoc de trong!");
			return;
		}
		this.lName = lName;
		System.out.println("\tSua ten thanh cong");
	}

	private void updateDOB() {
		System.out.print("\tNhap so nam sinh moi: ");
		String dateOB = sc.nextLine();
		if (dateOB.trim().length() == 0) {
			System.out.println("Nam sinh sinh vien khong duoc de trong!");
			return;
		}
		this.dateOB = dateOB;
		System.out.println("\tSua nam sinh thanh cong");
	}

	private void updateGend() {
		System.out.print("\tNhap gioi tinh sinh vien moi: ");
		String gender = sc.nextLine();
		if (gender.trim().length() == 0) {
			System.out.println("Gioi tinh sinh vien khong duoc de trong!");
			return;
		}
		this.gender = gender;
		System.out.println("\tSua gioi tinh thanh cong");
	}

	public int getID_SV() {
		return ID_SV;
	}

	public void setID_SV(int iD_SV) {
		ID_SV = iD_SV;
	}

	public String getfName() {
		return fName;
	}

	public void setfName(String fName) {
		this.fName = fName;
	}

	public String getlName() {
		return lName;
	}

	public void setlName(String lName) {
		this.lName = lName;
	}

	public String getDateOB() {
		return dateOB;
	}

	public void setDateOB(String dateOB) {
		this.dateOB = dateOB;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public SinhVien() {
		super();
	}

	public SinhVien(int iD_SV, String fName, String lName, String dateOB, String gender) {
		super();
		ID_SV = iD_SV;
		this.fName = fName;
		this.lName = lName;
		this.dateOB = dateOB;
		this.gender = gender;
	}
	
}
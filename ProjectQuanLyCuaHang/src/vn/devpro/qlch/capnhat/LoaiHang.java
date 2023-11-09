package vn.devpro.qlch.capnhat;

public class LoaiHang {

	private int ID;
	private String name;

	public void display() {
		System.out.printf("%3d %-20s %n", this.ID, this.name);
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

	public LoaiHang() {
		super();
	}

	public LoaiHang(int iD, String name) {
		super();
		ID = iD;
		this.name = name;
	}
}

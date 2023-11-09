package vn.devpro.qlsv.capnhat;

public class Diem {

	private int ID_SV;
	private int ID_MH;
	private double diem;
	
	public void display() {
		System.out.printf("%12d %10d %,.2f %n", this.ID_SV, this.ID_MH, this.diem);
	}

	public Diem(int iD_SV, int iD_MH, double diem) {
		super();
		ID_SV = iD_SV;
		ID_MH = iD_MH;
		this.diem = diem;
	}

	public Diem() {
		super();
	}

	public int getID_SV() {
		return ID_SV;
	}

	public void setID_SV(int iD_SV) {
		ID_SV = iD_SV;
	}

	public int getID_MH() {
		return ID_MH;
	}

	public void setID_MH(int iD_MH) {
		ID_MH = iD_MH;
	}

	public double getDiem() {
		return diem;
	}

	public void setDiem(double diem) {
		this.diem = diem;
	}

}

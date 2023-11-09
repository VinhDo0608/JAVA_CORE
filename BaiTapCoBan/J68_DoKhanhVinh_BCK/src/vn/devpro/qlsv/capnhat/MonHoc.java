package vn.devpro.qlsv.capnhat;

public class MonHoc {
	
	private int ID_MH;
	private String name;
	private double coefficient;
	
	public void display() {
		System.out.printf("%5d %-35s %,.2f %n", this.ID_MH, this.name, this.coefficient);
	}

	public MonHoc(int iD_MH, String name, double coefficient) {
		super();
		ID_MH = iD_MH;
		this.name = name;
		this.coefficient = coefficient;
	}

	public MonHoc() {
		super();
	}

	public int getID_MH() {
		return ID_MH;
	}

	public void setID_MH(int iD_MH) {
		ID_MH = iD_MH;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getCoefficient() {
		return coefficient;
	}

	public void setCoefficient(double coefficient) {
		this.coefficient = coefficient;
	}

}

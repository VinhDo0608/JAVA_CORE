package vn.devpro.qlch.qlbh;

import vn.devpro.qlch.capnhat.QuanLyHangHoa;

public class HangBan {

	private int IDH;
	private double amount; //So luong 1 hang ma khach hang mua
	
	public void display() {
		System.out.printf("%-25s %,9.1f %,14.2f %,15.2f%n",
				QuanLyHangHoa.nameOf(IDH), this.amount, QuanLyHangHoa.priceOf(IDH), 
				QuanLyHangHoa.priceOf(IDH) * this.amount);
	}
	
	public double thanhTien() {
		return QuanLyHangHoa.priceOf(IDH) * this.amount;
	}

	public int getIDH() {
		return IDH;
	}

	public void setIDH(int iDH) {
		IDH = iDH;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public HangBan() {
		super();
	}

	public HangBan(int iDH, double amount) {
		super();
		IDH = iDH;
		this.amount = amount;
	}

}

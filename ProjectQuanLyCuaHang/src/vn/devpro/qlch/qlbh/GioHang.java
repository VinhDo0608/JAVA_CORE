package vn.devpro.qlch.qlbh;

import java.util.ArrayList;

import vn.devpro.qlch.capnhat.QuanLyKhachHang;

public class GioHang {
	
	public static int autoNumber = 401;
	
	private int ID;
	private int ID_KH;
	private ArrayList<HangBan> list = new ArrayList<HangBan>();
	
	public void display() {
		System.out.println("\tMa gio hang: " + this.ID);
		System.out.println("\tKhach hang: " + QuanLyKhachHang.nameOf(ID_KH));
		int stt = 1;
		System.out.printf("%3s %-25s %-9s %-14s %-15s%n", "STT", "    Ten hang",
				" So luong","    Don gia", "    Thanh tien");
		double t = 0;
		for (HangBan x : list) {
			System.out.printf("%3d ", stt++);
			x.display();
			t += x.thanhTien();
		}
		if (stt == 1) {
			System.out.println("\tChua co hang nao trong gio!");
		}
		else {
			System.out.printf("\tCong thanh tien: %.2f%n", t);
		}
	}
	
	//Phuong thuc tra ve index cua hang trong gio theo id
	public int indexOf(int id_h) {
		for (int index = 0; index < list.size(); index++) {
			if (list.get(index).getIDH() == id_h) {
				return index;
			}
		}
		return -1;
	}
	
	//Phuong thuc xoa hang khoi gio
	public void xoa(int index) {
		list.remove(index);
	}

	public GioHang(int iD, int iD_KH, ArrayList<HangBan> list) {
		super();
		ID = iD;
		ID_KH = iD_KH;
		this.list = list;
	}

	public GioHang() {
		super();
	}

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public int getID_KH() {
		return ID_KH;
	}

	public void setID_KH(int iD_KH) {
		ID_KH = iD_KH;
	}

	public ArrayList<HangBan> getList() {
		return list;
	}

	public void setList(ArrayList<HangBan> list) {
		this.list = list;
	}

}

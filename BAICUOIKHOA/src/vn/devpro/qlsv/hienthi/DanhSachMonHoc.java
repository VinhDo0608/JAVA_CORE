package vn.devpro.qlsv.hienthi;

import java.util.ArrayList;
import vn.devpro.qlsv.capnhat.MonHoc;
import vn.devpro.qlsv.capnhat.QuanLyDiem;
import vn.devpro.qlsv.capnhat.SinhVien;

public class DanhSachMonHoc {
	private MonHoc mh;
	private ArrayList<SinhVien> list_sv;

	public DanhSachMonHoc() {
		super();
	}

	public DanhSachMonHoc(MonHoc mh, ArrayList<SinhVien> list_sv) {
		super();
		this.mh = mh;
		this.list_sv = list_sv;
	}

	public void display() {
		System.out.println("\n---------THONG TIN MON HOC---------");
		System.out.println("Ma mon hoc: " + mh.getID_MH() + "\t\tTen mon hoc: " + mh.getName());
		System.out.printf("%n%3s %5s %-25s %4s %n", "STT", "Ma sv", "Ho va ten", "Diem");
		int stt = 1;
		for (SinhVien x : list_sv) {
			System.out.printf("%3d ", stt++);
			System.out.printf("%5d %-25s %4.2f%n", x.getID_SV(), x.getfName() + " " + x.getlName(), QuanLyDiem.getList().get(QuanLyDiem.indexOf(mh.getID_MH(), x.getID_SV())).getDiem());
		}
		System.out.printf("Diem trung binh mon: %19.2f", QuanLyDiem.diemTB(mh.getID_MH()));
	}
}

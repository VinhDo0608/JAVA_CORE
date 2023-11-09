package vn.devpro.qlsv.hienthi;

import java.util.ArrayList;

import vn.devpro.qlsv.capnhat.Diem;
import vn.devpro.qlsv.capnhat.MonHoc;
import vn.devpro.qlsv.capnhat.QuanLyDiem;
import vn.devpro.qlsv.capnhat.QuanLyMonHoc;
import vn.devpro.qlsv.capnhat.QuanLySinhVien;

public class HienThiSinhVien {
	
	private static ArrayList<Diem> list = QuanLyDiem.getList();
	private static ArrayList<DanhSachSinhVien> list_sv = new ArrayList<DanhSachSinhVien>();
	
	public static ArrayList<MonHoc> listOfMH(int id) {
		ArrayList<MonHoc> list_mh = new ArrayList<MonHoc>();
		for (Diem diem : list) {
			if (diem.getID_SV() == id){
				list_mh.add(QuanLyMonHoc.mHOfSV(diem.getID_MH()));
			}
		}
		return list_mh;
	}

	public static ArrayList<Integer> dsMaSV() {
		ArrayList<Integer> list_msv = new ArrayList<Integer>();
		for (int i = 0; i < QuanLySinhVien.getList().size(); i++) {
			list_msv.add(QuanLySinhVien.getList().get(i).getID_SV());
		}
		return list_msv;
	}

	public static void activate() {
		
		ArrayList<Integer> x = dsMaSV();
		for (Integer i : x) 
			list_sv.add(new DanhSachSinhVien(QuanLySinhVien.sVOfMH(i), listOfMH(i)));
		System.out.println("\n---------BANG DIEM SINH VIEN---------");
		for (DanhSachSinhVien s : list_sv) {
			s.display();
			System.out.println();
		}
	}
}

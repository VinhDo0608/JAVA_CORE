package vn.devpro.qlsv.hienthi;

import java.util.ArrayList;

import vn.devpro.qlsv.capnhat.Diem;
import vn.devpro.qlsv.capnhat.QuanLyDiem;
import vn.devpro.qlsv.capnhat.QuanLyMonHoc;
import vn.devpro.qlsv.capnhat.QuanLySinhVien;
import vn.devpro.qlsv.capnhat.SinhVien;

public class HienThiMonHoc {

	private static ArrayList<Diem> list = QuanLyDiem.getList();
	private static ArrayList<DanhSachMonHoc> list_mh = new ArrayList<DanhSachMonHoc>();

	public static ArrayList<SinhVien> listOfSV(int id) {
		ArrayList<SinhVien> list_sv = new ArrayList<SinhVien>();
		for (Diem diem : list) {
			if (diem.getID_MH() == id) {
				list_sv.add(QuanLySinhVien.sVOfMH(diem.getID_SV()));
			}
		}
		return list_sv;
	}

	public static ArrayList<Integer> dsMaMh() {
		ArrayList<Integer> list_mmh = new ArrayList<Integer>();
		for (int i = 0; i < QuanLyMonHoc.getList().size(); i++) {
			list_mmh.add(QuanLyMonHoc.getList().get(i).getID_MH());
		}
		return list_mmh;
	}

	public static void activate() {

		ArrayList<Integer> x = dsMaMh();
		for (Integer i : x)
			list_mh.add(new DanhSachMonHoc(QuanLyMonHoc.mHOfSV(i), listOfSV(i)));
		System.out.println("\n---------DANH SACH MON HOC---------");
		for (DanhSachMonHoc s : list_mh) {
			s.display();
			System.out.println();
		}
	}
}

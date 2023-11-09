package vn.devpro.qlsv.timkiem;

import java.util.Scanner;

import vn.devpro.qlsv.capnhat.QuanLyMonHoc;
import vn.devpro.qlsv.hienthi.DanhSachMonHoc;
import vn.devpro.qlsv.hienthi.HienThiMonHoc;

public class TimKiemMonHoc {
static Scanner sc = new Scanner(System.in);
	
	public static void timKiemMonHoc() {
			System.out.print("Nhap id (ma) mon hoc muon tim: ");
			int id = Integer.parseInt(sc.nextLine());
			
			int index = QuanLyMonHoc.indexOf(id);
			if(index == -1) {
				System.out.println("\tSinh vien khong co trong danh sach!");
				return;
			}
			DanhSachMonHoc ds = new DanhSachMonHoc(QuanLyMonHoc.getList().get(index), HienThiMonHoc.listOfSV(id));
			ds.display();
	}

}

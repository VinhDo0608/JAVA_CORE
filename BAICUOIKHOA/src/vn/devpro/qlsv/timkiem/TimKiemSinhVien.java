package vn.devpro.qlsv.timkiem;

import java.util.Scanner;

import vn.devpro.qlsv.capnhat.QuanLySinhVien;
import vn.devpro.qlsv.hienthi.DanhSachSinhVien;
import vn.devpro.qlsv.hienthi.HienThiSinhVien;

public class TimKiemSinhVien {
	
	static Scanner sc = new Scanner(System.in);
	
	public static void timKiemSinhVien() {
			System.out.print("Nhap id (ma) sinh vien muon tim: ");
			int id = Integer.parseInt(sc.nextLine());
			
			int index = QuanLySinhVien.indexOf(id);
			if(index == -1) {
				System.out.println("\tSinh vien khong co trong danh sach!");
				return;
			}
			DanhSachSinhVien ds = new DanhSachSinhVien(QuanLySinhVien.getList().get(index), HienThiSinhVien.listOfMH(id));
			ds.display();
	}

}

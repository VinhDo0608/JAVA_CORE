package vn.devpro.qlsv.qlht;

import java.util.Scanner;

import vn.devpro.qlsv.capnhat.QuanLyCapNhat;
import vn.devpro.qlsv.capnhat.QuanLyDiem;
import vn.devpro.qlsv.capnhat.QuanLyMonHoc;
import vn.devpro.qlsv.capnhat.QuanLySinhVien;
import vn.devpro.qlsv.hienthi.QuanLyHienThi;
import vn.devpro.qlsv.timkiem.QuanLyTimKiem;


public class QuanLyHeThong {
		
static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		QuanLySinhVien.init();
		QuanLyMonHoc.init();
		QuanLyDiem.init();
		do {
			System.out.println("\n=========CHUONG TRINH QUAN LY SINH VIEN=========");
			System.out.println("Moi ban lua chon mot chuc nang quan ly");
			System.out.println("\t1. Cap nhat thong tin");
			System.out.println("\t2. Hien thi thong tin");
			System.out.println("\t3. Tim kiem thong tin");
			System.out.println("\t0. Dong ung dung");
			
			System.out.print("Lua chon cua ban: ");
			int chon = Integer.parseInt(sc.nextLine());
			
			
			switch(chon) {
			case 1: QuanLyCapNhat.activate(); break;
			case 2: QuanLyHienThi.activate();; break;
			case 3: QuanLyTimKiem.activate(); break;
			case 0:
				System.out.println("Da dong chuong trinh!");
				System.exit(0);
			default: System.out.println("Lua chon khong hop le!");
			}
		}while (true);
	}
}

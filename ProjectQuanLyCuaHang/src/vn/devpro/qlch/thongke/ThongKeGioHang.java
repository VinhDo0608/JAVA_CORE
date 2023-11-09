package vn.devpro.qlch.thongke;

import vn.devpro.qlch.qlbh.GioHang;
import vn.devpro.qlch.qlbh.HangBan;
import vn.devpro.qlch.qlbh.QuanLyBanHang;

public class ThongKeGioHang {
	
	public static void thongKe() {
		System.out.println("\n---------DANH SACH GIO HANG DA BAN---------");
		double total = 0;
		for (GioHang gio : QuanLyBanHang.getList()) {
			gio.display();
			System.out.println("\t------------------");
			for (HangBan x : gio.getList()) {
				total += x.thanhTien();
			}
		}
		System.out.println("Tong so hang da ban: " + QuanLyBanHang.getList().size());
		System.out.printf("Tong so tien thu duoc: %,.2f", total);
	}
}

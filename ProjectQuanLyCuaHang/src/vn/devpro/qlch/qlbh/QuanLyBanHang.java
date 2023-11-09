package vn.devpro.qlch.qlbh;

import java.util.ArrayList;
import java.util.Scanner;

import vn.devpro.qlch.capnhat.KhachHang;
import vn.devpro.qlch.capnhat.LoaiHang;
import vn.devpro.qlch.capnhat.QuanLyHangHoa;
import vn.devpro.qlch.capnhat.QuanLyKhachHang;

public class QuanLyBanHang {

	static GioHang gio = new GioHang();

	static Scanner sc = new Scanner(System.in);

	private static ArrayList<GioHang> list = new ArrayList<GioHang>();

	public static ArrayList<GioHang> getList() {
		return list;
	}

	public static void setList(ArrayList<GioHang> list) {
		QuanLyBanHang.list = list;
	}

	public static void thucThi() {

		gio = new GioHang();

		System.out.println("\n---------CHAO MUNG DEN VOI CUA HANG---------");

		do {
			System.out.println("Chon thao tac mua hang:");
			System.out.println("\t1. Them hang vao gio");
			System.out.println("\t2. Xem gio hang");
			System.out.println("\t3. Sua hang trong gio");
			System.out.println("\t4. Xoa hang trong gio");
			System.out.println("\t5. Thanh toan gio hang");
			System.out.println("\t0. Quay lai");

			System.out.print("Lua chon cua ban: ");
			int chon = Integer.parseInt(sc.nextLine());

			switch (chon) {
			case 1:
				them();
				break;
			case 2:
				xem();
				break;
			case 3:
				sua();
				break;
			case 4:
				xoa();
				break;
			case 5:
				thanhToan();
				gio = null;
				return;
			case 0:
				gio = null;
				return;
			default:
				System.out.println("Lua chon khong hop le!");
			}
		} while (true);
	}

	private static void them() {
		System.out.println("\n---------THEM HANG VAO GIO---------");
		System.out.print("\tChon (nhap) ma hang hoa: ");
		int id_h = Integer.parseInt(sc.nextLine());

		if (QuanLyHangHoa.indexOf(id_h) == -1) {
			System.out.println("\tHang hoa nay ko co trong gio hang");
			return;
		}

		System.out.print("\tNhap so luong can mua: ");
		double amount = Double.parseDouble(sc.nextLine());
		if (amount <= 0) {
			System.out.println("\tSo luong mua phai la so duong!");
			return;
		}

		// Kiem tra hang them da co trong gio hang chua
		int index = gio.indexOf(id_h);
		if (index != -1) {
			amount += gio.getList().get(index).getAmount();
		}

		if (amount > QuanLyHangHoa.amountOf(id_h)) {
			System.out.println("\tHang khong du ban cho khach");
			return;
		}

		if (index != -1) {// Hang da co trong gio
			gio.getList().get(index).setAmount(amount);
		}

		else { // hang chua co trong gio
			gio.getList().add(new HangBan(id_h, amount));
		}
		System.out.println("\tThem hang vao gio thanh cong!");
	}

	private static void xem() {
		System.out.println("\n---------GIO HANG CUA BAN---------");
		gio.display();
	}

	private static void sua() {
		System.out.println("\n---------SUA HANG TRONG GIO---------");
		System.out.println("\tNhap ma hang (ID) can sua: ");
		int id = Integer.parseInt(sc.nextLine());
		int index = gio.indexOf(id);
		if (index == -1) {
			System.out.println("\tHang hoa chua co trong gio");
			return;
		}
		System.out.println("\tNhap vao so luong moi: ");
		double amount = Double.parseDouble(sc.nextLine());
		if (amount < 0) {
			System.out.println("\tSo luong khong hop le!");
		}
		if (amount == 0) { // So luong bang 0 thi xoa
			gio.xoa(index);
			System.out.println("\tHang duoc xoa khoi gio");
			return;
		}
		if (QuanLyHangHoa.amountOf(id) < amount) {
			System.out.println("\tSo luong hang vuot qua so luong co ban!");
			return;
		}
		gio.getList().get(index).setAmount(amount);
		System.out.println("\tSua hang trong gio thanh cong!");

	}

	private static void xoa() {
		System.out.println("\n---------XOA HANG TRONG GIO---------");
		System.out.println("\tNhap ma hang (ID) can xoa: ");
		int id = Integer.parseInt(sc.nextLine());
		int index = gio.indexOf(id);
		if (index == -1) {
			System.out.println("\tHang hoa chua co trong gio");
			return;
		}
		gio.xoa(index);
		System.out.println("\tXoa hang trong gio thanh cong!");
	}

	private static void thanhToan() {
		System.out.println("\n---------THANH TOAN GIO HANG---------");
		System.out.print("\tNhap ma khach hang (ID): ");
		int id_kh = Integer.parseInt(sc.nextLine());
		int index = QuanLyKhachHang.indexOf(id_kh);
		if (index == -1) {// Truong hop khach hang chua co trong danh sach
			String name = "";
			do {
				System.out.print("\tNhap ten khach hang: ");
				name = sc.nextLine();
			} while (name.length() == 0);
			// Tao doi tuong khach hang va luu vao DSKH
			id_kh = QuanLyKhachHang.autoNumber++;
			KhachHang x = new KhachHang(id_kh, name);
			QuanLyKhachHang.getList().add(x);
		}

		// Them id gio hang, them id_kh vao trong gio
		gio.setID(gio.autoNumber++);
		gio.setID_KH(id_kh);

		// Cap nhat lai so luong hang trong danh sach hang hoa
		for (HangBan x : gio.getList()) {
			index = QuanLyHangHoa.indexOf(x.getIDH());
			double y = QuanLyHangHoa.getList().get(index).getAmount();
			QuanLyHangHoa.getList().get(index).setAmount(y - x.getAmount());
		}

		// In hoa don
		System.out.println("\n---------HOA DON BAN LE---------");
		gio.display();

		// Luu gio hang vao danh sach cac gio hang da thanh toan de quan ly
		list.add(gio);
		gio = null;
		System.out.println("\tCam on ban va hen gap lai!");
	}
	
	public static int indexOf(int id) {
		for (int index = 0; index < list.size(); index++) 
			if (list.get(index).getID() == id) 
				return index;
			
		return -1;
	}
}

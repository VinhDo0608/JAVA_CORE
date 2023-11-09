package vn.devpro.qlch.capnhat;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class QuanLyLoaiHang {
	
	private static int autoNumber = 101;
	
	static Scanner sc = new Scanner(System.in);
	
	private static ArrayList<LoaiHang> list = new ArrayList<LoaiHang>();
	
	public static ArrayList<LoaiHang> getList() {
		return list;
	}
	
	public static void setList(ArrayList<LoaiHang> list) {
		QuanLyLoaiHang.list = list;
	}
	
	public static void init() {
		list.add(new LoaiHang(autoNumber++, "Gia Dung"));
		list.add(new LoaiHang(autoNumber++, "My Pham"));
		list.add(new LoaiHang(autoNumber++, "Banh Keo"));
	}
	
	public static void thucThi() {
		do {
			System.out.println("\n=========CAP NHAT THONG TIN LOAI HANG=========");
			System.out.println("Moi ban lua chon mot chuc nang cap nhat");
			System.out.println("\t1. Them moi loai hang");
			System.out.println("\t2. Xem danh sach loai hang");
			System.out.println("\t3. Sua loai hang");
			System.out.println("\t4. Xoa loai hang");
			System.out.println("\t5. Sap xep danh sach loai hang");
			System.out.println("\t0. Quay lai");
			
			System.out.print("Lua chon cua ban: ");
			int chon = Integer.parseInt(sc.nextLine());
			
			
			switch(chon) {
			case 1: them(); break;
			case 2: xem(); break;
			case 3: sua(); break;
			case 4: xoa(); break;
			case 5: sap(); break;
			case 0:	return;
			default: System.out.println("Lua chon khong hop le!");
			}
		}while (true);
	}

	private static void them() {
		System.out.println("\n---------THEM MOI MOT LOAI HANG VAO DANH SACH---------");
		
		System.out.print("Nhap ten loai hang moi: ");
		String name = sc.nextLine();
		
		if (name.trim().length() == 0) {
			System.out.println("Ten loai hang khong duoc de trong!");
			return;
		}
		
		//Them hang hoa moi vao danh sach
		//+ Tao doi tuong de luu du lieu
		LoaiHang lh = new LoaiHang(autoNumber++, name);
		//+ Add vao list
		list.add(lh);
		System.out.println("Them moi thanh cong, bam 2 xem lai danh sach");
	}

	private static void xem() {
		System.out.println("\n---------DANH SACH LOAI HANG---------");
		System.out.printf("%3s %3s %-20s%n", "STT", "ID", "Ten loai hang");
		int stt = 1;
		for (LoaiHang x : list) {
			System.out.printf("%3d ", stt++);
			x.display();
		}
		if (stt == 1) {
			System.out.println("Danh sach rong!");
		}
		System.out.println("\nCo tong cong " + list.size() + " loai hang");
	}

	private static void sua() {
		//Sua thong tin loai hang
		//Nhap ma loai hang can sua
		//Ma co trong danh sach
		System.out.println("\n---------SUA THONG TIN LOAI HANG---------");
		
		System.out.println("\tNhap ma (id) loai hang can sua: ");
		int id = Integer.parseInt(sc.nextLine());
		
		//Can ham tim id trong dslh
		int index = indexOf(id);
		if(index == -1) {
			System.out.println("\tLoai hang khong co trong danh sach");
			return;
		}
		System.out.print("Nhap ten moi cho loai hang: ");
		String name = sc.nextLine();
		if (name.trim().length() == 0) {
			System.out.println("\tTen loai hang khong duoc de trong!");
			return;
		}
		list.get(index).setName(name);
		System.out.println("\tSua ten loai hang thanh cong!");
	}

	private static void xoa() {
		System.out.println("\n---------XOA THONG TIN LOAI HANG---------");
		
		System.out.println("\tNhap ma (id) loai hang can xoa: ");
		int id = Integer.parseInt(sc.nextLine());
		
		//Can ham tim id trong dslh
		int index = indexOf(id);
		if(index == -1) {
			System.out.println("\tLoai hang khong co trong danh sach");
			return;
		}
		list.remove(index);
		System.out.println("\tXoa loai hang thanh cong!");
	}

	private static void sap() {
		Collections.sort(list, new Comparator<LoaiHang>() {
			@Override
			public int compare(LoaiHang o1, LoaiHang o2) {
				return o1.getName().trim().compareToIgnoreCase(o2.getName().trim());
			}
		});
	}
	
	//Ham tim loai hang trong ds theo id va tra ve index (-1 neu khong co)
	public static int indexOf(int id) {
		for (int index = 0; index < list.size(); index++) 
			if (list.get(index).getID() == id) 
				return index;
			
		return -1;
	}
	
	//Ham nhan id va tra ve ten loai hang, khong co tra ve xau rong
	public static String nameOf(int id) {
		for (LoaiHang x : list) {
			if(x.getID() == id){
				return x.getName();
			}
		}
		return null;
	}
}
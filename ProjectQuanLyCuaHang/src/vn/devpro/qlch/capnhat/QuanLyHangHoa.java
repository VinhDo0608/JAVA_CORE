package vn.devpro.qlch.capnhat;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class QuanLyHangHoa {
	
	private static int autoNumber = 201;
	
	private static ArrayList<HangHoa> list = new ArrayList<HangHoa>();
	
	static Scanner sc = new Scanner(System.in);
	
	public static ArrayList<HangHoa> getList() {
		return list;
	}

	public static void setList(ArrayList<HangHoa> list) {
		QuanLyHangHoa.list = list;
	}
	
	public static void init() {
		list.add(new HangHoa(autoNumber++, QuanLyLoaiHang.getList().get(0).getID(), 
				"Noi com dien", 10, 250000));
		list.add(new HangHoa(autoNumber++, QuanLyLoaiHang.getList().get(0).getID(), 
				"Bep dien tu", 15, 8500000));
		list.add(new HangHoa(autoNumber++, QuanLyLoaiHang.getList().get(1).getID(), 
				"Dau goi x-men", 20, 170000));
		list.add(new HangHoa(autoNumber++, QuanLyLoaiHang.getList().get(2).getID(), 
				"Banh ChocoPie", 200, 25000));
		list.add(new HangHoa(autoNumber++, QuanLyLoaiHang.getList().get(2).getID(), 
				"Keo dua Ben Tre", 1000, 35000));
	}
	
	public static void thucThi() {
		do {
			System.out.println("\n=========CAP NHAT THONG TIN HANG HOA=========");
			System.out.println("Moi ban lua chon mot chuc nang cap nhat");
			System.out.println("\t1. Them moi hang hoa");
			System.out.println("\t2. Xem danh sach hang hoa");
			System.out.println("\t3. Sua hang hoa");
			System.out.println("\t4. Xoa hang hoa");
			System.out.println("\t5. Sap xep danh sach hang hoa");
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
		System.out.println("\n---------THEM MOI HANG HOA---------");
		System.out.print("\tChon (nhap) ma loai hang: ");
		int id_lh = Integer.parseInt(sc.nextLine());
		if (QuanLyLoaiHang.indexOf(id_lh) == -1) {
			System.out.println("\tChua co loai hang trong danh sach loai hang!");
			return;
		}
		
		System.out.print("\tNhap ten hang hoa moi: ");
		String name = sc.nextLine();
		if (name.trim().length() == 0) {
			System.out.println("Ten hang hoa khong duoc de trong!");
			return;
		}
		
		System.out.print("\tNhap so luong hang hoa: ");
		double amount = Double.parseDouble(sc.nextLine());
		if (amount < 0) {
			System.out.println("\tSo luong khong the la so am!");
			return;
		}
		
		System.out.print("\tNhap don gia hang hoa: ");
		double price = Double.parseDouble(sc.nextLine());
		if (price < 0) {
			System.out.println("\tSo luong khong the la so am!");
			return;
		}
		
		//Them hang hoa vao danh sach moi
		HangHoa x = new HangHoa(autoNumber++, id_lh, name, amount, price);
		list.add(x);
		System.out.println("\tThem hang hoa thanh cong!");
		
	}

	private static void xem() {
		System.out.println("\n---------DANH SACH HANG HOA---------");
		System.out.printf("%3s %3s %-20s %-30s %-9s %-14s%n", "STT", "ID", "Ten loai hang", 
				"   Ten hang hoa", " So luong", "   Don gia");
		int stt = 1;
		for (HangHoa x : list) {
			System.out.printf("%3d ", stt++);
			x.display();
		}
		
		if (stt == 1) {
			System.out.println("Danh sach rong!");
		}
		System.out.println("\nCo tong cong " + list.size() + " hang hoa");
	}

	private static void sua() {
		
		System.out.println("\n---------SUA THONG TIN LOAI HANG---------");
		System.out.print("\tNhap ma hang hoa can sua: ");
		int id = Integer.parseInt(sc.nextLine());
		
		int index = indexOf(id);
		
		if(index == -1) {
			System.out.println("\tHang hoa khong co trong danh sach");
			return;
		}
		list.get(index).update();
		
		
	}

	private static void xoa() {
		System.out.println("\n---------XOA THONG TIN HANG HOA---------");
		
		System.out.println("\tNhap ma hang hoa can xoa: ");
		int id = Integer.parseInt(sc.nextLine());
		
		//Can ham tim id trong dslh
		int index = indexOf(id);
		if(index == -1) {
			System.out.println("\tHang hoa khong co trong danh sach");
			return;
		}
		list.remove(index);
		System.out.println("\tXoa hang hoa thanh cong!");
	}

	private static void sap() {
		Collections.sort(list, new Comparator<HangHoa>() {
			@Override
			public int compare(HangHoa o1, HangHoa o2) {
				return o1.getName().trim().compareToIgnoreCase(o2.getName().trim());
			}
		});
		
	}
	
	public static int indexOf(int id) {
		for (int index = 0; index < list.size(); index++) 
			if (list.get(index).getID() == id) 
				return index;
			
		return -1;
	}
	
	public static String nameOf(int id) {
		for (HangHoa x : list) {
			if(x.getID() == id){
				return x.getName();
			}
		}
		return null;
	}
	
	public static double amountOf(int id) {
		for (HangHoa x : list) {
			if(x.getID() == id){
				return x.getAmount();
			}
		}
		return 0;
	}
	
	public static double priceOf(int id) {
		for (HangHoa x : list) {
			if(x.getID() == id){
				return x.getPrice();
			}
		}
		return 0;
	}
}

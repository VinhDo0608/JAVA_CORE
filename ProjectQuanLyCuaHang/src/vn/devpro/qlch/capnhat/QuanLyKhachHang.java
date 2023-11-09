package vn.devpro.qlch.capnhat;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class QuanLyKhachHang {
		
		public static int autoNumber = 301;
		
		static Scanner sc = new Scanner(System.in);
		
		private static ArrayList<KhachHang> list = new ArrayList<KhachHang>();
		
		public static ArrayList<KhachHang> getList() {
			return list;
		}
		
		public static void setList(ArrayList<KhachHang> list) {
			QuanLyKhachHang.list = list;
		}
		
		public static void init() {
			list.add(new KhachHang(autoNumber++, "Gia Bao"));
			list.add(new KhachHang(autoNumber++, "My Dung"));
			list.add(new KhachHang(autoNumber++, "Hung Dung"));
		}
		
		public static void thucThi() {
			do {
				System.out.println("\n=========CAP NHAT THONG TIN KHACH HANG=========");
				System.out.println("Moi ban lua chon mot chuc nang cap nhat");
				System.out.println("\t1. Them moi khach hang");
				System.out.println("\t2. Xem danh sach khach hang");
				System.out.println("\t3. Sua khach hang");
				System.out.println("\t4. Xoa khach hang");
				System.out.println("\t5. Sap xep danh sach khach hang");
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
			System.out.println("\n---------THEM MOI MOT KHACH HANG VAO DANH SACH---------");
			
			System.out.print("Nhap ten loai hang moi: ");
			String name = sc.nextLine();
			
			if (name.trim().length() == 0) {
				System.out.println("Ten loai hang khong duoc de trong!");
				return;
			}
			
			
			KhachHang kh = new KhachHang(autoNumber++, name);
			//+ Add vao list
			list.add(kh);
			System.out.println("Them moi thanh cong, bam 2 xem lai danh sach");
		}

		private static void xem() {
			System.out.println("\n---------DANH SACH KHACH HANG---------");
			System.out.printf("%3s %3s %-20s%n", "STT", "ID", "Ten loai hang");
			int stt = 1;
			for (KhachHang x : list) {
				System.out.printf("%3d ", stt++);
				x.display();
			}
			if (stt == 1) {
				System.out.println("Danh sach rong!");
			}
			System.out.println("\nCo tong cong " + list.size() + " khach hang");
		}

		private static void sua() {
			System.out.println("\n---------SUA THONG TIN KHACH HANG---------");
			
			System.out.println("\tNhap ma (id) khach hang can sua: ");
			int id = Integer.parseInt(sc.nextLine());
			
			int index = indexOf(id);
			if(index == -1) {
				System.out.println("\tKhach hang khong co trong danh sach");
				return;
			}
			System.out.print("Nhap ten moi cho khach hang: ");
			String name = sc.nextLine();
			if (name.trim().length() == 0) {
				System.out.println("\tTen khach hang khong duoc de trong!");
				return;
			}
			list.get(index).setName(name);
			System.out.println("\tSua ten khach hang thanh cong!");
		}

		private static void xoa() {
			System.out.println("\n---------XOA THONG TIN KHACH HANG---------");
			
			System.out.println("\tNhap ma (id) khach hang can xoa: ");
			int id = Integer.parseInt(sc.nextLine());
			
			//Can ham tim id trong dslh
			int index = indexOf(id);
			if(index == -1) {
				System.out.println("\tKhach hang khong co trong danh sach");
				return;
			}
			list.remove(index);
			System.out.println("\tXoa khach hang thanh cong!");
		}

		private static void sap() {
			Collections.sort(list, new Comparator<KhachHang>() {
				@Override
				public int compare(KhachHang o1, KhachHang o2) {
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
			for (KhachHang x : list) {
				if(x.getID() == id){
					return x.getName();
				}
			}
			return null;
		}
	}
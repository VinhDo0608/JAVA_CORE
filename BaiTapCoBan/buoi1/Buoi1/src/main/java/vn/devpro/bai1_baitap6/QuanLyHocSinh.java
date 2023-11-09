package vn.devpro.bai1_baitap6;

public class QuanLyHocSinh {
	
	public static void main(String[] args) {
		// Khai bao va khoi tao 1 doi tuong hoc sinh
		HocSinh hocSinh1 = new HocSinh();
		System.out.println("Nhap du lieu cho doi tuong hoc sinh 1: ");
		hocSinh1.nhap();//goi phuong thuc nhap
		
		HocSinh hocSinh2 = new HocSinh();
		System.out.println("Nhap du lieu cho doi tuong hoc sinh 2: ");
		hocSinh2.nhap();
		HocSinh hocSinh3 = new HocSinh();
		System.out.println("Nhap du lieu cho doi tuong hoc sinh 3: ");
		hocSinh3.nhap();
		//hien thi thong tin hoc sinh 
		System.out.println("\t\t\tDANH SACH HOC SINH");
		System.out.printf("%-3s %-25s %-10s %-9s %-7s %-10s%n", 
				"STT", "Ho va ten", "Ngay sinh" , "Gioi Tinh", "Diem TB", "Dao Duc");
		int stt = 1;
		System.out.printf("%3d", stt++);
		hocSinh1.hienThi();
		System.out.printf("%3d", stt++);
		hocSinh2.hienThi();
		System.out.printf("%3d", stt++);
		hocSinh3.hienThi();
		
	}

}

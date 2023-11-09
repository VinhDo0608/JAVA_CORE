package vn.devpro.qlsv.hienthi;


import java.util.ArrayList;
import vn.devpro.qlsv.capnhat.MonHoc;
import vn.devpro.qlsv.capnhat.QuanLyDiem;
import vn.devpro.qlsv.capnhat.SinhVien;

public class DanhSachSinhVien {

	private SinhVien sv;
	private ArrayList<MonHoc> list_mh;
	
	public DanhSachSinhVien() {
		super();
	}

	public DanhSachSinhVien(SinhVien sv, ArrayList<MonHoc> list_mh) {
		super();
		this.sv = sv;
		this.list_mh = list_mh;
	}
	
	public void display() {
		System.out.println("\n---------THONG TIN SINH VIEN---------");
		System.out.println("\tMa sinh vien: " + sv.getID_SV() + "\t\tHo va ten: "+ sv.getfName() + " " + sv.getlName());
		System.out.println("\tNam sinh: " + sv.getDateOB() + "\t\t\tGioi tinh: " + sv.getGender());
		System.out.printf("%n%3s %5s %-35s %5s %-5s%n", "STT", "Ma mon", "Ten mon", "He so", "Diem");
		int stt = 1;
		for (MonHoc x : list_mh) {
			System.out.printf("%3d ", stt++);
			System.out.printf("%3d %-35s %8.3f %4.2f%n", x.getID_MH(), x.getName(), x.getCoefficient(), QuanLyDiem.getList().get(QuanLyDiem.indexOf(x.getID_MH(), sv.getID_SV())).getDiem());
		}
		System.out.printf("Tong diem cua sinh vien: %32.2f", QuanLyDiem.tongDiem(sv.getID_SV()));

	}
}
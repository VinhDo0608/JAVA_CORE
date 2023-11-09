package vn.devpro.baitap4;

public class QLHD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HoaDon hd = new HoaDon();
		HoaDon.nhap(hd);
		
		HoaDon.xuat(hd);
		
		System.out.println("Tong tien hang la: "+ HoaDon.tongTien(hd));
		System.out.println("Tien phai tra (da cong thue GTGT(10%)): " + HoaDon.tienPT(hd));
	}

}

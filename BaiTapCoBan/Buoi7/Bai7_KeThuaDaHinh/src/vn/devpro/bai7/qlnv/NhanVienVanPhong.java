package vn.devpro.bai7.qlnv;

public class NhanVienVanPhong extends NhanVien {
	
	private double mucLuong;
	private double ngayNghi;
	
	public void nhap() {
		super.nhap();
		System.out.print("\tMuc luong: ");
		this.mucLuong = Double.parseDouble(sc.nextLine());
		System.out.print("\tSo ngay nghi: ");
		this.ngayNghi = Double.parseDouble(sc.nextLine());
	}
	
	@Override
	public double luong() {
		// TODO Auto-generated method stub
		return this.mucLuong - this.ngayNghi * 25000 + 150 + this.nam * 50000;
	}
	
	public void hienThi() {
		super.hienThi();
		System.out.printf("%,13.1f %8.1f %,14.2f%n", this.mucLuong, this.ngayNghi, this.luong());
	}
}

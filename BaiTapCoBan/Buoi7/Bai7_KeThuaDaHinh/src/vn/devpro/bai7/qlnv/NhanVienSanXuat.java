package vn.devpro.bai7.qlnv;

public class NhanVienSanXuat extends NhanVien {
	
	private double sanPham;
	
	public void nhap() {
		super.nhap();
		System.out.print("\tSo san pham: ");
		this.sanPham = Double.parseDouble(sc.nextLine());
	}
	
	@Override
	public double luong() {
		// TODO Auto-generated method stub
		return this.sanPham * 35000 + 150000 + this.nam * 50000;
	}
	
	public void hienThi() {
		super.hienThi();
		System.out.printf("%13s %8.1f %,14.2f%n", " ", this.sanPham, this.luong());
	}

}

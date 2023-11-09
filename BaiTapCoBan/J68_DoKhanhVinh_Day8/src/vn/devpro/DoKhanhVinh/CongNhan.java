package vn.devpro.DoKhanhVinh;

public class CongNhan extends NhanSu{
	private String maXuong;
	private String congViec;
	private double soNgayCong;
	
	public CongNhan() {
		super();
	}

	public CongNhan(int maNs, String hoDem, String ten, int namSinh, String gioiTinh, String maXuong, String congViec,
			double soNgayCong) {
		super(maNs, hoDem, ten, namSinh, gioiTinh);
		this.maXuong = maXuong;
		this.congViec = congViec;
		this.soNgayCong = soNgayCong;
	}
	
	public void xuat() {
		super.xuat();
		String tenXuong = DanhSachXuong.kTraTen(maXuong);
		System.out.printf("%-12s %-15s %-15s %8s %8.2f %-10s %-,15.3f%n",
				tenXuong," ", congViec," ", soNgayCong, " ", luong());
	}
	
	public double luong() {
		if(soNgayCong >= 23)
			return soNgayCong * 250000 + 500000;
		else if(soNgayCong >= 20)
			return soNgayCong * 250000 + 300000;
		else if(soNgayCong >= 18)
			return soNgayCong * 250000;
		else
			return soNgayCong * 250000 - 200000;
	}
}

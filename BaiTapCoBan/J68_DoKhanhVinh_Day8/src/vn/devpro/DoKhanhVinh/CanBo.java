package vn.devpro.DoKhanhVinh;

public class CanBo extends NhanSu{
	private String maPhong;
	private String chucVu;
	private double heSoLuong;
	private String xepLoai;
	
	public CanBo() {
		super();
	}

	public CanBo(int maNs, String hoDem, String ten, int namSinh, String gioiTinh, String maPhong, String chucVu,
			double heSoLuong, String xepLoai) {
		super(maNs, hoDem, ten, namSinh, gioiTinh);
		this.maPhong = maPhong;
		this.chucVu = chucVu;
		this.heSoLuong = heSoLuong;
		this.xepLoai = xepLoai;
	}
	
	public void xuat() {
		super.xuat();
		String tenPhong = DanhSachPhong.kTraTen(maPhong);
		System.out.printf("%-12s %-15s %-15s %8.2f %8s %-10s %-,15.3f%n",
				tenPhong, chucVu," ", heSoLuong," ", xepLoai, luong());
	}
	
	public double luong() {
		if(xepLoai.equals("A"))
			return heSoLuong * 1150000 + 1000000;
		else if(xepLoai.equals("B"))
			return heSoLuong * 1150000;
		else if(xepLoai.equals("C"))
			return heSoLuong * 1150000 - 400000;
		return 0;
	}
}

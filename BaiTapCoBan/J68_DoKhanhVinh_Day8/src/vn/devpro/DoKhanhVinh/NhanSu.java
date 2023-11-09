package vn.devpro.DoKhanhVinh;

public class NhanSu {
	private int maNs;
	private String hoDem;
	private String ten;
	private int namSinh;
	private String gioiTinh;
	
	public NhanSu() {
		super();
	}
	
	public NhanSu(int maNs, String hoDem, String ten, int namSinh, String gioiTinh) {
		super();
		this.maNs = maNs;
		this.hoDem = hoDem;
		this.ten = ten;
		this.namSinh = namSinh;
		this.gioiTinh = gioiTinh;
	}

	public void xuat() {
		System.out.printf("%10d %-20s %8d %-10s ",
				maNs, hoDem + " " + ten, namSinh, gioiTinh);
	}
	
	public double luong() {
		return 0;
	}

	public int getMaNs() {
		return maNs;
	}

	public void setMaNs(int maNs) {
		this.maNs = maNs;
	}

	public String getHoDem() {
		return hoDem;
	}

	public void setHoDem(String hoDem) {
		this.hoDem = hoDem;
	}

	public String getTen() {
		return ten;
	}

	public void setTen(String ten) {
		this.ten = ten;
	}

	public int getNamSinh() {
		return namSinh;
	}

	public void setNamSinh(int namSinh) {
		this.namSinh = namSinh;
	}

	public String getGioiTinh() {
		return gioiTinh;
	}

	public void setGioiTinh(String gioiTinh) {
		this.gioiTinh = gioiTinh;
	}
}

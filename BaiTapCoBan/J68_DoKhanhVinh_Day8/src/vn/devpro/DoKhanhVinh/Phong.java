package vn.devpro.DoKhanhVinh;

public class Phong {
	private String maPhong;
	private String tenPhong;
	private String truongPhong;
	
	
	
	public Phong() {
		super();
	}

	public Phong(String maPhong, String tenPhong, String truongPhong) {
		super();
		this.maPhong = maPhong;
		this.tenPhong = tenPhong;
		this.truongPhong = truongPhong;
	}

	public String getMaPhong() {
		return maPhong;
	}

	public void setMaPhong(String maPhong) {
		this.maPhong = maPhong;
	}

	public String getTenPhong() {
		return tenPhong;
	}

	public void setTenPhong(String tenPhong) {
		this.tenPhong = tenPhong;
	}

	public String getTruongPhong() {
		return truongPhong;
	}

	public void setTruongPhong(String truongPhong) {
		this.truongPhong = truongPhong;
	}
	
}

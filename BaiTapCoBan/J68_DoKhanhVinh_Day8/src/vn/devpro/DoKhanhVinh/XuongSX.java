package vn.devpro.DoKhanhVinh;

public class XuongSX {
	private String maXuong;
	private String tenXuong;
	private String quanDoc;
	private int soCongDan;
	
	public XuongSX() {
		super();
	}
	
	public XuongSX(String maXuong, String tenXuong, String quanDoc, int soCongDan) {
		super();
		this.maXuong = maXuong;
		this.tenXuong = tenXuong;
		this.quanDoc = quanDoc;
		this.soCongDan = soCongDan;
	}

	public String getMaXuong() {
		return maXuong;
	}

	public void setMaXuong(String maXuong) {
		this.maXuong = maXuong;
	}

	public String getTenXuong() {
		return tenXuong;
	}

	public void setTenXuong(String tenXuong) {
		this.tenXuong = tenXuong;
	}

	public String getQuanDoc() {
		return quanDoc;
	}

	public void setQuanDoc(String quanDoc) {
		this.quanDoc = quanDoc;
	}

	public int getSoCongDan() {
		return soCongDan;
	}

	public void setSoCongDan(int soCongDan) {
		this.soCongDan = soCongDan;
	}

}

package vn.devpro.DoKhanhVinh;

public class DanhSachXuong {
private static int autoId = 200;
	
	private static XuongSX[] xuongSXs = new XuongSX[] {
			new XuongSX("X" + autoId++, "San xuat", "Khanh Vinh", 200),
			new XuongSX("X" + autoId++, "Boc Vac", "Duc Pham", 300),
			new XuongSX("X" + autoId++, "Det may", "Trang Hoang", 150),
			new XuongSX("X" + autoId++, "Co khi", "Duc Hung", 175),
	};
	
	public static String kTraTen(String ma) {
		for (XuongSX xuongSX : xuongSXs) 
			if(xuongSX.getMaXuong().trim().equals(ma.trim()))
				return xuongSX.getTenXuong();
		return "";
	}

	public static XuongSX[] getXuongSXs() {
		return xuongSXs;
	}

	public static void setXuongSXs(XuongSX[] xuongSXs) {
		DanhSachXuong.xuongSXs = xuongSXs;
	}
}

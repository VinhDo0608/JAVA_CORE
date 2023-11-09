package vn.devpro.DoKhanhVinh;

public class DanhSachPhong {
private static int autoId = 100;
	
	private static Phong[] phongs = new Phong[] {
			new Phong("P" + autoId++, "Hanh chinh" , "Pham Duc"),
			new Phong("P" + autoId++, "Nhan su" , "Do Vinh"),
			new Phong("P" + autoId++, "Tai chinh" , "Hoang Hung"),
			new Phong("P" + autoId++, "Ki thuat" , "Hoang Duy"),
	};
	
	public static String kTraTen(String ma) {
		for(Phong phong : phongs)
			if(phong.getMaPhong().trim().equals(ma.trim()))
				return phong.getTenPhong();
		return "";
	}

	public static Phong[] getPhongs() {
		return phongs;
	}

	public static void setPhongs(Phong[] phongs) {
		DanhSachPhong.phongs = phongs;
	}
}

package vn.devpro.trenlop.vd04;

public class QuanLySach {
	
	public static void buying(Sach s, int amount) throws IllegalArgumentException {
		if (s.getAmount() < amount) {
			throw new IllegalArgumentException("So luong sach khong du ban!");
		}
		
		System.out.println("Ban da dat mua " + amount + " cuon sach");
		s.setAmount(s.getAmount() - amount);
	}
	
	public static void main(String[] args) {
		Sach sach = new Sach("Java Programming", 10);
		try {
			buying(sach, 8);
		} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}
		finally {
			System.out.println("Cam on ban da den cua hang!");
		}
	}
}

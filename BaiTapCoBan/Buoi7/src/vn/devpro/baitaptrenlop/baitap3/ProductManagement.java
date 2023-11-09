package vn.devpro.baitaptrenlop.baitap3;

public class ProductManagement {
	
	public static void display(Product[] list) {
		System.out.println("Danh sach san pham");
		for (Product x : list) {
			x.display();
		}
	}
	
	public static void displayTivi(Product[] list) {
		System.out.println("\nDanh sach ti vi");
		for (Product x : list) {
			if (x instanceof Tivi) {
				x.display();
			}
		}
	}
	
	public static void displayComputer(Product[] list) {
		System.out.println("\nDanh sach may tinh");
		for (Product x : list) {
			if (x instanceof Computer) {
				x.display();
			}
		}
	}
	
	public static void main(String[] args) {
		Product[] list = new Product[] {
				new Tivi("1001", "TV sony", 10, 900, "Sony", 70, "Sony", 48.5),
				new Computer("1002", "MT Acer", 8, 700, "Acer", 12, 256, 8, 2.3),
				new Tivi("1003", "TV sony", 10, 900, "Sony", 70, "Sony", 48.5),
				new Computer("1004", "MT Acer", 8, 700, "Acer", 12, 256, 8, 2.3),
				new Tivi("1005", "TV sony", 10, 900, "Sony", 70, "Sony", 48.5),
				new Tivi("1006", "TV sony", 10, 900, "Sony", 70, "Sony", 48.5),
				new Computer("1007", "MT Acer", 8, 700, "Acer", 12, 256, 8, 2.3)
	};
		display(list);
		displayTivi(list);
		displayComputer(list);
	}
}
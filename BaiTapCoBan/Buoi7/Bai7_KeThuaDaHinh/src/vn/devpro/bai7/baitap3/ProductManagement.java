package vn.devpro.bai7.baitap3;

public class ProductManagement {

	//Ham hien thi danh sach hon hop
	public static void display(Product[] list) {
		System.out.println("Danh sach san pham");
		for (Product x : list)
			x.display();
	}
	
	//Ham hien thi danh sach tivi
	public static void displayTivi(Product[] list) {
		System.out.println("\nDanh sach ti vi");
		for (Product x : list)
			if (x instanceof Tivi)
				x.display();
	}
	
	//Ham hien thi danh sach may tinh
	public static void displayComputer(Product[] list) {
		System.out.println("\nDanh sach may tinh");
		for (Product x : list)
			if (x instanceof Computer)
				x.display();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Tao danh sach gom ca tivi va may tinh
		Product[] list = new Product[] {
				new Tivi("1001", "TV sony", 10, 900, "Sony", 70, "Sony", 48.5),
				new Computer("1002", "MT Acer", 8, 7000, "Acer", 12, 256, 8, 2.3),
				new Tivi("1003", "TV sony", 10, 900, "Sony", 70, "Sony", 48.5),
				new Computer("1004", "MT Acer", 8, 7000, "Acer", 12, 256, 8, 2.3),
				new Tivi("1005", "TV sony", 10, 900, "Sony", 70, "Sony", 48.5),
				new Tivi("1006", "TV sony", 10, 900, "Sony", 70, "Sony", 48.5),
				new Computer("1007", "MT Acer", 8, 7000, "Acer", 12, 256, 8, 2.3)
		};
		
		display(list);
		displayTivi(list);
		displayComputer(list);
	}

}

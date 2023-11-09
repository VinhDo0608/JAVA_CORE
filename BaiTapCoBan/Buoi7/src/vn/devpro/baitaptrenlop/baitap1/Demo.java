package vn.devpro.baitaptrenlop.baitap1;

public class Demo {
	public static void main(String[] args) {
		TamGiac tg = new TamGiac();
		tg.nhap();
		System.out.printf("Dien tich tam giac = %.3f", tg.dienTich());
	}
}

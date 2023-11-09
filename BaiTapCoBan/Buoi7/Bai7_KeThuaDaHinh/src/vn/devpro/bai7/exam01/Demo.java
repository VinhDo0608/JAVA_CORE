package vn.devpro.bai7.exam01;

public class Demo {

	public static void main(String[] args) {
		TamGiac tg = new TamGiac();
		tg.nhap();
		System.out.printf("Dien tich tam giac la: %.3f", tg.dienTich());
	}
}

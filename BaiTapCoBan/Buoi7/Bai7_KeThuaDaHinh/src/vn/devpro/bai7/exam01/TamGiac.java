package vn.devpro.bai7.exam01;

public class TamGiac extends DoanThang {
	
	private Diem C = new Diem();
	
	public void nhap() {
		super.nhap(); //Nhap toa do 2 diem A, B ma lop TamGiac ke thua tu lop DoanThang
		System.out.println("Nhap toa do diem C");
		C.nhap();
	}
	
	public double dienTich() {
		double a = B.kc(C);
		double b = A.kc(C);
		double c = A.kc(B);
		double p = (a + b + c) / 2;
		return Math.sqrt(p * (p - a) * (p - b) * (p - c));
	}

	public TamGiac() {
		super();
	}

	public TamGiac(Diem a, Diem b, Diem c) {
		super(a, b);
		C = c;
	}

	public Diem getC() {
		return C;
	}

	public void setC(Diem c) {
		C = c;
	}
}

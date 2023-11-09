package vn.devpro.bai7.exam01;

public class DoanThang {
	
	protected Diem A = new Diem();
	protected Diem B = new Diem();
	
	public void nhap() {
		System.out.println("Nhap toa do diem A");
		A.nhap();
		System.out.println("Nhap toa do diem B");
		B.nhap();
	}
	
	public DoanThang() {
		super();
	}

	public DoanThang(Diem a, Diem b) {
		super();
		A = a;
		B = b;
	}

	public Diem getA() {
		return A;
	}

	public void setA(Diem a) {
		A = a;
	}

	public Diem getB() {
		return B;
	}

	public void setB(Diem b) {
		B = b;
	}

}

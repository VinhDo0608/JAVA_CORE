package vn.devpro.baitaptrenlop.baitap1;

public class DoanThang {
	protected Diem A = new Diem();
	protected Diem B = new Diem();
	
	public void nhap() {
		System.out.println("Nhap toa do diem A: ");
		A.nhap();
		System.out.println("Nhap toa do diem B: ");
		B.nhap();
	}
	
	public DoanThang() {
		super();
	}
	public DoanThang(Diem a, Diem b) {
		super();
		this.A = A;
		this.B = B;
	}
	public Diem getA() {
		return A;
	}
	public void setA(Diem A) {
		this.A = A;
	}
	public Diem getB() {
		return B;
	}
	public void setB(Diem B) {
		this.B = B;
	}
	
	
}

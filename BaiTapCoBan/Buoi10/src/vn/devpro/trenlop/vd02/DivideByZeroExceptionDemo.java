package vn.devpro.trenlop.vd02;

public class DivideByZeroExceptionDemo {

	public static void dividing(float a, float b) throws DivideByZeroException {
		if (b == 0) {
			throw new DivideByZeroException("Loi chia cho 0");
		}
		float c = a / b;
		System.out.println("ket qua: " + c);
	}

	public static void main(String[] args) {
		float a = 10, b = 0;
		
		try {
			dividing(a, b);
		} catch (DivideByZeroException e) {
			System.out.println(e.getMessageError());
		}
	}
}

package vn.devpro.trenlop.vd01;

public class Example01 {
	
	public static void main(String[] args) {
		int a = 10, b = 0;
		String str = "32Ab2";
		
		try {
			int c = a / b;
			int d = Integer.parseInt(str);
			
			System.out.println("c = " + c);
			System.out.println("d = " + d);
		} 
		catch (ArithmeticException e1) {
			System.out.println(e1.getMessage());
		} 
		catch (NumberFormatException e2) {
			System.out.println(e2.getMessage());
		}
	}
}

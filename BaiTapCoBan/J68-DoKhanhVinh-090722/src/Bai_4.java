import java.util.Scanner;

public class Bai_4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap canh a: ");
		double a = sc.nextDouble();
		System.out.println("Nhap canh b: ");
		double b = sc.nextDouble();
		System.out.println("Nhap canh c: ");
		double c = sc.nextDouble();
		double p = a+b+c;
		double d = p/2;
		double s = Math.sqrt(d*(d-a)*(d-b)*(d-c));
		System.out.println("Chu vi tam giac la: " + p);
		System.out.println("Dien tich tam giac la: " + s);
    }
}

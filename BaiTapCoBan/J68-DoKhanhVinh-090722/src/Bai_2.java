import java.util.Scanner;
import java.lang.*;
public class Bai_2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ban kinh hinh tron: ");
		double r = sc.nextDouble();
		double p = 2*Math.PI*r;
		double s = Math.PI*r*r;
		System.out.println("Chu vi hcn la: "+p);
		System.out.println("Dien tich hcn la: "+s);
    }
}

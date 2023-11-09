import java.util.Scanner;

public class Bai_5 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap chieu dai: ");
        double a = sc.nextDouble();
        System.out.println("Nhap chieu rong: ");
        double b = sc.nextDouble();
        System.out.println("Nhap chieu cao: ");
        double h = sc.nextDouble();
        double sXQ = 2*h*(a+b);
        double sTP = sXQ + 2*a*b;
        double v = a*b*h;
        System.out.println("Dien tich xung quanh la: "+sXQ);
        System.out.println("Dien tich toan phan la: "+sTP);
        System.out.println("The tich la: "+v);
    }
}

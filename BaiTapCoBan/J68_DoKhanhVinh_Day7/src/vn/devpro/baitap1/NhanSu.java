package vn.devpro.baitap1;

import java.util.Scanner;

public class NhanSu {
	protected int code;
    protected String surname;
    protected String name;
    protected Date dayOfBirth;

    public String getName() {
        return name;
    }

    public void nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ma nhan su: ");
        code = Integer.parseInt(sc.nextLine());
        System.out.println("Nhap ho dem: ");
        surname = sc.nextLine();
        System.out.println("Nhap ten: ");
        name = sc.nextLine();
        System.out.println("Nhap ngay sinh(dd/MM/yyyy): ");
        int _day = sc.nextInt();
        int _month = sc.nextInt();
        int _year = sc.nextInt();
        dayOfBirth = new Date(_day,_month,_year);
    }
    public void xuat(){
        System.out.println("Ma nhan su: " + code);
        System.out.println("Ho dem: " + surname);
        System.out.println("Ten: " + name);
        System.out.println("Ngay sinh: " + dayOfBirth.getDay()+"-"+dayOfBirth.getMonth()+"-"+dayOfBirth.getYear());
    }
}

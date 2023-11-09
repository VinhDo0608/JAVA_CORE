import groovy.console.ui.SystemOutputInterceptor;

import java.util.Scanner;

public class MonThi {
    String maMT;
    String tenMT;
    double heSo;
    double diem;

    public void nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ma mon thi: ");
        maMT = sc.nextLine();
        System.out.print("Nhap ten mon thi: ");
        tenMT = sc.nextLine();
        System.out.print("Nhap he so: ");
        heSo = sc.nextDouble();
        System.out.print("Nhap diem: ");
        diem = sc.nextDouble();
    }

    public void xuat(){
        System.out.printf("\t\t\t%10s %-25s %5s %5s",
                maMT, tenMT, heSo, diem);
    }
}

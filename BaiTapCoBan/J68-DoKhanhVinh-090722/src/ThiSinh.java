import java.util.Scanner;

public class ThiSinh {
    String soBD;
    String hoDem;
    String ten;
    int ngay, thang, nam;
    MonThi monThi1 = new MonThi();
    MonThi monThi2 = new MonThi();
    MonThi monThi3 = new MonThi();


    public void nhap(){
        Scanner sc = new Scanner(System.in);

        System.out.print("\tNhap so bao danh: ");
        soBD = sc.nextLine();
        System.out.print("\tNhap ho dem thi sinh: ");
        hoDem = sc.nextLine();
        System.out.print("\tNhap ten thi sinh: ");
        ten = sc.nextLine();
        System.out.print("\tNhap ngay sinh: ");
        ngay = sc.nextInt();
        System.out.print("\tNhap thang sinh: ");
        thang = sc.nextInt();
        System.out.print("\tNhap nam sinh: ");
        nam = sc.nextInt();
        sc.nextLine();
        System.out.println("Nhap thong tin mon thi 1: ");
        monThi1.nhap();
        System.out.println("Nhap thong tin mon thi 2: ");
        monThi2.nhap();
        System.out.println("Nhap thong tin mon thi 3: ");
        monThi3.nhap();

    }

    public void xuat(){
        monThi1.xuat();
        monThi2.xuat();
        monThi3.xuat();
        System.out.printf("%10s %-30s %02d-%02d-%4d",
                soBD, hoDem + " "+ ten, ngay, thang, nam);
    }
}

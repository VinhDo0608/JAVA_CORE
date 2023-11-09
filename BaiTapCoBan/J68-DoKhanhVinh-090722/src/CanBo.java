import java.util.Scanner;

public class CanBo {
    String maCB;
    String hoVT;
    int ngay, thang , nam;
    double soNLV;
    double soGLT;
    double luong;

    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.print("\tNhap ma can bo: ");
        maCB = sc.nextLine();
        System.out.print("\tNhap ho va ten: ");
        hoVT = sc.nextLine();
        System.out.print("\tNhap ngay sinh: ");
        ngay = sc.nextInt();
        System.out.print("\tNhap thang sinh: ");
        thang = sc.nextInt();
        System.out.print("\tNhap nam sinh: ");
        nam = sc.nextInt();
        System.out.print("\tNhap so ngay lam viec: ");
        soNLV = sc.nextDouble();
        System.out.print("\tNhap so gio lam them: ");
        soGLT = sc.nextDouble();
    }

    public void hienThi() {
        luong = soNLV*350000 + soGLT*45000;
        System.out.printf("%10s %-30s %02d-%02d-%4d %17s %17s %20s%n",
                maCB, hoVT, ngay, thang, nam, soNLV, soGLT, luong);
    }

}

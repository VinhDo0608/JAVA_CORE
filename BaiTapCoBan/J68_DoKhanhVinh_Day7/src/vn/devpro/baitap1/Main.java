package vn.devpro.baitap1;

import java.text.Collator;
import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Main {
	public static CongNhan[] chen(CongNhan[] cns, CongNhan cn, int k){
        CongNhan[] _cns = new CongNhan[cns.length + 1];
        int j = 0;
        for (int i = 0; i < _cns.length; i++){
            _cns[i] = new CongNhan();
            if(i == k){
                _cns[i] = cn;
            }
            else {
                _cns[i] = cns[j];
                j++;
            }
        }
        return _cns;
    }

    public static boolean check(CongNhan cn){
        return cn.getWorkingDays() == 0;
    }

    public static int checkEmp(CongNhan[] _cns){
        int m = -1;
        for(int i = 0; i < _cns.length; i++){
            if (_cns[i].getWorkingDays() == 0){
                m = 1;
                break;
            }
        }
        if (m == -1 || m == _cns.length -1)
            return -1;
        return m;
    }

    public static void sapXepMang(String[] m) {
        Locale vn = new Locale("vi","VN");
        Collator col = Collator.getInstance(vn);
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m.length - i - 1; j++) {

                if(col.compare(m[j], m[j+1]) > 0 ) {
                    String tmp = m[j];
                    m[j] = m[j+1];
                    m[j+1] = tmp;
                }
            }
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so cong nhan: ");
        int n = sc.nextInt();
        CongNhan[] cns = new CongNhan[n];
        for (int i = 0; i < n; i++) {
            cns[i] = new CongNhan();
            cns[i].nhap();
        }
        for (int i = 0; i < n; i++) {
            System.out.println("Thong tin cong nhan thu " + (i + 1) + " la :");
            cns[i].xuat();
            System.out.println("\n");
        }


        for (int i = 0; i < n; i++) {
            if (cns[i].getSalary() < 5000000) {
                cns[i].xuat();
            }
        }

        int k;
        do {
            System.out.println("Nhap vi tri muon chen: ");
            k = sc.nextInt();
        }while (k < 0 || k >= cns.length);

        CongNhan cn = new CongNhan();
        System.out.print("Nhap thong tin cong nhan: ");
        cn.nhap();
        CongNhan[] _cns = chen(cns, cn, k);
        for (int i = 0; i < _cns.length; i++){
            _cns[i].xuat();
        }

        double sum = 0;
        for (int i = 0; i < _cns.length; i++){
            sum += _cns[i].getSalary();
        }
        System.out.println("Tong  luong tat ca cac cong nhan la: "+ sum);

        int m = checkEmp(_cns);
        int p = _cns.length-1;
        if(m != -1)
            for (int i = m; i < _cns.length; i++){
                if (p== i)
                    break;
                else {
                    if (check(_cns[i])){
                        if (!check(_cns[p])){
                            CongNhan tmp = _cns[i];
                            _cns[i] = _cns[p];
                            _cns[p] = tmp;
                        } else
                            i--;
                    }
                    p--;
                }
            }
        for (int i = 0; i < _cns.length; i++){
            _cns[i].xuat();
        }

        String[] sapXep = new String[_cns.length];
        for (int i = 0; i < _cns.length; i++)
            sapXep[i] = _cns[i].getName();
        sapXepMang(sapXep);
        System.out.println(Arrays.toString(sapXep));
    }}

package vn.devpro.baitap1;

import java.util.Scanner;

public class CongNhan extends NhanSu{
	private CongViec cv;
    private double coefficientsSalary;
    private double salary;
    private int workingDays;

    public CongViec getCv() {
		return cv;
	}

	public double getCoefficientsSalary() {
		return coefficientsSalary;
	}

	public void setCoefficientsSalary(double coefficientsSalary) {
		this.coefficientsSalary = coefficientsSalary;
	}

	public int getWorkingDays() {
		return workingDays;
	}

	public void setWorkingDays(int workingDays) {
		this.workingDays = workingDays;
	}

	public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getSalary(){
        return salary;
    }

    public void input(){
        super.nhap();
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap bac luong: ");
        coefficientsSalary = sc.nextDouble();
        System.out.println("Nhap so gio lam viec: ");
        workingDays = Integer.parseInt(sc.nextLine());
        System.out.println("Nhap ten cong viec: ");
        String _name = sc.nextLine();
        System.out.println("Nhap ma cong viec: ");
        int _code = Integer.parseInt(sc.nextLine());
        cv = new CongViec(_code, _name);
    }

    public void xuat(){
        super.xuat();
        System.out.println("He so luong: " + coefficientsSalary);
        System.out.println("So gio lam viec: " + workingDays);
        System.out.println("Ma cong viec: " + cv.getCode());
        System.out.println("Ten cong viec: " + cv.getName());
        this.calcuSalary();
    }

    public void calcuSalary(){
        salary = coefficientsSalary * 3500000 + workingDays * 60000;
        System.out.println("Luong: "+salary);
    }
}

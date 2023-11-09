package vn.devpro.baitap3;

import java.util.Scanner;

public class MarkTable {
	
	private Student student;
	private Subject[] list;
	
	public void display() {
		System.out.println("\t\t\tBANG DIEM SINH VIEN");
		this.student.display();
		System.out.printf("%3s %-11s %-25s %-10s %-7s%n", 
				"STT", "Ma hoc phan", "Ten hoc phan", "So tin chi", "Diem tong ket");
		int stt = 1;
		for (Subject s : this.list) {
			System.out.printf("%3d ", stt++);
			s.display();
		}
		System.out.printf("\t\tDiem tong ket: %.2f%n", this.finalMark());
	}
	
	public double finalMark() {
		double sumCredit = 0;
		double sumMark = 0;
		for (Subject s : this.list) {
			sumCredit += s.getCredit();
			sumMark += s.markByCredit();
		}
		return sumMark / sumCredit;
	}
	
	//Phuong thuc sua thong tin hoc phan
	public void updateSubject() {
		Scanner sc = new Scanner(System.in);
		System.out.println("\n-------SUA THONG TIN HOC PHAN--------");
		System.out.print("\tNhap ma hoc phan can sua: ");
		String code = sc.nextLine();
		//Tim xem code co trong ds hoc phan hay khong
		int index = indexOfSubject(code);
		if (index == -1) {
			System.out.println("\tHoc phan khong co trong danh sach");
			return;
		}
		//Co thi sua
		this.list[index].update();
	}
	
	//Ham tim code trong list hoc phan
	public int indexOfSubject(String code) {
		for (int index = 0; index < this.list.length; index++) {
			if (this.list[index].getCode().equals(code)) {
				return index;
			}
		}
		return -1;
	}
	public MarkTable() {
		super();
	}

	public MarkTable(Student student, Subject[] list) {
		super();
		this.student = student;
		this.list = list;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	public Subject[] getList() {
		return list;
	}

	public void setList(Subject[] list) {
		this.list = list;
	}
}
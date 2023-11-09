package vn.devpro.trenlop.baitap.baitap01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class StudentManagement {
	
	private static ArrayList<Student> list = new ArrayList<Student>();
	
	public static void init() {
		list.add(new Student(101, "Nguyen", "Nam", "21/10/2000", "Nam", "Java web"));
		list.add(new Student(102, "Nguyen", "Dong", "21/10/2000", "Nam", "Java web"));
		list.add(new Student(103, "Nguyen", "Bac", "21/10/2000", "Nam", "Java web"));
		list.add(new Student(104, "Nguyen", "Tay", "21/10/2000", "Nam", "Java web"));
		list.add(new Student(105, "Nguyen", "Phuong", "21/10/2000", "Nam", "Java web"));
		list.add(new Student(106, "Nguyen", "Anh", "21/10/2000", "Nam", "Java web"));
	}
	
	public static void display() {
		System.out.println("List of students");
		for (Student x : list) {
			System.out.println("\t" + x.toString());
		}
	}
	//chen them
	public static void insert(int index,Student x) {
		list.add(index, x);
	}
	//Sua thong tin hoc vien
	//Tim kiem theo ma sinh vien
	private static int indexOf(int code) {
		for (int index = 0; index < list.size(); index++) {
			if (list.get(index).getCode() == code) {
				return index;
			}
		}
		return -1;
	}
	//Ham sua thong tin hoc vien
	public static void update(int choice) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap ma hoc vien can sua: ");
		int code = Integer.parseInt(sc.nextLine());
		
		int index = indexOf(code);
		if (index == -1) {
			System.out.println("Hoc vien khong co trong danh sach!");
			return;
		}
		switch (choice) {
		case 1:
			System.out.print("Enter a new last name: ");
			list.get(index).setlName(sc.nextLine());
			break;
		case 2:
			System.out.print("Enter a new first name: ");
			list.get(index).setfName(sc.nextLine());
			break;
		}
	}
	//Xoa thong tin hoc vien
	public static void delete() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap ma hoc vien can xoa: ");
		int code = Integer.parseInt(sc.nextLine());
		
		int index = indexOf(code);
		if (index == -1) {
			System.out.println("Hoc vien khong co trong danh sach!");
			return;
		}
		list.remove(index);
	}
	//Ham sap xep danh sach
	public static void sort() {
		Collections.sort(list, new Comparator<Student>() {
			@Override
			public int compare(Student o1, Student o2) {
				return o1.getlName().trim().compareToIgnoreCase(o2.getlName().trim());
			}
		});
	}
	
	public static void main(String[] args) {
		init();
		display();
		insert(2, new Student(107, "Tran", "Oanh", "02/11/1999", "Nu", "English"));
		display();
		update(1);
		display();
		delete();
		display();
		sort();
		display();
	}
}

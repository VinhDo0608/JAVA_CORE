package vn.devpro.buoi11.exam02;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class StreamDemo {

	static Scanner sc = new Scanner(System.in);

	// Tao mot file moi de luu cac ky tu - FileOutputStream
	public static void fileOutputStreamDemo() {
		String path = "D:\\Java68\\Data\\Data1\\input.txt";
		FileOutputStream fout = null;
		try {
			fout = new FileOutputStream(path);
			for (int letter = 'A'; letter <= 'Z'; letter++) {
				fout.write(letter);
				fout.write(32);
			}
		} catch (IOException e) {
			System.out.println(e.getMessage());
		} finally {
			try {
				fout.close();
			} catch (IOException e) {
				System.out.println(e.getMessage());
			}
		}
	}

	// Doc cac ky tu tu file van ban - FileInputStream
	public static void fileInputStreamDemo() {
		String path = "D:\\Java68\\Data\\Data1\\input.txt";
		FileInputStream fin = null;
		try {
			fin = new FileInputStream(path);
			int x = fin.read();
			while (x != -1) {
				System.out.print((char) x);
				x = fin.read();
			}
		} catch (IOException e) {
			System.out.println(e.getMessage());
		} finally {
			try {
				fin.close();
			} catch (IOException e) {
				System.out.println(e.getMessage());
			}
		}
	}

	// Ghi du lieu nhi phan - DataOutputStream
	public static void dataOutputStreamDemo() {
		String path = "D:\\Java68\\Data\\Data2\\input2.txt";
		FileOutputStream file = null;
		DataOutputStream fout = null;
		int a = 1000;
		long b = -32768L;
		float c = 234.32F;
		double y = -187564.213;
		try {
			file = new FileOutputStream(path);
			fout = new DataOutputStream(file);
			fout.writeInt(a);
			fout.writeLong(b);
			fout.writeFloat(c);
			fout.writeDouble(y);
		} catch (IOException e) {
			System.out.println(e.getMessage());
		} finally {
			try {
				fout.close();
				file.close();
			} catch (IOException e) {
				System.out.println(e.getMessage());
			}
		}
	}

	public static void dataInputStreamDemo() {
		String path = "D:\\Java68\\Data\\Data2\\input2.txt";
		FileInputStream file = null;
		DataInputStream fin = null;
		int a = 0;
		long b = 0;
		float c = 0;
		double y = 0;
		try {
			file = new FileInputStream(path);
			fin = new DataInputStream(file);
			a = fin.readInt();
			b = fin.readLong();
			c = fin.readFloat();
			y = fin.readDouble();
		} catch (IOException e) {
			System.out.println(e.getMessage());
		} finally {
			try {
				fin.close();
				file.close();
			} catch (IOException e) {
				System.out.println(e.getMessage());
			}
		}
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		System.out.println("c = " + c);
		System.out.println("y = " + y);
	}

	// Ghi du lieu nhi phan - ObjectOutputStream - (du lieu doi tuong)
	public static void objectOutputStreamDemo() {
		String path = "D:\\Java68\\Data\\Data3\\input3.txt";
		FileOutputStream file = null;
		ObjectOutputStream fout = null;
		Student s = new Student(1001, "Nguyen Anh Tien", 20, "Nam");
		
		try {
			file = new FileOutputStream(path);
			fout = new ObjectOutputStream(file);
			fout.writeObject(s);
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				file.close();
				fout.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	//Doc du lieu object - ObjectInputStream
	public static void objectInputStreamDemo() {
		String path = "D:\\Java68\\Data\\Data3\\input3.txt";
		FileInputStream file = null;
		ObjectInputStream fin = null;
		Student s = null;
		
		try {
			file = new FileInputStream(path);
			fin = new ObjectInputStream(file);
			s = (Student)fin.readObject();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} finally {
			try {
				fin.close();
				file.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		if (s == null) {
			System.out.println("Loi doc file!");
		} else {
			System.out.println("Thong tin sinh vien");
			System.out.println(s.toString());
		}
	}
	
	//Ghi chuoi (dong) van ban ra file text - FileWriter va BufferedWriter
	public static void bufferedWriterDemo() {
		String path = "D:\\Java68\\Data\\Data4\\input4.txt";
		FileWriter file = null;
		BufferedWriter buff = null;
		try {
			file = new FileWriter(path);
			buff = new BufferedWriter(file);
			buff.write("\tBai tho\n");
			buff.write("Trong dam gi dep bang sen\n");
			buff.write("La xanh bong trang lai chen nhi vang\n");
			buff.write("Nhi vang bong trang la xanh\n");
			buff.write("Gan bun ma chang hoi tanh mui bun\n");
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				buff.close();
				file.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	//doc chuoi (dong) van ban tu file text - FileReader va BufferedReader
		public static void bufferedReaderDemo() {
			String path = "D:\\Java68\\Data\\Data4\\input4.txt";
			FileReader file = null;
			BufferedReader buff = null;
			String line;
			try {
				file = new FileReader(path);
				buff = new BufferedReader(file);
				while ((line = buff.readLine()) != null) {
					System.out.println(line);
				}
			} catch (IOException e) {
				e.printStackTrace();
			} finally {
				try {
					buff.close();
					file.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	
	public static void main(String[] args) {
//		fileOutputStreamDemo();
//		fileInputStreamDemo();
//		dataOutputStreamDemo();
//		dataInputStreamDemo();
//		objectOutputStreamDemo();
//		objectInputStreamDemo();
//		bufferedWriterDemo();
		bufferedReaderDemo();
	}
}

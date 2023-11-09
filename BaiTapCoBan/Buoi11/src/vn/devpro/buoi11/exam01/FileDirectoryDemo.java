package vn.devpro.buoi11.exam01;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import javax.xml.transform.Source;

public class FileDirectoryDemo {
	
	static Scanner sc = new Scanner(System.in);
	
	//Ham tao thu muc moi tren o dia
	public static void taoThuMuc() {
		String path = "D:\\Java68\\Data\\Data5"; //Tao thu muc Data trong thu muc Java68
		File file = new File(path);
		if (file.exists()) {
			System.out.println("Thu muc da ton tai!");
		} else if (file.mkdir()) {
			System.out.println("Da tao thu muc moi!");
		} else {
			System.out.println("Loi duong dan!");
		}
		
	}
	
	//Test 1 so phuong thuc voi thu muc
	public static void directoriesTest() {
		String path = "D:\\Java68\\Data\\Data5";
		File file = new File(path);
		System.out.println("getName: " + file.getName());
		System.out.println("getPath: " + file.getPath());
		System.out.println("getParent: " + file.getParent());
	}
	
	//Mot so thao tac voi file
	public static void taoTepTin() {
		//Tao tep tin moi
		String path = "D:\\Java68\\Data\\Data5\\vanban.txt";
		File file = new File(path);
		try {
			if (file.exists()) {
				System.out.println("File 'vanban.txt' da ton tai!");
			} else if (file.createNewFile()) {
				System.out.println("Da tao file moi 'vanban.txt'!");
			} else {
				System.out.println("Loi duong dan!");
			}
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}
	
	//Thao tac doi ten file
	public static void doiTenFile() {
		String sourcePath = "D:\\Java68\\Data\\Data5\\vanban.txt";
		File file1 = new File(sourcePath);
		String desPath = "D:\\Java68\\Data\\Data5\\baitho.txt";
		File file2 = new File(desPath);
		if (file1.renameTo(file2)) {
			System.out.println("Da doi ten file!");
		} else {
			System.out.println("Loi duong dan hoac file khong ton tai!");
		}
	}
	
	//Liet ke danh sach file thu muc trong duong dan
	public static void listFolderAndFile() {
		String path = "D:\\Java68\\Data";
		File file = new File(path);
		String[] list = file.list();
		System.out.println("Danh sach file thu muc trong " + path + "\\");
		for (String x : list) {
			System.out.println("\t" + x);
		}
	}
	
	public static void main(String[] args) {
//		taoThuMuc();
//		directoriesTest();
//		taoTepTin();
//		doiTenFile();
		listFolderAndFile();
	}
}

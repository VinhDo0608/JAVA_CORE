package vn.devpro.buoi5;

import java.util.Calendar;

public class cal_enum {

	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		Calendar cal1 = Calendar.getInstance();
//		int day = cal.get(Calendar.DAY_OF_MONTH);
//		int month = cal.get(Calendar.MONTH) +1;
//		int year = cal.get(Calendar.YEAR);
//		System.out.println("Today is: " + day + "/" + month + "/" + year);
//		
//		String time = cal.get(Calendar.HOUR_OF_DAY) + ": ";
//		time = time + cal.get(Calendar.MINUTE) + ":";
//		time = time + cal.get(Calendar.SECOND) + ":";
//		System.out.println("Now is: " + time);
//		
//		//Hieu chinh gia tri cua calendar = add, roll
//		//add: lam anh huong den cac truong khac
//		//roll cuon va ko lam anh huong den cac truong khac
//		
//		cal.add(Calendar.DAY_OF_MONTH, 365);
//		day = cal.get(Calendar.DAY_OF_MONTH);
//		month = cal.get(Calendar.MONTH) + 1;
//		year = cal.get(Calendar.YEAR);
//		System.out.println("New day is: " + day + "/" + month + "/" + year);
//		
//		cal1.roll(Calendar.DAY_OF_MONTH, 365);
//		day = cal1.get(Calendar.DAY_OF_MONTH);
//		month = cal1.get(Calendar.MONTH);
//		year = cal1.get(Calendar.YEAR);
//		System.out.println("New day in cal1: " + day + "/" + month + "/" + year);
//		
//		cal.set(Calendar.YEAR, 2018);
//		day = cal.get(Calendar.DAY_OF_MONTH);
//		month = cal.get(Calendar.MONTH) + 1;
//		year = cal.get(Calendar.YEAR);
//		System.out.println("New day is: " + day + "/" + month + "/" + year);
		
		cal.set(2017, 12, 12, 0, 0, 0);
		int day = cal.get(Calendar.DAY_OF_MONTH);
		int month = cal.get(Calendar.MONTH) +1;
		int year = cal.get(Calendar.YEAR);
		System.out.println("New day is: " + day + "/" + month + "/" + year);
		String time = cal.get(Calendar.HOUR_OF_DAY) + ": ";
		time = time + cal.get(Calendar.MINUTE) + ": ";
		time = time + cal.get(Calendar.SECOND);
		System.out.println("Now is: " + time);
	}

}

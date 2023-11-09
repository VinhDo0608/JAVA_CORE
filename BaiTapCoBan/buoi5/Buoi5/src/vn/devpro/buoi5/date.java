package vn.devpro.buoi5;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class date {

	public static void main(String[] args) {
		Date date1 = new Date();
		System.out.println(date1.toString());
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
		String dateString = sdf.format(date1);
		System.out.println("Today is: " + date1);
		
		System.out.print("Nhap ngay sinh(dd/mm/yyyy) :" );
		String dateOfBirth = new Scanner(System.in).nextLine();
		try {
			SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
			Date date2 = sdf1.parse(dateOfBirth);
			System.out.println(date2.toString());
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}

}

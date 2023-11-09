package vn.devpro.trenlop.lythuyet;

import java.security.PublicKey;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

public class ArrayListDemo {

	public static void main(String[] args) {
		ArrayList list = new ArrayList<>();
		
		list.add(2);
		list.add(13.22);
		list.add("Nguyen Van Tien");
		
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		list.add(0, "Today is Sunday");
		
		System.out.println("\nAfter insert:");
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		list.set(1,  100);
		System.out.println("\nAfter replace:");
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		list.remove(2);
		System.out.println("\nAfter remove:");
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		ArrayList<String> listStr = new ArrayList<String>();
		listStr.add("John");
		listStr.add("Peter");
		listStr.add("Marry");
		
		System.out.println("\nList of name:");
		for (String x : listStr) {
			System.out.println("\t" + x);
		}
		listStr.add(0, "Beckham");
		
		Iterator<String> itor = listStr.iterator();
		while (itor.hasNext()) {
			System.out.println(itor.next());
		}
		
		//Sap xep
		Collections.sort(listStr, new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				return o1.compareTo(o2);
			}
		});
		
		System.out.println("\nList of name after sort:");
		for (String x : listStr) {
			System.out.println("\t" + x);
		}
	}

}

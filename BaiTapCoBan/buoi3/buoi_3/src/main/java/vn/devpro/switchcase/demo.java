package vn.devpro.switchcase;

public class demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int day = 4;
		String str;
		switch (day){
		case 0: str = "Sunday"; break;
		case 1: str = "Monday"; break;
		case 2: str = "Tuesday"; break;
		case 3: str = "Wednesday"; break;
		case 4: str = "Thursday"; break;
		case 5: str = "Friday"; break;
		case 6: str = "Saturday"; break;
		default: str = "Invalid day";
		} 
		System.out.println(str);

	}

}

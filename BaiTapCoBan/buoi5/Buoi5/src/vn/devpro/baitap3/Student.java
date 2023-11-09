package vn.devpro.baitap3;

public class Student {
	
	private String code;
	private String name;
	private String date;
	private String major;
	
	public void display() {
		System.out.println("\tMa sinh vien: " + code + "\tHo va ten: " + name);
		System.out.println("\tNgay sinh: " + date + "\tNganh hoc: " + major);
	}
	
	public Student() {
		super();
	}

	public Student(String code, String name, String date, String major) {
		super();
		this.code = code;
		this.name = name;
		this.date = date;
		this.major = major;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}
}
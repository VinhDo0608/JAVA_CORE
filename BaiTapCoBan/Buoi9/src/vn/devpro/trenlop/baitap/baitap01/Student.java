package vn.devpro.trenlop.baitap.baitap01;

public class Student {
	private int code;
	private String fName;
	private String lName;
	private String date;
	private String gender;
	private String course;
	
	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getfName() {
		return fName;
	}

	public void setfName(String fName) {
		this.fName = fName;
	}

	public String getlName() {
		return lName;
	}

	public void setlName(String lName) {
		this.lName = lName;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	@Override
	public String toString() {
		return "Student [code=" + code + ", fName=" + fName + ", lName=" + lName + ", date=" + date + ", gender=" + gender
				+ ", course=" + course + "]";
	}

	public Student() {
		super();
	}

	public Student(int code, String fName, String lName, String date, String gender, String course) {
		super();
		this.code = code;
		this.fName = fName;
		this.lName = lName;
		this.date = date;
		this.gender = gender;
		this.course = course;
	}
}

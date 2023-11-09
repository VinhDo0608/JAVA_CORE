package vn.devpro.buoi11.exam02;

import java.io.Serializable;

public class Student implements Serializable {
	int code;
	String name;
	int age;
	String gender;

	public Student(int code, String name, int age, String gender) {
		super();
		this.code = code;
		this.name = name;
		this.age = age;
		this.gender = gender;
	}

	public Student() {
		super();
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "Student [code=" + code + ", name=" + name + ", age=" + age + ", gender=" 
					+ gender + "]";
	}
	
	
}

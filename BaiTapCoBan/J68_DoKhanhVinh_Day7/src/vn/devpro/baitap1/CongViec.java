package vn.devpro.baitap1;

import java.util.Scanner;

public class CongViec {
	 private int code;
	    private String name;

	    CongViec(int code, String name){
	        this.code = code;
	        this.name = name;
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
}

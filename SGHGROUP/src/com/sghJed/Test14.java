package com.sghJed;

import java.util.ArrayList;

public class Test14 {
	
	private int rollNo;
	private String name;
	private boolean isRegistered;
	
	public Test14() {
		
	}
	
	public Test14(int rollNo, String name, boolean isRegistered) {
		this.rollNo = rollNo;
		this.name = name;
		this.isRegistered = isRegistered;
	}
	
	public int add(int a, int b) {
		int c = a + b;
		return c;
	}
	
	public static void main(String[] args) {
		Test14 stu1 = new Test14(1,"Asif",true);
		Test14 stu2 = new Test14(2,"Kiran",false);
		System.out.println(stu1.rollNo);
		System.out.println(stu1.name);
		System.out.println(stu1.isRegistered);
		System.out.println(stu1.add(20,80));
		System.out.println(stu2.rollNo);
		System.out.println(stu2.name);
		System.out.println(stu2.isRegistered);
		Test14 stu3 = new Test14();
		stu3.rollNo=3;
		stu3.name="Prakash";
		stu3.isRegistered = true;
		System.out.println(stu3.rollNo);
		System.out.println(stu3.name);
		System.out.println(stu3.isRegistered);
		
		ArrayList<Test14> arrayList = new ArrayList<>();
		arrayList.add(stu1);
		arrayList.add(stu2);
		arrayList.add(stu3);
		
		for(Test14 obj : arrayList) {
			System.out.println(obj.rollNo+" "+obj.name+" "+obj.isRegistered);
		}
		
	}

}

package com.sghJed;

import java.util.ArrayList;
import java.util.Iterator;

public class Test11 {

	public static void main(String[] args) {
//		Class c = Test11.class;
//		System.out.println(c.getClassLoader());
		ArrayList<Bank> arrList = new ArrayList<>();
		arrList.add(new Bank("Asif", 123, "Hyderabad"));
		arrList.add(new Bank("Kiran", 321, "Seccunderabad"));
		
		ArrayList<Integer> arr = new ArrayList<>();
		arr.add(1);
		arr.add(2);
		arr.add(3);
		
		Iterator ite = arr.iterator();
		while(ite.hasNext()) {
			System.out.println("Iterator: "+ite.next());
		}
		
//		for(int i : arr) {
//			if(i=1) {
//				continue;
//				System.out.println(arrList.)
//			}
//		}
				
		for(Bank b : arrList) {
			System.out.println(b.accNo+""+b.address+"");
			System.out.println(b);
		}
		
		
	}
}

class Bank{
	public String name;
	public int accNo;
	public String address;
	
	public Bank(String name, int accNo, String address) {
		this.name = name;
		this.accNo = accNo;
		this.address = address;
	}	
	
}
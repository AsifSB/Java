package com.sghJed;

import java.util.Iterator;
import java.util.LinkedList;



public class Test10 {

	public static void main(String[] args) {
		LinkedList<String> ls=new LinkedList<>();
		ls.add("abc");
		ls.add("bcd");
		ls.add("efg");
		//for(String s: ls) {
		//	System.out.println(s);
	//	}
		
		Iterator ir=ls.iterator();
		while(ir.hasNext()) {
			System.out.println(ir.next());
		}
	}
}

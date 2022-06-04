package com.sghJed;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Test16 {
	
	public static void main(String[] args) {
		HashSet<Integer> s=new HashSet();
		s.add(10);
		s.add(20);
		s.add(30);
		s.add(50);
		s.add(60);
		s.add(80);
		System.out.print(s);
		
		
	LinkedHashSet<Integer> s1=new LinkedHashSet();
	
		s1.add(10);
		s1.add(20);
		s1.add(30);
		s1.add(50);
		s1.add(null);
		s1.add(60);
		System.out.print(s1);
		
		TreeSet<String> s2=new TreeSet();
		
		s2.add("aaa");
		s2.add("bbb");
		s2.add("ccc");
		s2.add("ddd");
		s2.add("eee");
	//	s2.add(null);
		System.out.print(s2);
	
	
	}
	
	
}

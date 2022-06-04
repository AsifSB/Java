package com.sghJed;

import java.util.ArrayList;
import java.util.Iterator;

public class Test9 {
public static void main(String args[]) {
	
	
	ArrayList<Integer> as=new ArrayList<>();
	as.add(22);
	as.add(33);
	as.add(44);
	
	System.out.println("Before:");
	
	Iterator iterator = as.iterator();
	while(iterator.hasNext()) {
		System.out.println(iterator.next());
	}
	
	as.remove(0);
	
	System.out.println("After:");
	
	for (int i : as) {
    	System.out.println(i);
    }
	
}
}

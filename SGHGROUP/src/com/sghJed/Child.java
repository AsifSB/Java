package com.sghJed;

public class Child extends Parent{
	
	//Overriding
	public static int displayMyLuckyNumber() {		
		return 1001;
	}
	

	
	public static void main(String[] args) {
		Child c = new Child();
		System.out.println(c.displayMyLuckyNumber());
		
		
	}

}
//when we are overriding a method the return type should be sub type of Parent class return type is COVARIANT RETURN TYPE 
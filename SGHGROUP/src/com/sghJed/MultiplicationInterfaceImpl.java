package com.sghJed;

public abstract class MultiplicationInterfaceImpl implements MultiplicationInterface{
	
	public int add() {
		int a = 10;
		int b = 20;
		int result = a + b;
		return result;
	}
	
	public int sub() {
		int a = 10;
		int b = 20;
		int result = a - b;
		return result;
	}
	
	public int mul() {
		int a = 10;
		int b = 20;
		int result = a * b;
		return result;
	}

}

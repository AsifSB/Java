package com.sghJed;

public class Calculator {
	
	private int a;
	private int b;
	

	public Calculator(int a,int b) {
		this.a=a;
		this.b=b;
	}
	
	public int add(int a, int b) {		
		int sum = a + b;
		return sum;
	}
	public int mul(int c,int d) {
		int mul=c*d;
		return mul;
	}
	public double div(int e,int f) {
		double div=e/f;
		return div;
		
	}
	
	public static void main(String[] args) {
		Calculator cal = new Calculator(1,1);
		int someValue = cal.add(5000, 300);
		Calculator cal1=new Calculator(30,40);
		int xyz=cal.mul(40, 600);
		double abc=cal.div(990,50);
		System.out.println(someValue);
		System.out.println(abc);
		System.out.println(xyz);
	}
}

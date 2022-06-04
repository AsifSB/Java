package com.sghJed;

public class Test1 {

	public static void main(String[]args) {
		int x;
		x=5;
		{
			int y=6;
			System.out.println(x+" "+y);
		}
		//System.out.println(x+" "+y);-->It throws compilation error doesnot have access to Y its limited to a block
		System.out.println(x+" "+x);
	}
}

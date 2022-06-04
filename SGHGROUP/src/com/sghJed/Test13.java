package com.sghJed;

//deleting an array element of any specified index using for loop
import java.util.ArrayList;
import java.util.Arrays;

public class Test13 {

	public static void main(String[] args) {
		Test13 test = new Test13();
		int[] array3 = { 10, 20, 30, 40, 50 };
		int[] array4 = new int[4];

		array4 = test.deleteElement(array3, array4, 2);

		for (int j : array4) {
			System.out.println(j);
		}

	}
	
	
	public int[] deleteElement(int[] a, int[] b, int index) {
		for(int i = 0; i < a.length-1; i++) {
			if(i >= 0 && i<index) {
				b[i] = a[i];
			}else if(i >= index){
				b[i] = a[i+1];
			}else {
				continue;
			}
		}
		return b;
	}
}
package com.sghJed;
//deleting an array element using for loop
import java.util.ArrayList;
import java.util.Arrays;

public class Test12 {
	

	public static void main(String[]args) {
		
		int[] array1 = {10,20,30,40,50}; 
		int[] array2 = new int[4];
		
		int index = 2;
		
		for(int i = 0; i < array1.length-1; i++) {
			if(i >= 0 && i<1) {
				array2[i] = array1[i];
			}else if(i >= 1){
				array2[i] = array1[i+1];
			}else {
				continue;
			}
			
		}
		
		for(int j : array2) {
			System.out.println(j);
		}
		
	}
}


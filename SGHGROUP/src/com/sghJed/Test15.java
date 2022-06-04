package com.sghJed;

import java.util.ArrayList;
import java.util.Arrays;

public class Test15 {

	public static void main(String[] args) {
		int[] arr1 = {1,2,3,4};
		double[] arr2 = {1.2,2.3,3.2};
		float[] arr3 = {1.2F,2.3F,3.2F};
		ArrayList<Integer> arrList = new ArrayList<>();
        ArrayList<Double> arrList2 = new ArrayList<>();
        ArrayList<Float> arrList3 = new ArrayList<>(Arrays.asList(1.0F,2.2F,3.3F));
        ArrayList<Float> arrayList4 = new ArrayList<>();
        Test15[] objs = new Test15[2];
        objs[0] = new Test15();
        objs[1] = new Test15();
      System.out.println(objs[0]);
      System.out.println(objs[1]);
        
	}
}






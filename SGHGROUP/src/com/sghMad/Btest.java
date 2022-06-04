package com.sghMad;

public class Btest {
	
	 int[] A= {1,2,3,4,5,6};
     int[] B= new int[6];
	
	public static void main(String[]args) {
		
		Btest obj=new Btest();
	
	   for(int i=0;i<obj.A.length;i++) {
		   
			if(i==3) {
				continue;
			}
				
				obj.B[i]=obj.A[i];
				System.out.println(obj.B[i]);
			}	
		}
			
	}
	


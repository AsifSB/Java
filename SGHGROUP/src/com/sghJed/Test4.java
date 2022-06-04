package com.sghJed;
//why this is not showing as run Java application only getting option as Run Configuration
public class Test4 {
	int func (int n) 
    {
        int result;
        if (n == 1)
            return 1;
        result = func (n - 1);
        return result;
    }
	public static void main(String args[]) 
    {
        Test4 obj = new Test4() ;
        System.out.print(obj.func(5));
    }
} 


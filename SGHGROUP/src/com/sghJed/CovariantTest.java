package com.sghJed;

public class CovariantTest {

}

class Xyz{
	
}
class Abc extends Xyz{
	
}
class Sum{
   public Xyz fun() {
	  Xyz u = new Xyz();
	  
	   return u;
   }
   
}
class Mul extends Sum{
	public Abc fun() {
		Abc o = new Abc();
		return o;
	}
}
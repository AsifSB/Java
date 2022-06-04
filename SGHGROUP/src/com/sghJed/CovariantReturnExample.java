package com.sghJed;

public class CovariantReturnExample {

	public static void main(String[] args) {
		Base base = new Base();
		base.fun();
		Derived derived = new Derived();
		derived.fun();
	}
}

class A {
}

class B extends A{
}

class Base {
	public A fun() {
		System.out.println("Base fun");
		return new A();
	}
}

class Derived extends Base{
	@Override
	public B fun() {
		System.out.println("Derived fun");
		return new B();
	}
}


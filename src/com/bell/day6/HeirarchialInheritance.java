package com.bell.day6;

public class HeirarchialInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Child1 c2 = new Child1();
		Child2 c3 = new Child2();

		c2.PMethod();
		c3.PMethod();

	}

}

class Parent2 {
	public void PMethod() {
		System.out.println("Inside Parent");
	}
}

class Child1 extends Parent2 {

}

class Child2 extends Parent2 {

}
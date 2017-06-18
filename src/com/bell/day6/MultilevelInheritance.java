package com.bell.day6;

public class MultilevelInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Child c = new Child();
		c.GMethod(); // Multilevel Inheritance
		c.parMethod(); // c can access p; p can access g; so c can access g;

	}

}

class GrandParent {
	public void GMethod() {
		System.out.println("Inside GrandParent");
	}
}

class Parent extends GrandParent {
	int cash = 100000;
	String land = "50 Acres";

	void parMethod() {
		System.out.println("Parent property:" + cash + ", " + land);
	}
}

class Child extends Parent {
	void childMethod() {
		System.out.println("Inside the child class");
	}
}

package com.bell.day6;

public class SimpleInheritanceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ParentClass p = new ParentClass();
		p.parMethod();

		ChildClass c = new ChildClass();
		c.childMethod();

		c.parMethod(); // Simple Inheritance
		int d = c.cash;
	}

}

class ParentClass { // cannot use private or protected before class keyword
					// here.
	// Only Public, Final and Abstract keywords are allowed.

	int cash = 100000; // can use protected or public for inheritance.
						// so that sub classes can inherit the members of the
						// parent class.
						// cannot use private access modifier, this limits the
						// scope of the member to that class only.
	String land = "50 Acres";

	void parMethod() {
		System.out.println("Parent property:" + cash + ", " + land);
	}
}

class ChildClass extends ParentClass {
	void childMethod() {
		System.out.println("Inside the child class");
	}
}
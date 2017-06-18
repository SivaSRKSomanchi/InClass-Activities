package com.bell.day5;

public class StaticDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ABC abc = new ABC();
		abc.a = 20;
		abc.b = 20;
		abc.display();

		ABC abc1 = new ABC();
		// abc1.a = 30;
		// abc1.b = 30;
		abc1.display(); /*
						 * in memory: static variable will be loaded along with
						 * the class (Static variables belongs to class that
						 * means they doesn't belong object and we can access
						 * them directly using the class name.) only one copy of
						 * memory will be allocated for static variables, any
						 * no. of objects may created but all of them are
						 * referred to same memory location of that static
						 * variable
						 */

		ABC.display2(); // static members can access anywhere with class name.
	}

}

class ABC {

	int a = 10;
	static int b;

	void display() {
		System.out.println(a);
		System.out.println(b);
		display2(); // static members can be called inside non static members.
	}

	static void display2() {
		System.out.println("inside static method");

		// display(); *non static members cannot be access inside static
		// members.*

		ABC abc = new ABC();
		abc.display(); // non static members can be accessed inside static
						// members by creating class object only.

		display3(); /*
					 * Non static methods are not allowed directly. But inside
					 * static methods we can use static variables and static
					 * methods
					 */
	}

	static void display3() {
		System.out.println("Inside Second Static Method");
	}
}

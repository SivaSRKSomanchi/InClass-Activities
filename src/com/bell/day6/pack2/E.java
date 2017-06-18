package com.bell.day6.pack2;

import com.bell.day6.pack1.ClassA;

public class E {

	void method() {
		ClassA aobj = new ClassA();
		System.out.println(aobj.x);
		// System.out.println(aobj.y); // default not good
		// System.out.println(aobj.z);// protected not good
		// System.out.println(aobj.p); // private not good
	}

}

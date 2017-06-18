package com.bell.day5;

public class StudentRecorder {

	int y; // Instance Variable, declared inside the class without Static
			// keyword.
	Student s; /*
				 * Instance Variable, declared inside the class without Static
				 * keyword. Reference variables can be a instance variables
				 */

	static int x; //

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a;

		float c; /*
				 * Primitive Variables: memorySize - Float is of 4 bytes.
				 * default value 0.0 Declared with primitive type "float"
				 */

		Student b; /*
					 * ReferenceVariables: memorySize - 8 bytes. default value
					 * null Declared with Class type "Student"
					 */

		Student sdt = new Student(); // reference variables stores the address
										// of the object.
		sdt.setName("Santhosh");
		Student sdt1 = new Student();
		System.out.println(sdt.getName());
	}

	public static void method1() {
		int x = 0; /*
					 * Local variables "must be" initialized. Local variables
					 * cannot be Static Variable.
					 */
	}

}

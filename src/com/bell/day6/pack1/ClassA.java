package com.bell.day6.pack1;

public class ClassA {
	public int x;
	int y;
	protected int z;
	private int p;
	
//	static{
//		System.out.println("Inside ClassA");
//	}
	
   public void methosdClassA(){
	   System.out.println("Inside ClassA.. Inside methodClassA");
	   ClassA c = new ClassA();
		c.methosdClassA();
   }
	
	
	
	
}

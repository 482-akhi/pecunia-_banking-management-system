package com.capg.demo;

public interface Product1 {
	default void show()
	{
		System.out.println("show the product of an object:");
	}
	static void display()
	{
		System.out.println("display the product of an object:");
	}
	void exShow(String str);
	abstract void pure();

}


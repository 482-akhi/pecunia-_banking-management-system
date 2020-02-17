package com.capg.demo;

public interface Product2 {
	default void show()
	{
		System.out.println("show the product:");
	}
	static void display()
	{
		System.out.println("display the product:");
	}
	void exDisplay(String str);
	abstract void run();
}

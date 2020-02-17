package com.capg.demo;

public class ClassDemo implements Product1,Product2 {

	@Override
	public void exDisplay(String str) {
		System.out.println("String is:"+str);
	}

	@Override
	public void exShow(String str) {
		System.out.println("String is:"+str);
		
	}

	@Override
	public void show() {
		
		Product1.super.show();
		//Product2.super.show();
		
	}

	public static void main(String[] args) {
		ClassDemo obj=new ClassDemo();
		obj.show();
		obj.display();
		obj.exShow("akhila");
		obj.exDisplay("sowji");
		obj.run();
		obj.pure();
	}
	private void display() {
		Product1.display();
		Product2.display();
		
	}

	@Override
	public void run() {
		System.out.println("run the product:");
	}

	@Override
	public void pure() {
		System.out.println("very pure product:");
		
	}

}

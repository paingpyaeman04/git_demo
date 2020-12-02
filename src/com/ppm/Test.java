package com.ppm;

public class Test {

	public static void main(String[] args) {
		System.out.println("Hello this is my Calculator Version2");
		Calculator cal = new Calculator();
		int addition = cal.add(5, 3);
		int subtraction = cal.subtract(5, 3);
		System.out.println(addition);
		System.out.println(subtraction);
		
	}

}

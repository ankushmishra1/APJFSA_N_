package com.labs;

public class NarrowingTypeCasting {

	public static void main(String[] args) {
		// Declare a float variable and initialize it with a value
		float myFloat = 8.64f;

		// Narrowing type casting: convert float to int
		int myInt = (int) myFloat;

		// Narrowing type casting: convert int to byte
		byte myByte = (byte) myInt;

		// display the original float value
		System.out.println("Original float value: " + myFloat);

		// display the narrowed int value
		System.out.println("Narrowed int value: " +myInt);

		// display the narrowed byte value
		System.out.println("Narrowed byte value: " +myByte);
	}

}
/*
 * Original float value: 8.64
Narrowed int value: 8
Narrowed byte value: 8*/
 
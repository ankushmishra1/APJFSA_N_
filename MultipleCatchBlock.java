package com.githib;
//Write Java Exception Handling program  using finally block.

public class MultipleCatchBlock {
	public static void main(String[] args) {
		try {
			// creating an array of size 8
			int arr[] = new int[8];

			// trying to access an element at index 10
			System.out.println(arr[10]);

			// Catching ArrayIndexOutofBoundExeception
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("ArrayIndexOutOfBoundException");
		}
		// Catching ArithmeticException
		catch (ArithmeticException e) {
			System.out.println("ArithmeticException ");

		}
		// catching NullPointerException
		catch (NullPointerException e) {
			System.out.println("NullPointerException");
		}
		// Catching Number format Exception
		catch (NumberFormatException e) {
			System.out.println("NumbrFormatException");
		}
		// Catching any other exception that were not caught by pervious cathc block
		catch (Exception e) {
			System.out.println(e);
		}
	}

}
/*
 * ArrayIndexOutOfBoundException
 * */

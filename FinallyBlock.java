package com.githib;

public class FinallyBlock {
	public static void main(String[] args) {
		try {
			//Initializing a string 
			String str="Hello,world";
			//Trying to parse the String as an Integer
			int a = Integer.parseInt(str);
			
			System.out.println(a);
			//Catch and handeles the Exception
		}catch(NumberFormatException e) {
			System.out.println("Number format Exeception");
		}
		//This block will execute
		finally {
			System.out.println("Finally block execute");
			
		}
	}

}

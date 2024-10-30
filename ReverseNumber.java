package com.conditionstatement;

public class ReverseNumber {
    public static void main(String[] args) {
        int number=123;
        int reNumber = 0;
        int reminder =0;

        while(number!=0){
            reminder = number % 10;   // Step 1: Get the last digit
            reNumber = reNumber * 10 + reminder;   // Step 2: Build the reversed number
            number/=10;    // Step 3: Remove the last digit
        }
        System.out.println("Reverse Number :"+ reNumber);

    }
}

public class EvenOdd {
    public static void main(String[] args) {
        int number = 7; // You can change this number to test

        // Using conditional (ternary) operator to check if the number is even or odd
        String result = (number % 2 == 0) ? "Even" : "Odd";

        // Display the result
        System.out.println("The number " + number + " is " + result);
    }
}
import java.util.Scanner;
import java.lang.Math;

// HW 7/28 -- Fibonacci Numbers
// Write a function called "fib" that takes in 1 input "n" that tells us to find the nth number of the Fibonacci Sequence
// The first number (0) is the 0th term.
// Fibonacci Sequence starts off with 0, 1. Then every number after is the result of the sum of the previous 2 numbers
// You will probably use a for loop and maybe some if statements

// The function should return the correct fibonacci number

// For example: fib(5) = 5
// fib(0) = 0
// fib(1) = 1
// fib(2) = 2
// fib(7) = 13
// fib(-1) = Negative numbers are not allowed.

// Copy the main function to test your code

public class Week4Day2 {
    public static void main(String[] args) {
        System.out.println(fib(5));
        System.out.println(fib(0));
        System.out.println(fib(1));
        //QuadraticSolver(1,2,1);
    }

    public static int fib(int n){
        return 0;
    }

    public static void SwitchIntro(int x){
        // What is a switch statement?

        // It simplifies the "If-Else" structure of code

        // Choosing a card program we did last class
            // Using if-else statements, 5 if/else statements

        // Writing a bunch of if-else statements can convolute your code very easily

        // switch allows us to avoid this

        // E.g;
        if(x == 0){
            System.out.println("x is 0");
        }else if(x == 1) {
            System.out.println("x is 1");
        }else if(x == 2){
            System.out.println("x is 2");
        }else{
            System.out.println("x is not 0, 1 or 2");
        }

        // Using switch statements
        switch (x){
            case 0:
                System.out.println("x is 0");
                break;
            case 1:
                System.out.println("x is 1");
                break;
            case 2:
                System.out.println("x is 2");
                break;
            default:
                System.out.println("x is not 0, 1 or 2");
                break;
        }


    }


    public static void QuadraticSolver(int a, int b, int c){
        // Should Print out the Roots of the quadratic with coefficients a,b,c as doubles
        // ax^2 + bx + c = 0
        // If there are 2 roots, then print both
        // If there is 1 root only, then print that root
        // If there is 0 roots, print "No real roots found"

        System.out.println(Math.sqrt(4));
    }

//    public static void SwitchBool(boolean x){
//        // Switch doesn't work with boolean
//
//        // Switch statements are useful when we have multiple if-else statements (3 or more)
//
//        switch (x){
//            case true:
//                System.out.println("True");
//                break;
//            case false:
//                System.out.println("False");
//                break;
//            default:
//                break;
//        }
//    }
}

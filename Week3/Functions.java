// HOMEWORK 7/7
// For Loop and Function Exercises
// 1. Write a function that takes user input (Scanner) of 3 integers and returns their sum. USE A FOR LOOP
// 2. Write a function that takes 2 integers (not user input) and prints out a box of #'s with that width and height
    // Example: if 3 4 are the user inputs, then the box looks like:
    // drawBox(5,3); // This is the function call we make in the main function
    // # # # #
    // # # # #
    // # # # #
import java.util.Scanner;

public class Functions {
    public static void main(String[] args) {
//        int n1 = 5;
//        int n2 = 3;
//        if(isGreaterThan(n2, n1)){
//            System.out.println("hello");
//        }
//       // printHelloWorld();
//
//        // Print numbers from 1 - 50
//        System.out.println("1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20 ..."); // we DON'T want to do this
//
//        // For Loops
//        // int i = 0; --> Create integer called i, set it equal to 0
//        // i < 50; --> IF i < 50, then repeat
//        // ++i --> Every time we finish a loop, add 1 to i
////        for(int i = 1; i <= 50; ++i){
////            System.out.print(i + " ");
////        }
//        System.out.println("");
//        for(int i = 0; i < 5; ++i){
//            printHelloWorld();
//        }
//
//        // nested for loop
//        for (int i = 0; i < 5; ++i){ // i = 0 first iteration
//            for (int j = 0; j < 5; ++j){ // j = 0, 1, 2, 3, 4
//                System.out.println(i + j);
//            }
//        }
//        int sum = sumOfThree();
//        System.out.println("first sum: " + sum);
//        sum = sumOfThree();
//        System.out.println("second sum: " + sum);

        drawBox(3,4);

    }

    public static int sumOfThree(){
        Scanner input = new Scanner(System.in);
        int sum = 0;
        for (int i = 0; i < 3; ++i){
            System.out.println("Enter a number: ");
            int nextNum = input.nextInt();
            sum += nextNum;
        }
        return sum;
    }

    // Functions:

    // Declaration: [accessibility] [static (conditional)] [return type] [function name] ( [arguments/parameters] ) {
    //
    // }

    public static void drawBox(int width, int height){
        for (int i = 0; i < 5; ++i){
            System.out.print("# ");
        }
        System.out.println();


    }

    public static boolean isGreaterThan(int number1, int number2){
        if(number1 > number2){
            return true;
        }else{
            return false;
        }
    }

    public static void printHelloWorld(){
        System.out.println("Hello World");
    }

}

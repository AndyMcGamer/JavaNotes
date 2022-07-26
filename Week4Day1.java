import java.util.Scanner;

// HW 7/26
// Finish the function called printResult.
//        if number is 1, then print "You chose diamonds"
//        if number is 2, then print "You chose spades"
//        if number is 3, print "You chose hearts"
//        if number is 4, print "You chose clubs"
//        anything else, print "That's not a number from 1 - 4"

// Google on your own what a "Switch" statement is
// Make a function called printResultSwitch(int num) that does the same thing but using "switch" statement


public class Week4Day1 {
    public static void main(String[] args) { // COPY PASTE INTO YOUR PROGRAM
        Scanner input = new Scanner(System.in);
        int userNum = input.nextInt();

        printResult(userNum);

    }

    public static String printResult(int num){
        return ""; // THIS IS A STUB (DELETE THIS LINE AND REPLACE WITH YOUR CODE)
    }




//        int difference1 = subtract(5, -10); // = 15
//
////        subtract(5,-10) gets replaced by the following code (informally):
////        int number1 = 5;
////        int number2 = -10;
////        System.out.println(number1 - number2);
//
//        int difference2 = subtract(10,-3); // 13
//
//        System.out.println("Difference of differences: " + (difference1-difference2)); //15 - 13
//
//        System.out.println("Difference of differences: " + differenceOfDifferences(subtract(5,-10), subtract(10,-3)));
//
//        System.out.println("Differences of differences: " + subtract(subtract(5,-10), subtract(10,-3)));
//
//        // We have a deck of cards, and we ask for the user to give us a number from 1 to 4
//
//        Scanner input = new Scanner(System.in);
//        int num = input.nextInt(); // number from 1 - 4
//
//        // if number is 1, then print "You chose diamonds"
//        // if number is 2, then print "You chose spades"
//        // if number is 3, print "You chose hearts"
//        // if number is 4, print "You chose clubs"
//        // anything else, print "That's not a number from 1 - 4"


    public static int subtract(int number1, int number2){
        return (number1 - number2);
    }

    public static int differenceOfDifferences(int difference1, int difference2){
        return (difference1 - difference2);
    }
}

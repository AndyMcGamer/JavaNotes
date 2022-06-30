import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        // Primitive Type --> types that are automatically packaged with the language
        // integers (int)
        // double --> decimal number (twice the size of float)
        // float --> decimal number
        // long --> larger number
        // character (char) --> one single letter/number/special character
        // boolean --> Can only take values of either "true" or "false"

        int a = 1; // integer
        float b = 1.5f; // float
        double c = 2.25; // double
        long d = 10000; // long
        char e = 'i'; // char
        boolean f = true;


        // Objects --> types that aren't in the language by default
        // We can make however many different types of OBJECTS we want

        // String --> object that stores a bunch of characters together
        String s = "Hello";

        // Animal (defined below) is also an OBJECT type


        // What type?
        // 50 --> int, long, float, double BUT int is best answer
        // 3.5 --> float, double
        // "3.7" --> String (Quotation marks indicate String)
        // '5' --> char, int BUT char is best answer. '5' in char = 53 in integer terms
            // 'p' --> char or int
            // Every single CHAR has an INTEGER value associated with it: ASCII value
        // false --> boolean

        double totalMoney = 1050;
        double priceOfBanana = 2.50; // price per pound
        double priceOfComputer = 40.99; // for one computer
        int numOfBananas = 15;
        int numOfComputers = 0;

        double moneyLeftOver = totalMoney - numOfBananas * priceOfBanana - numOfComputers * priceOfComputer;

        System.out.println(moneyLeftOver);


        // Simple Calculator that Adds Two User-Chosen numbers together
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number1 = input.nextInt();
        System.out.println("Enter another number: ");
        int number2 = input.nextInt();

        int sum = number1 + number2;

        System.out.println("The sum of the numbers is: " + sum);

        // Check which one is bigger (between number1 and number2)
        if (number1 < number2){
            System.out.println(number1 + " is less than " + number2);
        }else if(number1 > number2){
            System.out.println(number1 + " is greater than " + number2);
        }else{
            System.out.println(number1 + " is equal to " + number2);
        }

        // HW ASSIGNMENT 6/30 --> Code a Simple Calculator
        // 1. Takes in 2 numbers from the user
        // 2. Takes in 1 operation from the user (add, subtract, multiply, divide) (can also use +, - , * , / )
        // 3. Returns the operation between the two numbers

        // Extra time: Implement this in a Calculator class
        // Code in main function:
            // Calculator calc = new Calculator();
            // calc.Calculate();

    }

    public static void Print(String content){
        System.out.println(content);
    }
}

class Animal{

}

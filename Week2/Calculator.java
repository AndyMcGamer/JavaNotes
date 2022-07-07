import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        double number1 = input.nextDouble();
        System.out.println("Enter another number: ");
        double number2 = input.nextDouble();
        System.out.println("Enter an operation: ");
        String operation = input.next();


        double answer = Calculate(number1, number2, operation);
        double reversedAnswer = Calculate(number2, number1, operation);
        double additionAnswer = Calculate(number1, number2, "+");
        System.out.println(answer);
        System.out.println(reversedAnswer);


//        if (operation.equals("+")){     // we use .equals() to compare Strings
//            answer = number1 + number2;
//        }
//        else if (operation.equals("-")){
//            answer = number1 - number2;
//        }else{
//            answer = 0;
//        }
//
//        if(number1 == number2){     // comparing primitives, we use == the double equals sign
//            System.out.println("number1 and number2 are the same number");
//        }
//
//        System.out.println(answer);
    }

    public static double Calculate(double n1, double n2, String op){
        if(op.equals("+")){
            return n1 + n2;
        }
        else if(op.equals("-")){
            return n1 - n2;
        }else if (op.equals("*")){
            return n1 * n2;
        }
        else if (op.equals("/")){
            return n1 / n2;
        }
        else{
            System.out.println("ERROR: Invalid Operation");
            return 0;
        }
    }
}

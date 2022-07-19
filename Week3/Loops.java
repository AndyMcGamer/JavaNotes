// HW 7/18
// 1. Write a function with 1 parameter (num) that RETURNS the number of times we can divide num by 2 to get down to 0
//      Example: if we give the function the number 9, it will return 4. 9/2 = 4 (integer division), 4/2 = 2, 2/2 = 1, 1/2 = 0


public class Loops {

    // For Loops

    // While Loops

    public static void main(String[] args) {
        // while( [condition] ) {
        //
        // }

        // Print 0-9 using for loop

        for (int i = 0; i < 10; ++i){
            System.out.print(i + " ");
        }

        System.out.println();

        // Print 0=9 using while loop
        int x = 0;
        while(x < 10){
            System.out.print(x + " ");
            x++; // i += 1; i = i + 1;
        }

        System.out.println();

        // Why use a while loop?
        // We use them when we don't know how many times to loop

        // E.g: Given a list of positive numbers with the last entry of the list = -1
        // We can't use a for loop because we don't know the length of the list

//        int x = 0
//        while(x != -1){ // while we haven't reached the end of the list, do whatever
//            // go through the list
//        }

        // Sometimes, we don't want to FINISH looping
        // E.g. In a for loop that's supposed to loop 10 times, if we only needed like 5 times, we don't need to loop the remaining 5 times
        // Hence the "break" statement --> tells the loop to STOP

        for (int i = 0; i < 10; ++i){
            System.out.print("before "); // Anything before the 'break' statement will be run
            if(i == 5){
                break; // STOPS the loop at this exact moment
            }
            System.out.println("after"); // Anything AFTER the 'break' statement will be ignored
        }
        System.out.println();

        int i = 0;
        while(true){ // Using while(true) allows us more flexibility in choosing WHERE the loop stops
            System.out.print("before while ");
            if(i == 5){
                break; // The loop will stop EXACTLY HERE. Meaning, we can do stuff BEFORE the loop actually stops.
            }
            System.out.println("after while");
            i++;
        }

        // We can mix and match while and for loops together
        i = 0;
        while(i < 10){
            for (int j = 0; j < 5; ++j){
                System.out.print(i + j + " ");
            }
            i++;
        }

    }

}

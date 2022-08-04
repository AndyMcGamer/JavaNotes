

public class Week5Day2 {
    public static void main(String[] args) {
        // Arrays (list of something)
        // We denote/declare arrays using square brackets []

        //DeclareArray();
        //AccessArrayElements();
        //IteratingThroughArrays();
        //ArrayErrors();
        ChangingArrays();
    }

    public static void DeclareArray(){
        // variable type [] variable name;
        // Arrays are still variables
        // variable stores a container with values rather than a specific value

        int[] emptyListOfNumbers; // Declare array variable

        int[] definedListOfNumbers = {1, 2, 3, 4, 5}; // This is an array with 1,2,3,4,5 stored in it.

        // Things we can't change after initial declaration: array length, array type

        // What if we want an array but don't know what values we want?
        // array type [] array name = new array type [length] ;
        int[] undefinedListOfNumbers = new int[10];

        // Redefine array variable
        emptyListOfNumbers = new int[5];
        definedListOfNumbers = new int[7];
        // the "new" keyword means that we're creating an entirely new value
        // i.e. Scrap the previous value and replace the variable with this new value

        // We cannot just "print" an array because the array itself is just a container
        System.out.println(emptyListOfNumbers);
        // This just prints out the actual "list" not the items in the list
        // Specifically, it prints out the memory address of the array
    }

    public static void AccessArrayElements(){
        String[] names = {"John", "Lydia", "Frank", "Sarah", "Holly"};

        // We can access ELEMENTS (or ITEMS) in the array using "indexing"
        // Each element in the array has a number associated with it that dictates the order --> this is called the "index" of the element

        // E.g. in the "names" array that we created,
        // "John" has an index of 0, "Lydia" has an index of 1, "Frank" has an index of 2, etc.

        // We start with index of 0, and we count up from there.

        int[] a = {3,5,0,7,2,1}; // At index 2, the element we are talking about is 0

        // We can access the elements by specifying what index we want to look at in the array
        // To get the value of a specific element: array name [index]
        String bestName = names[1];

        System.out.println(bestName);
    }

    public static void IteratingThroughArrays(){
        // Get all the elements of an array

        double[] GPAs = {4.0, 4.0, 3.5, 2.0, 3.7, 3.9, 3.0};
        // Indices: 0, 1, 2, 3, 4, 5, 6 (these indices will always go from 0 to length - 1)
        // Array length: 7

        // To access all the elements of an array
        // Slow and bad way:
//        double gpa = GPAs[0];
//        System.out.println(gpa);
//        gpa = GPAs[1];
//        System.out.println(gpa);

        // For loops (or while loops but usually for loop is preferred)

        // For loops are good for arrays because arrays have a fixed length just like for loops

        // We can access the length of an array like so:
        int arrayLength = GPAs.length;

        // We can then use a for loop to loop through the array and get the elements at each index
        for (int i = 0; i < arrayLength; ++i){
            System.out.println(GPAs[i]);
        }
    }

    public static void ArrayErrors(){
        // Index out of Bounds error

        // Happens when we try to get an index that doesn't exist in our array

        int[] a = {2,3,4,5,6}; // Has indices from 0 - 4

        int b = a[-1]; // Index out of bounds error happens because index 5 does not exist.
        // There are no errors before we run the code (Index out of Bounds is a RUNTIME error)

        // Types of errors: Compiler and Runtime
        // Compiler errors means we won't be able to run our code at all until all these errors are gone
        // c = 1; // Example of a compiler error
        // Runtime errors occur at run time (we are able to run the code but then the code is abruptly stopped when the error occurs)
            // Code run before we reach the error will be ok
    }

    public static void ChangingArrays(){
        int[] a = {1,2,3,4,5,6,7};

        // Ways we can completely overwrite array values
        //a = new int[5];
        //a = new int[]{3,2,1,0,4,5};

        // What if we only wanted to change one out of the n number of values
        //a = new int[]{2,2,3,4,5,6,7}; // This is bad practice
        // Uses more memory than necessary (which is generally bad)
        // It is overkill for changing a value

        // We can overwrite SPECIFIC values without using up memory and whatnot
        a[0] = 2;
        a[1] = 1;

        for (int i = 0; i < a.length; ++i){
            System.out.println(a[i]);
        }

        // What if we have a large number of elements
        int b[] = new int[50];
        // Replace last element (not good way)
        b[49] = 1;
        // Easier (and better) way of doing this:
        b[b.length - 1] = 1;
    }


}

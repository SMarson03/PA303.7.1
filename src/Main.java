import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
//Task 1: Write a program that creates an array of integers with a length of 3.
// Assign the values 1, 2, and 3 to the indexes. Print out each array element.
        int[] arr = {1, 2, 3};
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }

        System.out.println("\n--------------------");

        //        Task 2: Write a program that returns the middle element in an array.
//        Give the following values to the integer array: {13, 5, 7, 68, 2} and
//        produce the following output: 7
        int[] arr2 = {13, 5, 7, 68, 2};
        for (int i = 2; i <= arr2.length - 3; i++) {
            System.out.println(arr2[2]);
        }

        System.out.println("\n--------------------");
//Task 3: Write a program that creates an array of String type and initializes
// it with the strings “red,” “green,” “blue,” and “yellow.” Print out the array length.
// Make a copy using the clone( ) method. Use the Arrays.toString( ) method on the
// new array to verify that the original array was copied.
        String[] str = {"red", "green", "blue", "yellow"};
        String[] newStr = str.clone();

        System.out.println(Arrays.toString(str));
        System.out.println(Arrays.toString(newStr));

        System.out.println("\n--------------------");


//Task 4: Write a program that creates an integer array with 5 elements (i.e., numbers).
// The numbers can be any integers.  Print out the value at the first index and the last
// index using length - 1 as the index. Now try printing the value at index = length
// (e.g., myArray[myArray.length] ).  Notice the type of exception which is produced. Now try to
// assign a value to the array index 5. You should get the same type of exception.

        int[] five = {45, 23, 76, 34, 12};

        int first = five[0];
        int last = five[five.length - 1];
        System.out.println(first);
        System.out.println(last);

        System.out.println("\n--------------------");
//Task 5: Write a program where you create an integer array with a length of 5. Loop through
// the array and assign the value of the loop control variable (e.g., i) to the corresponding
// index in the array.
   


    }
}


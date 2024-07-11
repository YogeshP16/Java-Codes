

import java.util.Arrays;
import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Syntax --->
        // datatype [] ref name = new datatype [size];
        int[] arr = new int[4];

        // int[] arr = {1, 2, 3, 4, 5}; --> array initialization

        // For input
        for (int i = 0; i < arr.length; i++) { 
            System.out.println("Enter input:");
            arr[i] = sc.nextInt();
        }

        /*  To print output

        for (int i = 0; i < arr.length; i++) { 
            System.out.print(arr[i] + " ");
        }
        */

        /*  for each loop

        for (int num: arr){
            System.out.print(num + " ");
        } */

        // easyway to print array
        System.out.println(Arrays.toString(arr));





        sc.close(); // Always close the Scanner
    }
}

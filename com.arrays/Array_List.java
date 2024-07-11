

import java.util.ArrayList;
import java.util.Scanner;

public class Array_List {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList <Integer> list = new ArrayList<>(); 

        // for initializing values to list
        for (int i=0; i<=4 ;i++){
            System.err.println("enter input");
            list.add(sc.nextInt());

        }

        // to print array
        System.out.println(list);

        // to modify list
        list.set(0,99);
        System.out.println("0th index element will be modified: " +list); 

        // to remove element in list
        list.remove(4); // it reomve 4th index element
        System.out.println("it reomve 4th index element: "+list);

    }

}

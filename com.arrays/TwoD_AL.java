
import java.util.ArrayList;
import java.util.Scanner;

public class TwoD_AL {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        // two D Arraylist syntax
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();

        // for initialization
        for (int i =0; i< 3; i++){

            list.add(new ArrayList<>());
            
        }

        // to add values to array
        for (int i =0; i< 3; i++){
            for(int j=0; j< 3; j++){
                list.get(i).add(sc.nextInt());
            }
        }
        // to print output
        System.out.println(list);
    }
}

        

    

        


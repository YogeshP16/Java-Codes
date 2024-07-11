
import java.util.Scanner;

public class For_loop {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter input");
            int n = sc.nextInt();
            for (int i = 1; i <= n; i++){
                System.out.println(i);
            }
        }

        
    }
    
}

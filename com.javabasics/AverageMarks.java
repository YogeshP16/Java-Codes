import java.util.Scanner;
public class AverageMarks {
    public static void main (String args[]) {
        int m1;
        int m2;
        int m3;
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter stud marks:");
            m1 = sc.nextInt();
            m2 = sc.nextInt();
            m3 = sc.nextInt();
        }
        int average = m1 + m2 +m3 / 3;
        System.out.println(average);
    }

}

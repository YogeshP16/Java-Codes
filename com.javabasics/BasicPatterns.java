

public class BasicPatterns {

    public static void main(String[] args) {
        int n = 5; // Size of the patterns
        String input = "12345";
        String input1 = "program";
        int m = input.length();
        int p = input1.length();

        // Pattern 1: Simple Triangle
        System.out.println("Simple Triangle:");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        // Pattern 2: Inverted Triangle
        System.out.println("\nInverted Triangle:");
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        // Pattern 3: Right-Angled Triangle
        System.out.println("\nRight-Angled Triangle:");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print("  ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        // Pattern 4: Mirrored Right-Angled Triangle
        System.out.println("\nMirrored Right-Angled Triangle:");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j < i; j++) {
                System.out.print("  ");
            }
            for (int k = n; k >= i; k--) {
                System.out.print("* ");
            }
            System.out.println();
        }

        // diamond
        System.out.println("half diamond:");
        for (int i=1; i <= n; i++){
            for (int j=1; j<=i; j++){
                System.out.print("* ");          
            }
            System.out.println();
        }
        for (int i = n-1; i>=1; i--){
            for(int j =1; j<=i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        //square
        System.out.println("square pattern:");
        for (int i=1; i<=n; i++){
            for(int j =1; j<= n; j++){
                System.out.print("* ");
            }
            System.out.println();
        }

        //x pattern
        System.out.println("x pattern");
        for(int i =0; i<n; i++){
            for(int j =0; j< n; j++){
                if(j==i || j == n-i-1) {
                    System.out.print("* ");
                } else {
                    System.out.print(" ");
                }    
            }
            System.out.println();
        }

        System.out.println("12345 -- x pattern");
        for(int i =0; i<m; i++){
            for(int j =0; j<m; j++){
                if(j==i || j==m-i-1){
                    System.out.print(input.charAt(j) + " ");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        // xpattern -- program
        System.out.println("Program -- x pattern");
        for(int i =0; i<p; i++){
            for(int j =0; j<p; j++){
                if(j==i || j==p-i-1){
                    System.out.print(input1.charAt(j) + " ");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }


        }

        
    }



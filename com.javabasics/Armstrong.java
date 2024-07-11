public class Armstrong {
    public static void main(String[] args) {
        boolean res = isArmstrong(232);
        System.out.println(res); // false, 232 is not an Armstrong number

        res = isArmstrong(153);
        System.out.println(res); // true, 153 is an Armstrong number
    }

    static boolean isArmstrong(int n) {
        int original = n;
        int sum = 0;
        while (n > 0) {
            int rem = n % 10;
            n /= 10;
            sum = sum + rem * rem * rem;
        }
        return sum == original;
    }
}

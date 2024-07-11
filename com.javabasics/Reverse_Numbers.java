public class Reverse_Numbers {
    public static void main(String[] args) {
        int num  = 1234;
        int res = 0;
        while (num>0){
            int remainderlastdigit = num % 10;
            num /= 10;
            res = res * 10 + remainderlastdigit;
            
        }
        System.out.println(res);
    }

}

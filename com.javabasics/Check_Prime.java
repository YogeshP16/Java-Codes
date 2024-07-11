public class Check_Prime {
    public static void main(String[] args) {
        boolean res = isPrime(3);
        System.out.println(res);
    }

    static boolean isPrime(int n){
        if(n<=1) return false;
        for(int i =2; i<= Math.sqrt(n); i++){
            if(n%i == 0) return false;
        }
        return true;

    }
           
    
}

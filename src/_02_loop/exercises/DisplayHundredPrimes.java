package _02_loop.exercises;

public class DisplayHundredPrimes {
    public static void main(String[] args) {
        for (int i = 0; i <=100 ; i++) {
            if (checkPrimes(i)){
                System.out.println(i);
            }
        }
    }
    public static boolean checkPrimes(int n) {
        // so nguyen n < 2 khong phai la so nguyen to
        if (n < 2) {
            return false;
        }
        // check so nguyen to khi n >= 2
        int squareRoot = (int) Math.sqrt(n);
        for (int i = 2; i <= squareRoot; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}

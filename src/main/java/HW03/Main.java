package HW03;

public class Main {
    public static boolean evenOddNumber(int n) {
        if (n % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean numberInInterval(int n){
        if (n>24 & n<101){
            return true;
        }
        else {
            return false;
        }
    }
}

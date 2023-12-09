package Task_1_4_7;
import java.math.BigInteger;

public class FactoRial {
    public static void main(String[] args) {
        System.out.println(factorial(2));
        System.out.println(factorial(3));
    }
    public static BigInteger factorial(int value) {
        BigInteger s = BigInteger.valueOf(1);
        for (int i = 1; i <= value; i++) {
            s = s.multiply(BigInteger.valueOf(i));
        }
        return s;
    }
}

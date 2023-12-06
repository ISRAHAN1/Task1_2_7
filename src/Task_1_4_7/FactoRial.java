package Task_1_4_7;
import java.math.BigInteger;

public class FactoRial {
    public static void main(String[] args) {
        System.out.println(factorial(1));
        System.out.println(factorial(3));
    }
    public static BigInteger factorial(int value) {
        BigInteger v = BigInteger.valueOf(value);
        BigInteger s = BigInteger.valueOf(1);
        for (long i = 1; i <= value; i++) {
            BigInteger reZulT = BigInteger.valueOf(i);
            s = s.multiply(reZulT);
        }
        return s;
    }
}

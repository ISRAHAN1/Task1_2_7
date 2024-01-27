package Glava_1.Task_1_4_7;
import java.math.BigInteger;
import java.util.Scanner;
public class FactoRial {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int value= in.nextInt();
        System.out.println(factorial(value));
    }
    public static BigInteger factorial(int value){
        BigInteger s = BigInteger.valueOf(1);
        for (int i = 1; i <= value; i++) {
            s = s.multiply(BigInteger.valueOf(i));
        }
        return s;
    }
}

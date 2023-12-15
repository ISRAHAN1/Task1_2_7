package Task_1_4_8;
import java.util.Scanner;
import java.math.BigInteger;

public class Rekysia {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter a number");
        int value= in.nextInt();
        System.out.println(function(value));
    }
    public static BigInteger function(int value) {
        BigInteger result=BigInteger.valueOf(1);
        if (value==1||value==0){
            return result;
        }
        result=BigInteger.valueOf(value).multiply(function(value-1));
        return result;
    }

}

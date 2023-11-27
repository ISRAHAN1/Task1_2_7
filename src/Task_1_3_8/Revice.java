package Task_1_3_8;
import java.lang.Integer;

public class Revice {
    public static void main(String[] args) {
        int a=Integer.bitCount(0);
        int b=Integer.bitCount(1);
        int c=Integer.bitCount(-2);
        int e=isPowerOfTwo(a, b, c);
        System.out.print(e);

    }

    public static int isPowerOfTwo(int a, int b, int c){
      return  Math.abs(a+b+c);

    }









        }



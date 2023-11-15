package Task_1_2_14;

import java.math.BigInteger;

public class Maxis {
    public static void main(String[]args){
        BigInteger a=BigInteger.valueOf(7000);
        long a1= a.longValue();
        BigInteger b= BigInteger.valueOf(80000);
        long b1= b.longValue();
        double rez= maxLongSqr(a1,b1);
        System.out.println("kvadrat koren max znachenia:"+rez);

    }
    public static double  maxLongSqr(double a1,double b1){
        return (Math.sqrt(Math.max(a1,b1)));

    }
}

package Task_1_2_14;
import java.lang.Math;
import java.math.BigInteger;

public class Maxis {
    public static void main(String[]args){
        BigInteger Maxlong =BigInteger.valueOf(7000);
        long firstz=Maxlong.longValue();
        BigInteger square=BigInteger.valueOf(3000);
        long secondz= square.longValue();
        long rezmaxsis= maxLongSqr(firstz,secondz);
        System.out.println("kvadrat max znachenia:"+rezmaxsis);


    }
    public static long maxLongSqr(long firstz,long secondz){

        return (Math.max(firstz*firstz,secondz*secondz));

    }
}

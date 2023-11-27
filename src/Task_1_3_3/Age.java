package Task_1_3_3;
import java.lang.Math;
public class Age {
    public static void main(String[]args){
        byte age1=18;
        byte age2=24;
        byte rezultat=getAgeDiff(age1,age2);
        System.out.println("raznica vosraste:"+rezultat);
    }
    public static byte getAgeDiff(byte age1, byte age2) {
        return (byte)(Math.abs(age1)-(age2));
    }
}

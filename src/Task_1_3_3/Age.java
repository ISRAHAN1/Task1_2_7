package Task_1_3_3;
import java.lang.Math;
public class Age {
    public static void main(String[]args){
        float Age1=18.4f;
        byte age1=(byte)Math.ceil(Age1);
        float Age2=24.5f;
        byte age2=(byte)Math.round(Age2);
        byte rezultat=getAgeDiff(age1,age2);
        System.out.println("rezultat:"+rezultat);
    }
    public static byte getAgeDiff(byte age1, byte age2) {
        return (byte) (Math.ceil(age1)-Math.round(age2));
    }
}

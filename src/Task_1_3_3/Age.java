package Task_1_3_3;
import java.lang.Math;
public class Age {
    public static void main(String[]args){
        byte age1=18;
        byte age2=6;
        byte result=getAgeDiff(age1,age2);
        System.out.println("age difference:"+result);
    }
    public static byte getAgeDiff(byte age1, byte age2) {
       return (byte) Math.abs((age2)-(age1));
    }
}

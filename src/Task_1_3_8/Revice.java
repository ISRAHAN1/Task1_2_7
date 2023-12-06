package Task_1_3_8;
import java.util.Scanner;
public class Revice {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("chislo1:");
        int chislo1=in.nextInt();
        System.out.println("chislo2:");
        int chislo2=in.nextInt();
        System.out.println(isPowerOfTwo(chislo1,chislo2));
    }
    public static int isPowerOfTwo(int chislo1, int chislo2) {
        boolean isPowOFTwo;
        if(chislo2==0){
            isPowOFTwo=false;
        }else{
            isPowOFTwo=true;
        }
        System.out.println(isPowOFTwo);
        return (int) Math.abs(Math.pow(chislo1,chislo2));
        }
    }








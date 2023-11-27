package Task_1_3_10;

import java.util.Scanner;

public class Switchcase {
    public static void main(String[]args){
        Scanner in=new Scanner(System.in);
        System.out.print("Введите возраст-");
        int age1=in.nextInt();
        System.out.print("Введите возраст-");
        int age2=in.nextInt();
        double rezult= ageDoffRest( age1,age2);
        if (age1==age2){
            System.out.print("Они равны по возрасту");
        }else{
            System.out.println("Они неравны по возрасту");
        }
        System.out.printf("\nage1-%d,age2-%d,\nrezultat-%.0f",+age1,age2,rezult);
    }
    public static double ageDoffRest(int age1,int age2){

        return Math.abs (age1-age2);

    }
}

package Task_1_4_11_;
import java.util.Date;
import java.util.Scanner;
public class IFELSE {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Вводите день недели-");
        String weekday = in.nextLine();
        System.out.print(isWeekend(weekday));
    }

    public static boolean isWeekend(String weekday) {
        boolean a=false;
        if("Sunday"=="Saturday"){
            System.out.println(true);
        }


        return false;
    }
}



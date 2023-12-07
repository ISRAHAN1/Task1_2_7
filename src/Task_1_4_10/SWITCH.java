package Task_1_4_10;

import java.util.Scanner;

public class SWITCH {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите день  недели:");
        String weekday = in.nextLine();
        System.out.print(isWeekend(weekday));
    }
    public static boolean isWeekend(String weekday) {
        String aws= String.valueOf(weekday);
        switch (weekday){
            case "Monday", "Tuesday","Wednesday","Thursday","Friday":
                System.out.println(weekday);
                break;
            case "Saturday","Sunday":
                System.out.println(true);
                break;
        }
        return true;
}
}
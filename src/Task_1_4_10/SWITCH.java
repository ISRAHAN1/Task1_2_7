package Task_1_4_10;

import java.util.Scanner;

public class SWITCH {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите день  недели:");
        String weekday = in.next();
        boolean rez = isWeekend(weekday);
        System.out.println("reZUlTaT-" +rez);
    }

    public static boolean isWeekend(String weekday) {

            switch (weekday) {
                case "Monday":
                    System.out.println("день работы-1");
                    break;

                case "Tuesday":
                    boolean Tuesday=false;
                    System.out.println("день работы-2"+Tuesday);
                    break;

                case "Wednesday":
                    boolean Wednesday=false;
                    System.out.println("день работы-3"+Wednesday);
                    break;

                case "Thursday":
                    boolean Thursday=false;
                    System.out.println("день работы-4"+Thursday);
                    break;

                case " Friday":
                    boolean Friday=false;
                    System.out.println("день работы-5"+Friday);
                    break;

                case "Saturday":
                    boolean Saturday=true;
                    System.out.println(Saturday);
                    break;

                case "Sunday":
                    boolean Sunday=true;
                    System.out.println("Выходгой"+Sunday);
                    break;

                default:
                    System.out.println("net takOvo");
                    break;
            }
      return true;
    }
}
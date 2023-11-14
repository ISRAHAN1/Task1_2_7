package Task_1_2_13;
import java.util.Scanner;
import java.lang.Math;
public class Okr {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("square-");
        int area = in.nextInt();
        double radius = (Math.sqrt((area)/ Math.PI));
        double ros= calcCircleRadius( area);
        System.out.printf("square-%d radius-%.3f",+area,radius);



    }
    public static double calcCircleRadius(double area) {
        return area;
    }

}

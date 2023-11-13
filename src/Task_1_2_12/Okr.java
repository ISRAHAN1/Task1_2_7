package Task_1_2_12;
import java.util.Scanner;
public class Okr {
    public static void main(String[]args){
        Scanner in=new Scanner(System.in);
        System.out.print("Радиус-");
        int radius = in.nextInt();
        double area = Math.round(Math.PI * Math.pow(radius,2));

        System.out.printf("пдощадь круга с радиусом-%d равна=%.3f" ,+ radius, area);
            }
            public static double calcCircleRadius (double area) {


                return area;
            }
}

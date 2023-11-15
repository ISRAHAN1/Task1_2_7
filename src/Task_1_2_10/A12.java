package Task_1_2_10;
public class A12 {
    public static void main(String[] args) {
        double a=-0.01;
        double b=-0.00;
        double c=-0.01;
        boolean rezult=doubleExpression(a,b,c);
        System.out.println("rez:"+rezult);

        }

    private static boolean doubleExpression(double a, double b, double c) {
        return a+b==c||a+b!=c;
    }



    }





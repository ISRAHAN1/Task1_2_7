package Task_1_2_10;
public class A12 {
    public static void main(String[] args) {
        double a=0.04;
        double b=0.01;
        double c=0.01;
        boolean rezult=doubleExpression(a,b,c);
        System.out.println("rez:"+rezult);

        }

    public static boolean doubleExpression(double a, double b, double c) {
        return a+b==c || a+b!=c;
    }



    }





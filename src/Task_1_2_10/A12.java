package Task_1_2_10;
public class A12 {
    public static void main(String[] args) {
        byte a=12;
        byte b=12;
        byte c=24;
        boolean rezult=doubleExpression(a,b,c);
        System.out.println("rez:"+rezult);
        }
    public static boolean doubleExpression(double a, double b, double c) {
        return  a+b-c<1E-4;
    }

    }





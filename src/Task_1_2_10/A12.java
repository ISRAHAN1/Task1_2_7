package Task_1_2_10;
public class A12 {
    public static void main(String[] args) {
        byte a=11;
        byte b=11;
        byte c=22;
        boolean rezult=doubleExpression(a,b,c);
        System.out.println("rez:"+rezult);

        }

    public static boolean doubleExpression(double a, double b, double c) {
        return  a+b-c<1E-4;
    }

    }





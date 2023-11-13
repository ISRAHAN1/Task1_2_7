package Task_1_2_8;
import java.lang.Math;
public class A12 {
            public static  void main(String[] args) {
               double a=3;
               double b=2;
               double c=5;
               boolean b1=a+b<c;
               boolean b2=a+b>c;
               boolean b3=a+b==c;
                double rezult = doubleExpression(a, b, c);
                System.out.println("rez-" + b1);
                System.out.println("rez-" + b2);
                System.out.println("rez-" + b3);
            }
            public static double  doubleExpression(double a, double b, double c) {
                return a+b;
            }

        }




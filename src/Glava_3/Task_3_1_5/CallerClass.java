package Glava_3.Task_3_1_5;

public class CallerClass {
    public static void main(String[]args){

    }
    private static String anotherMethod() {
        System.out.println(getCallerClassAndMethodName());
        return null;
    }

    public static String getCallerClassAndMethodName() {
        return anotherMethod();

    }
}

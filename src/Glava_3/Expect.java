package Glava_3;
public class Expect {
    public static void main(String[] args) {
        System.out.println(testExp());

    }
    public static String testExp(){
        MyNewException number=new MyNewException("hello");
        return String.valueOf(number);

    }
}
class MyNewException extends Exception {
    private final String number;

    public MyNewException(String number) {
        this.number = number;
    }

    public String getNumber() {
        return number;
    }
}







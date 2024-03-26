package Glava_3.Task_3_1_4;

import java.io.File;

public class Expect {
    public static void main(String[] args) throws MyNewException {
        testExp(10);



    }

    public static void testExp(int value) throws MyNewException {
        if (value > 0) {
            throw new MyNewException(10);
        }
    }
}
class MyNewException extends Exception {
    private final int number;

    public MyNewException(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }
}







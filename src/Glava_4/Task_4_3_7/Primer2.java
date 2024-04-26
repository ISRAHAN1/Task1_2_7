package Glava_4.Task_4_3_7;

import java.io.ByteArrayInputStream;
import java.io.IOException;

public class Primer2 {
    public static void main(String[]args) throws IOException {
        String text="Ы";
        byte[] r = text.getBytes();
        ByteArrayInputStream boi = new ByteArrayInputStream(r);
        int a;
        while ((a=boi.read())!=-1){
            System.out.println(a);

        }

    }
}

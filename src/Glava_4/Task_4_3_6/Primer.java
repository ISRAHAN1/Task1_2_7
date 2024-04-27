package Glava_4.Task_4_3_6;
import java.io.*;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;


public class Primer {
    public static void main(String[]args) throws  IOException {
        ByteArrayInputStream inputStream = new ByteArrayInputStream(new byte[]{48, 49, 50, 51});
        String res = readAsString(inputStream, Charset.forName("ASCII"));
        System.out.println(res);
        }
    public static String readAsString(InputStream inputStream, Charset charset) throws IOException {
        InputStreamReader reader = new InputStreamReader(inputStream, charset);
        StringWriter bio = new StringWriter();
        int a;
        String res;
        while ((a=reader.read())!=-1){
            bio.write(a);
        }
        res=bio.toString();
        return res;
    }
}

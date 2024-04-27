package Glava_4.Task_4_3_6;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
public class Primer {
    public static void main(String[]args) throws  IOException{
        byte[] array = new byte[]{48 ,49, 50 ,51};
        InputStream inputStream =  new ByteArrayInputStream(array);

    }
    public static String readAsString(InputStream inputStream, Charset charset) throws IOException {
        InputStreamReader reader = new InputStreamReader(inputStream, charset);
        StringBuilder bio = new StringBuilder();
        int a;
        String res;
        while ((a=reader.read())!=-1){
            bio.append(a);
        }
        res=bio.toString();
        return res;
    }
}

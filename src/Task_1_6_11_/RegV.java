package Task_1_6_11_;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegV {
    public static void main(String[] args) {
        String email="Akobir_18@mail.ru";
        System.out.print(isGmailOrOutlook(email));
    }
    public static boolean isGmailOrOutlook(String email) {
        boolean res;
        Pattern pattern = Pattern.compile("@mail.ru");
        Matcher matcher = pattern.matcher(email);
        boolean result=matcher.matches();
        if (result){
            res=true;
        }else{
            res=false;
        }
        return res;
    }
}

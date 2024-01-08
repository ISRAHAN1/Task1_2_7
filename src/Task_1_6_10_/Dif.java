package Task_1_6_10_;


import java.util.Arrays;

public class Dif {
    public static void main(String[] args) {
        String inputString= "hello";
    }

    public static String padLeftZeros(String inputString, int length) {
        if (inputString.length() >= length) {
            return inputString;
        }
        StringBuilder sb = new StringBuilder();
        while (sb.length() < length - inputString.length()) {
            sb.append('0');
        }
        sb.append(inputString);

        return sb.toString();
    }
}
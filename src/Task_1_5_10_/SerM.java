package Task_1_5_10_;
import java.util.Arrays;
public class SerM {
    public static void main(String[] args) {
        int[] numbers = {1, 5, 2, 17};
        int[] resulT = getArrayMiddle(numbers);
        System.out.print(Arrays.toString(resulT));
    }
    public static int[] getArrayMiddle(int[] numbers) {
        int[]rest;
        rest=Arrays.copyOfRange(numbers,1,3);
        return rest ;
    }



}
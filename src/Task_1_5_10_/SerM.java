package Task_1_5_10_;
import java.util.Arrays;
public class SerM {
    public static void main(String[] args) {
        int[] numbers = {14, 16, 3, 6, 8 ,18,22};
        int[] resulT = getArrayMiddle(numbers);
        System.out.print(Arrays.toString(resulT));
    }
    public static int[] getArrayMiddle(int[] numbers) {
        int[]rest;
        rest=Arrays.copyOfRange(numbers,2,3);
        return rest ;
    }



}
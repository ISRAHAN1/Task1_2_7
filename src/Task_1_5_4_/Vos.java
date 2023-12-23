package Task_1_5_4_;
import java.util.Arrays;

public class Vos {
    public static void main(String[] args) {
        int[] numbers = {1,3,5,6,9,11,24};
        int start = 2;
        int end = 4;
        int[] a = getSubArrayBetween(numbers, start, end);
        System.out.print(Arrays.toString(a));

    }
    public static int[] getSubArrayBetween(int[] numbers, int start, int end) {
        int in=0;
        int[] result = new int[end - start + 1 ];
        for (int i = start; i <= end; i++) {
            result[in++] = numbers[i];
        }
        return result;

    }

}
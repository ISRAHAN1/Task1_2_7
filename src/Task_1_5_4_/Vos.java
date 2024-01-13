package Task_1_5_4_;
import java.util.Arrays;

public class Vos {
    public static void main(String[] args) {
        int[] numbers = {1, 3, 5, 6, 9, 11, 24};
        int start = 4;
        int end = 10;
        int[] a = getSubArrayBetween(numbers, start, end);
        System.out.print(Arrays.toString(a));
    }
    public static int[] getSubArrayBetween(int[] numbers, int start, int end) {
        int k=0;
        int[] result = new int[end-start];
        for (int i=start;i<numbers.length; i++) {
            result[k++] = result[i];
        }
        for (int j=end;j<numbers.length;j++){
            result[k++]=result[j];
        }
        return result;
    }
}
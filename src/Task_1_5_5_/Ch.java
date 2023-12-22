package Task_1_5_5_;
import java.util.Arrays;
public class Ch {
    public static void main(String[] args) {
        int[] numbers = {1, 5, 2, 17};
        int[] a = getArrayMiddle(numbers);
        System.out.println(Arrays.toString(a));
    }

    public static int[] getArrayMiddle(int[] numbers) {
        if (numbers.length > 2) {
            if (numbers.length % 2 == 0) {
                int[] arr = new int[2];
                arr[0] = numbers[numbers.length / 2 - 1];
                arr[1] = numbers[numbers.length / 2];
                return arr;
            }
        }
        return numbers;
    }
}

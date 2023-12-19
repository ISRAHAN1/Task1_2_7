package Task_1_5_5_;
import java.util.Arrays;
public class Ch {
    public static void main(String[] args) {
        int[] numbers = {1, 5, 2, 17};
        int[] a = getArrayMiddle(numbers);
        System.out.println(Arrays.toString(a));
    }
    public static int[] getArrayMiddle(int[] numbers) {
        int[] result = new int[2];
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                result[i-1]=numbers[i];
            }else if(numbers[i]>=4 && numbers[i]<17){
                result[i-1]=numbers[i];
            }
        }
        return result;
    }
}
package Task_1_5_6_;

import java.util.Arrays;

public class Raz {
    public static void main(String[]args){
        int[]numbers={1,4,6,7};
        int[]a=inverseArray(numbers);
        System.out.println(Arrays.toString(a));
    }
    public static int[] inverseArray(int[] numbers) {
        int[] result = new int[4];
        for (int i = 0; i < numbers.length; i++) {
            result[numbers.length-1-i] = numbers[i];
            }
        return result;
    }
}

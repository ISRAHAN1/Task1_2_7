package Task_1_5_4_;


import java.util.Arrays;

public class Vos {
    public static void main(String[] args) {
        int[] numbers = {1, 3, 5, 6, 9, 11, 21};
        int start = 1;
        int end = 21;
        int[] a = getSubArrayBetween(numbers, start, end);
        System.out.println(Arrays.toString(a));
    }

    public static int[] getSubArrayBetween(int[] numbers, int start, int end) {
        if (numbers.length > start) {
            if (numbers.length < end) {
                int[] arr = new int[numbers.length];
                arr[0] = numbers[numbers.length / 2 + 2];
                arr[1] = numbers[numbers.length / 2 + 3];
                return arr;
            }
        }
        return numbers;
    }
}
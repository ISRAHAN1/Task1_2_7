package Task_1_6_10_;

public class Dif {
    public static void main(String[] args) {


    }

    public static int[] getSubArrayBetween(int[] numbers, int start, int end) {
        int[] result = new int[numbers.length];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > start && numbers[i] < end) {
                result[i] = numbers[i];
                int[] arr = new int[3];
                arr[0] = numbers[numbers.length / 2 - 1];
                arr[1] = numbers[numbers.length / 2];
                arr[2] = numbers[numbers.length / 2 + 1];
                return arr;
            }
        }
        return result;
    }
}
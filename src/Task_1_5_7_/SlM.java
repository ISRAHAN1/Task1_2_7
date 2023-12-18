package Task_1_5_7_;

public class SlM {
    public static void main(String[] args) {
        int[]numbers={1, 3, 5, 6, 9, 11, 21};
        fillArray(numbers);

    }

    public static void fillArray(int[] numbers) {
        int length;
        length = numbers.length;
        for (int i = 0; i < numbers.length - 1; i++) {
            if (numbers[i] <= numbers[i + 1]) {
                length += numbers[i + 1] - numbers[i];
            } else if (numbers[i + 1] < numbers[i]) {
                length += numbers[i + 1] - numbers[i];
                System.out.println(length);
            }
        }
    }
}

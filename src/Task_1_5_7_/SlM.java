package Task_1_5_7_;

import java.util.Arrays;

public class SlM {
    public static void main(String[] args) {
        int[] firstArray = new int[]{1, 3, 7, 5};
        int[] secondArray = new int[]{8, 4, 2, 4};
        int[] a = mergeAndSort(firstArray, secondArray);
        System.out.print(Arrays.toString(a));
    }

    public static int[] mergeAndSort(int[] firstArray, int[] secondArray) {
        int[] result = new int[firstArray.length + secondArray.length];
        for (int i = result.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {

                return result;
            }
        }
        return result;
    }
}





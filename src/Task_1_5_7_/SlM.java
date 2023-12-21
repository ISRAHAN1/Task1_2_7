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
        for (int i = 0; i < firstArray.length; i++) {
            result[i] = firstArray[i];
            for (int j = 0; j < secondArray.length; j++) {
                if(firstArray[i]<secondArray[j] || firstArray[i]>secondArray[j]) {
                    result[j+4]=secondArray[j];
                }
            }
        }
        return result;
    }
}






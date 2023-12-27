package Task_1_6_10_;
public class Dif {
    public static void main(String[] args) {
        int[] firstArray = new int[]{1, 3, 7, 5};
        int[] secondArray = new int[]{8, 4, 2, 4};
        int[] a = mergeAndSort(firstArray, secondArray);
        int res = 0;
        for (int element : a) {
            if (res != 0)
                System.out.print(",");
            System.out.print(element);
            res = 1;
        }
    }

    public static int[] mergeAndSort(int[] firstArray, int[] secondArray) {
        int[] result = new int[firstArray.length + secondArray.length];
        for (int i = 0; i < firstArray.length; i++) {
            for (int j = 0; j < secondArray.length; j++) {
                result[i] = firstArray[i];
                result[firstArray.length + j] = secondArray[j];

                if (result[i + 1] < result[firstArray.length + j]) {
                    int k = result[i + 1];
                    result[i + 1] = result[firstArray.length + j];
                    result[firstArray.length + j] = k;
                }
            }
        }
        return result;
    }
}




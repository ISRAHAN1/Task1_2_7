package Task_1_5_7_;
public class SlM {
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

            System.arraycopy(firstArray, 0, result, 0, firstArray.length);
            System.arraycopy(secondArray, 0, result, firstArray.length, secondArray.length);


        return result;
    }
}


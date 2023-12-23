package Task_1_6_10_;

public class Dif {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7,9};
        int start = 2;
        int end = 4;
        int[] subArray = getSubArray(array, start, end);
        for (int i : subArray) {
            System.out.print(i + " ");
        }
    }

    public static int[] getSubArray(int[] array, int start, int end) {
        int[] subArray = new int[end-start+1];
        int subArrayIndex = 0;
        for (int i = start; i <= end; i++) {
            subArray[subArrayIndex++] = array[i];
        }
        return subArray;
        }

    }

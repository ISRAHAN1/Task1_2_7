package Task_1_5_9_;

import java.util.Arrays;

public class Arr {
    public static void main(String[]args){
        int[]numbers={1,2,3,4,5,5,6,7,7};
        printArray(numbers);
    }


    public static void printArray(int[] numbers) {
        int[]result=new int[9];
        for (int i=0;i<numbers.length;i++){
            result[i]=numbers[i];
        }
        System.out.print(Arrays.toString(result));
    }

}

package Task_1_5_4_;


import java.util.Arrays;

public class Vos {
    public static void main(String[] args) {
        int []numbers = {1, 3, 5, 6, 9, 11, 21};
        int start = 1;
        int end = 21;
        int[] a=getSubArrayBetween(numbers, start, end);
        System.out.println(Arrays.toString(a));

    }
    public static int[] getSubArrayBetween(int[] numbers, int start, int end) {
        int k=3;
        int []result=new int[k];
        for(int i=0;i<numbers.length;i++){
            if(numbers[i]>start && numbers[i]<end){
                result[k-1]=numbers[i-1];
            }
            }
        return result;
    }



}
package Task_1_5_10_;
import java.util.Arrays;
public class SerM {
    public static void main(String[] args) {
        int[] numbers = {1, 5, 2, 17};
        int[] resulT = getArrayMiddle(numbers);
        System.out.print(Arrays.toString(resulT));
    }

    public static int[] getArrayMiddle(int[] numbers) {
        int[]result=new int[2];
        int[] numbersCopy = Arrays.copyOf(numbers,numbers.length-1);
        for(int i=0;i<numbersCopy.length;i++){
            if(numbersCopy[i]%2==0){
                result[i-1]=numbersCopy[i];
            }else if(numbersCopy[i]>1){
                result[i-1]=numbers[i];
            }
        }
        return result;
    }
}
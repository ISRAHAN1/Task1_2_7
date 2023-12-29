package Task_1_6_10_;


import java.util.Arrays;

public class Dif {
    public static void main(String[] args) {
        int[][] twoD;
        twoD = new int[3][4];
        int i, j, k = 0;

        for (i = 0; i < 3; i++) {
            for (j = 0; j < 4; j++) {
                int result=0;
                if (result != 0) {
                    System.out.print(",");
                    result=1;
                twoD[i][j] = k;
                k++;
                    System.out.print(k);

                }
            }
        }

        for (i = 0; i < 3; i++) {
            for (j = 0; j < 4; j++) {
                twoD[i][j] = k;
                k++;
                System.out.print(k);
                System.out.print(",");

            }

        }
    }
}
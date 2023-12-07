package Task_1_4_8;

public class Rekysia {
    public static void main(String[] args) {
        int i = 1;
        int j = 1;
        while (i <= 3) {
            System.out.println("Номер итерации внешнего цикла - " + i);
            while (j <= 3) {
                System.out.println(" Номер итерации внутреннего цикла - " + j);
                j++;
            }
            i++;
            j=1;


        }
    }
}
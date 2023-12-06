package Task_1_4_9;
import java.util.Scanner;
public class Group {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите возраст:");
        int age = in.nextInt();
        int rez = determineGroup(age);
    }
    public static int determineGroup(int age) {
        if (age>=7&age<=13){
            System.out.println("group_1");
        }
        if (age>=14&age<=17){
            System.out.println("group_2");
        }
        if (age>=18&age<=65){
            System.out.println("group_3");
        }
        if (age>65){
            System.out.println("-1");
        }
        return age;
    }
}
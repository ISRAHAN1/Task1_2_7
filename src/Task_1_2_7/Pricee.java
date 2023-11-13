package Task_1_2_7;

public class Pricee {
    public static void main(String[] args) {

        double price = 40;
        int count = 4;
        double rezult = priceCalculation(price, count);

        System.out.println("Стоимость-" + rezult);
    }
        public static double priceCalculation(double price, int count) {

            return price * count;


    }
}

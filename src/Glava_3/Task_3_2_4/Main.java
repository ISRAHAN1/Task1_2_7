package Glava_3.Task_3_2_4;

public class Main {
    public static void main(String[] args) {

        BankClient bankClient = new BankClient();
        BankWorker bankWorker = new Worker();
        Worker worker = new Worker();
        worker.getCreditForClient(bankWorker, bankClient);

    }

}

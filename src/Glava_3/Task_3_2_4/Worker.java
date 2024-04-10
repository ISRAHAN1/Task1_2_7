package Glava_3.Task_3_2_4;

public class Worker implements BankWorker {

    @Override
    public boolean checkClientForCredit(BankClient bankClient) {
        bankClient.getHistory();
    }

    public boolean getCreditForClient(BankWorker bankWorker, BankClient bankClient)  {
        try {
            bankWorker.checkClientForCredit(bankClient);
        } catch (BadCreditHistoryException e) {
            System.out.println("kk");
        } catch (ProblemWithLawException e) {
            System.out.println("ll");
        }
        return true;
    }
}





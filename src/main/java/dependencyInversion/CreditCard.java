package dependencyInversion;

public class CreditCard implements BankCard{

    public void doTransaction(int amount) {
        System.out.println("Transaction done with CreditCard");
    }
}

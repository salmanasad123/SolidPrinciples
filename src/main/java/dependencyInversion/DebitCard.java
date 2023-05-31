package dependencyInversion;

public class DebitCard implements BankCard {
    public void doTransaction(int amount) {
        System.out.println("Transaction done with DebitCard");
    }
}

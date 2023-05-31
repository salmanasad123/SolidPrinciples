package dependencyInversion;

// With these two cards (Credit card and Debit card) , you went to a shopping mall, purchased some orders,
// and decided to pay using CreditCard.

public class ShoppingMall {

    // If you observe this is the wrong design of coding, now ShoppingMall class tightly coupled with DebitCard.
    // Now there is some error in your debit card, and the user wants to go with a Credit card,
    // then this won’t be possible because ShoppingMall is tightly coupled with Debit Card.

    // We can do that, remove the Debit card from the constructor and inject CreditCard.
    // This is not a good approach to writing code because to follow Dependency inversion principle (DIP).
    // We need to design our application in such a way so that my shopping mall payment system should accept
    // any type of Card (it shouldn’t care whether it is debit or credit card).

    // private DebitCard debitCard;

    private BankCard bankCard;

    /*public ShoppingMall(DebitCard debitCard) {
        this.debitCard = debitCard;
    }*/

    public ShoppingMall(BankCard bankCard) {
        this.bankCard = bankCard;
    }

    /*public void doPayment(Object order, int amount) {
        debitCard.doTransaction(amount);
    }*/
    public void doPayment(Object order, int amount) {
        bankCard.doTransaction(amount);
    }
}

package dependencyInversion;

public class Main {

    public static void main(String[] args) {

        // High-level modules/classes should not depend on low-level modules/classes.
        // Both should depend upon abstractions.
        // Abstractions should not depend upon details. Details should depend upon abstractions.

        // The above lines state that if a high module or class depends more on low-level modules or classes,
        // your code would have tight coupling, and if you try to change one class, it can break another class,
        // which is risky at the production level.
        // So always try to make classes loosely coupled as much as possible, and you can achieve this
        // through abstraction. The main motive of this principle is decoupling the dependencies so if
        // class A changes the class B doesn’t need to care or know about the changes.

        // As per the dependency inversion principle, a high-level class/module is something that is
        // dependent on other low-level classes/modules, and a low-level class/module is
        // something that is not dependent on other classes. Details are nothing but the class
        // which is having code for getting actual data.

        DebitCard debitCard = new DebitCard();
        ShoppingMall shoppingMall = new ShoppingMall(debitCard);
        shoppingMall.doPayment("Some order", 5000);

        // This code establishes that both the high-level and low-level modules depend on abstraction.
        // If you observe a ShoppingMall, it is loosely coupled with BankCard, any type of card processes
        // the payment without any impact, proving the Dependency Inversion Principle (DIP).

        BankCard bankCard = null;
        bankCard = new CreditCard();
        ShoppingMall shoppingMallCreditCard = new ShoppingMall(bankCard);
        shoppingMall.doPayment("Some order", 10000);

        bankCard = new DebitCard();
        ShoppingMall shoppingMallDebitCard = new ShoppingMall(bankCard);
        shoppingMall.doPayment("Some order", 15000);
    }
}


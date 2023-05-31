package dependencyInversion;

// This code establishes that both the high-level and low-level modules depend on abstraction.
// If you observe a ShoppingMall, it is loosely coupled with BankCard, any type of card processes
// the payment without any impact, proving the Dependency Inversion Principle (DIP).
public interface BankCard {

    public void doTransaction(int amount);
}

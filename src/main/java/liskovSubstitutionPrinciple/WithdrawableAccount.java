package liskovSubstitutionPrinciple;

// Because all accounts do not support withdrawals, we moved the withdraw method from the Account class
// to a new abstract subclass WithdrawableAccount. Both CurrentAccount and SavingsAccount
// allow withdrawals. So they've now been made subclasses of the new WithdrawableAccount.

public abstract class WithdrawableAccount extends Account {

    protected abstract void withdraw(Integer amount);

}

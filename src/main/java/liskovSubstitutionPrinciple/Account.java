package liskovSubstitutionPrinciple;

// The BankingAppWithdrawalService no longer depends on concrete account classes.
// Because it now depends only on the abstract class, it need not be changed when a new account type is introduced.
// Consequently, the BankingAppWithdrawalService is open for the extension with new account types,
// but closed for modification, in that the new types don't require it to change in order to integrate.

public abstract class Account {

    protected abstract void deposit(Integer amount);

    // Because all accounts do not support withdrawals, we moved the withdraw method from the Account class
    // to a new abstract subclass WithdrawableAccount. Both CurrentAccount and SavingsAccount
    // allow withdrawals. So they've now been made subclasses of the new WithdrawableAccount.

     // protected abstract void withdraw(Integer amount);
}

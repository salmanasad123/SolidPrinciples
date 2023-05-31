package liskovSubstitutionPrinciple;

// Our banking application supports two account types – “current” and “savings”.
// These are represented by the classes CurrentAccount and SavingsAccount respectively.
// Let's redesign the solution to comply with the Open/Closed principle.
// We'll close BankingAppWithdrawalService from modification when new account types are needed,
// by using an Account base class instead

// Now, let's look at how, in this design, a new account type might violate the Liskov Substitution Principle.

public class BankingAppWithdrawalService {

    // private Account account;

    private WithdrawableAccount withdrawableAccount;

    /*public BankingAppWithdrawalService(Account account) {
        this.account = account;
    }*/
    public BankingAppWithdrawalService(WithdrawableAccount withdrawableAccount) {
        this.withdrawableAccount = withdrawableAccount;
    }

    // We could amend the design so that the client of Account‘s withdraw method has to be aware of a
    // possible error in calling it. However, this would mean that clients have to have special knowledge of
    // unexpected subtype behavior. This starts to break the Open/Closed principle

    /*public void withdraw(Integer amount) {
        account.withdraw(amount);
    }*/

    public void withdraw(Integer amount) {
        withdrawableAccount.withdraw(amount);
    }
}

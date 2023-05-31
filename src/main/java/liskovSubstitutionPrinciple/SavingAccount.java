package liskovSubstitutionPrinciple;

// Now our SavingAccount class with extend from WithdrawableAccount
public class SavingAccount extends /*Account*/ WithdrawableAccount {

    @Override
    protected void deposit(Integer amount) {
        System.out.println("Deposited amount of : " + amount);
    }

    @Override
    protected void withdraw(Integer amount) {
        System.out.println("Withdrawn amount of : " + amount);
    }
}

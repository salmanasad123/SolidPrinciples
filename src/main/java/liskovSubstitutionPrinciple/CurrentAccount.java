package liskovSubstitutionPrinciple;

// // Now our CurrentAccount class with extend from WithdrawableAccount
public class CurrentAccount extends /*Account*/ WithdrawableAccount  {

    @Override
    protected void deposit(Integer amount) {
        System.out.println("Deposited amount of : " + amount);
    }

    @Override
    protected void withdraw(Integer amount) {
        System.out.println("Withdrawn amount of : " + amount);
    }
}

package liskovSubstitutionPrinciple;

// The bank now wants to offer a high interest-earning fixed-term deposit account to its customers.
// To support this, let's introduce a new FixedTermDepositAccount class.
// A fixed-term deposit account in the real world “is a” type of account. This implies inheritance in our object-oriented design.
// So, let's make FixedTermDepositAccount a subclass of Account.

// So far, so good. However, the bank doesn't want to allow withdrawals for the fixed-term deposit accounts.
// This means that the new FixedTermDepositAccount class can't meaningfully provide the
// withdraw method that Account defines. One common workaround for this is to make FixedTermDepositAccount
// throw an UnsupportedOperationException in the method it cannot fulfill.

public class FixedTermDepositAccount extends Account {

    @Override
    protected void deposit(Integer amount) {
        System.out.println("Deposited amount of : " + amount);
    }

    /*@Override
    protected void withdraw(Integer amount) {
        throw new UnsupportedOperationException("Withdrawals are not supported by FixedTermDepositAccount!!");
    }*/
}

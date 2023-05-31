package liskovSubstitutionPrinciple;

public class Main {

    public static void main(String[] args) {

        // Subtypes must be substitutable for their base types.
        // All subtypes must be substitutable for their supertype without ever having to modify the client code.
        // Adhering to the Liskov Substitution Principle ensures this substitutability.

        // Our banking application supports two account types – “current” and “savings”.
        // These are represented by the classes CurrentAccount and SavingsAccount respectively.
        // Let's redesign the solution to comply with the Open/Closed principle.
        // We'll close BankingAppWithdrawalService from modification when new account types are needed,
        // by using an Account base class instead

        BankingAppWithdrawalService bankingAppWithdrawalService = null;

        CurrentAccount currentAccount = new CurrentAccount();
        currentAccount.deposit(5000);

        bankingAppWithdrawalService = new BankingAppWithdrawalService(currentAccount);

        bankingAppWithdrawalService.withdraw(2000);

        // Now, let's look at how, in this design, a new account type might violate the Liskov Substitution Principle.
        // While the new class works fine, let's try to use it with the BankingAppWithdrawalService
        // Unsurprisingly, the banking application crashes with the error

        FixedTermDepositAccount fixedTermDepositAccount = new FixedTermDepositAccount();
        fixedTermDepositAccount.deposit(1000);

        // bankingAppWithdrawalService = new BankingAppWithdrawalService(fixedTermDepositAccount);

        // bankingAppWithdrawalService.withdraw(500); // crash - an exception thrown

        // What went wrong:
        // The BankingAppWithdrawalService is a client of the Account class. It expects that both Account
        // and its subtypes guarantee the behavior that the Account class has specified for its withdraw method:

        // However, by not supporting the withdraw method, the FixedTermDepositAccount violates this method
        // specification. Therefore, we cannot reliably substitute FixedTermDepositAccount for Account.
        // In other words, the FixedTermDepositAccount has violated the Liskov Substitution Principle.

        // When Is a Subtype Substitutable for Its Supertype?
        // A subtype doesn't automatically become substitutable for its supertype. To be substitutable,
        // the subtype must behave like its supertype.
        // An object's behavior is the contract that its clients can rely on. The behavior is specified by
        // the public methods, any constraints placed on their inputs, any state changes that the
        // object goes through, and the side effects from the execution of methods.
        // Subtyping in Java requires the base class's properties and methods are available in the subclass.
        // However, behavioral subtyping means that not only does a subtype provide all of the methods in the supertype,
        // but it must adhere to the behavioral specification of the supertype. This ensures that any assumptions
        // made by the clients about the supertype behavior are met by the subtype.
        // This is the additional constraint that the Liskov Substitution Principle brings to object-oriented design.
        // Let's now refactor our banking application to address the problems we encountered earlier.

        // The Root Cause
        // In the example, our FixedTermDepositAccount was not a behavioral subtype of Account.
        //The design of Account incorrectly assumed that all Account types allow withdrawals.
        // Consequently, all subtypes of Account, including FixedTermDepositAccount which doesn't support
        // withdrawals, inherited the withdraw method.

        // Because all accounts do not support withdrawals, we moved the withdraw method from the Account
        // class to a new abstract subclass WithdrawableAccount. Both CurrentAccount and SavingsAccount
        // allow withdrawals. So they've now been made subclasses of the new WithdrawableAccount.
        // This means BankingAppWithdrawalService can trust the right type of account to provide the
        // withdraw function.


    }
}

package inheritance;

// Since the superclass(BankAccount) has non-default constructor,
// subclass must call super() in its constructor!
// "There's no CheckingAccount without BankAccount"
public class CheckingAccount extends BankAccount {
    private int limit;

    public CheckingAccount(String accountNumber, double balance, int bankCode, int limit) {
        // YOU MUST CALL super()
        super(accountNumber, balance, bankCode);
        this.limit = limit;
    }

    public int getLimit() {
        System.out.println(bankCode);
        return limit;
    }

    public void setLimit(int limit) {
        this.limit = limit;
    }

    @Override
    public String toString() {
        return "CheckingAccount(accountNumber=" + getAccountNumber() + ", balance=" + getBalance()
                + ", bankCode=" + bankCode + ", limit=" + limit + ")";
    }
}
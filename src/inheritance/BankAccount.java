package inheritance;

public class BankAccount {
    private String accountNumber;
    private double balance;
    protected int bankCode;

    // default constructor
    public BankAccount() {
        this.accountNumber = "";
        this.balance = 0.0;
        this.bankCode = 0;
    }

    public BankAccount(String accountNumber, double balance, int bankCode) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.bankCode = bankCode;
    }

    public double getBalance() {
        return balance;
    }

    public final void setBalance(double balance) {
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public final void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BankAccount that = (BankAccount) o;
        return this.accountNumber.equals(that.accountNumber) && this.bankCode == that.bankCode;
    }

    @Override
    public String toString() {
        return "BankAccount(accountNumber=" + accountNumber + ", balance=" + balance + ", bankCode=" + bankCode + ")";
    }
}
package inheritance;

public class Driver {
    public static void main(String[] args) {
        BankAccount acc1 = new BankAccount("C291332", 8600000, 2);
        BankAccount acc2 = new BankAccount("C291332", 8600000, 1);
        System.out.println(acc1.equals(acc2));

        System.out.println(acc1);
        System.out.println(acc2);


        BankAccount c1 = new CheckingAccount("A23932", 10000, 1, 2500);
        System.out.println(c1);
        System.out.println(c1.getBalance());

        BankAccount s1 = new SavingsAccount("S12345", 5000, 1, 5);
        System.out.println(s1.getBalance());

        BankAccount[] accounts = new BankAccount[5];
        accounts[0] = c1;
        accounts[1] = s1;


    }
}
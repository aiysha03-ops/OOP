class Account {
    private double balance;
    public Account(){
    }
    public Account(double initialBalance) {
        balance = initialBalance;
    }
    public double getBalance() {
        return balance;
    }
    public void deposit(double amount) {
        balance = balance + amount;
    }
    public void withdraw(double amount) {
        balance = balance - amount;
    }
}
public class Runner {
    public static void main(String[] args) {
        Account acc1 = new Account(500.0);
        System.out.println("Account 1 Balance: " + acc1.getBalance());
        acc1.deposit(200.0);
        acc1.withdraw(50.0);
        System.out.println("Account 1 Balance after transactions: " + acc1.getBalance());

        Account acc2 = new Account(acc1.getBalance());
        System.out.println("Account 2 Balance: " + acc2.getBalance());
    }
}
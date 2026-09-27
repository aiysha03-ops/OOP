class account {
    public double balance;
    public String accountnumber;

    public account() {
        balance = 3215;
        accountnumber = "LMNK12438593359";
    }

    public account(double b, String a) {
        balance = b;
        accountnumber = a;
    }

    public double depositamount(double amount) {
        return (balance = balance + amount);
    }

    public double withdrawamount(double amount) {
        return (balance = balance - amount);
    }
}
    public class accountrunner{
        public static void main(String[]args){
            account acc1 = new account(3215,"LMNK12438593359");
            System.out.println("Starting amount:"+acc1.balance);
            acc1.depositamount(450);
            System.out.println("Deposited amount:"+acc1.balance);
            acc1.withdrawamount(970.23);
            System.out.println("Withdrawn amount:"+acc1.balance);

            account acc2 = new account(5023, "LMNK4834723848");
            System.out.println("Starting balance"+acc2.balance);
            acc2.depositamount(239);
            System.out.println("Deposited amount:"+acc2.balance);
            acc2.withdrawamount(869.50);
            System.out.println("Withdrawn amount:"+acc2.balance);

        }
    }

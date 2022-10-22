package java.lesson10;

public class Homework10 {

    public static void main(String[] args) {
        BankAccountClass bankClass = new BankAccountClass();
        bankClass.setBalance(20);
//        System.out.println( bankClass.getBalance() );
        bankClass.setBalance(30);
//        System.out.println( bankClass.getBalance() );

        bankClass.setBalance(-41);
//        System.out.println( bankClass.getBalance() );

    }
}


class BankAccountClass {
    private int balance = 0;

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        if(balance > 0) {
            this.balance += balance;
            System.out.println( "Your balance has changed by " + balance + " and now it is: " + getBalance() );
        }
        else {// -41 + 40 = -1    // -41 + 50 = 9
            if((balance + getBalance()) < 0 ) {
                System.out.println("Transaction fails");
            }
            else {
                System.out.println("Withdrawal of " + balance + " cannot be completed. Your balance is " + getBalance());
            }
        }

    }


}
package lesson8;

public class Homework8Answer {

    public static void main(String[] args) {

//        - Finish up the logic that calculates the balance
//        - Create a method that withdraws from the balance
//        - Check that if a bank customer deposits $500, $150 and $35 and then withdraws $40 and $120 the balance is correct
//        - Print out a meaningful message if it is correct and if not

        BankingAccount myAccount = new BankingAccount();
        myAccount.deposit(500);
        myAccount.deposit(150);
        myAccount.deposit(35);
        myAccount.withdraw(40);
        myAccount.withdraw(120);
        if (myAccount.balance == 525) {
            System.out.println("The balance is correct and equals to " + myAccount.balance);
        }
        else {
            System.out.println("The balance is not correct and equals to " + myAccount.balance);
        }
    }
}
class BankingAccount {
    public int balance;
    public void deposit(int sum) {
        balance = balance+sum;
    }
    public void withdraw(int sum) {
        balance = balance-sum;
    }
}
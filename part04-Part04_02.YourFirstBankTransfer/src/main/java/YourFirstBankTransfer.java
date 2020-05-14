/*
Write a program that:
Creates an account named "Matthews account" with the balance 1000
Creates an account named "My account" with the balance 0
Withdraws 100.0 from Matthew's account
Deposits 100.0 to "my account"
Prints both the accounts

 */
public class YourFirstBankTransfer {

    public static void main(String[] args) {
        //creates two new accounts, Matthew's and my account
        Account mattyAccount = new Account("Matthews account", 1000.00);
        Account myAccount = new Account("My account", 0);

        //withdraws money from Matthew's account and deposits it to mine
        mattyAccount.withdrawal(100.00);
        myAccount.deposit(100.00);

        //prints out both accounts
        System.out.println(mattyAccount);
        System.out.println(myAccount);
    }
}

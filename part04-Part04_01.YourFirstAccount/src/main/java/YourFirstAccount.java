/*
The exercise template comes with a ready-made class named Account. 
The Account object represents a bank account that has balance (i.e. one that has some amount of money in it).
Write a program that creates an account with a balance of 100.0, deposits 20.0 in it, and finally prints the balance. 
NB! Perform all the operations in this exact order.
 */

public class YourFirstAccount {

    public static void main(String[] args) {
        //creates new account and deposits sum to it
        Account kicluDoktor = new Account("Doktor", 100.00);
        kicluDoktor.deposit(20.00);
        //prints out the account's balance
        System.out.println(kicluDoktor);
    }
}

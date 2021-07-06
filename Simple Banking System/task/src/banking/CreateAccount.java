package banking.controller;

import banking.Main;
import banking.model.Account;

public class CreateAccount {
    public CreateAccount() {
        //Create the account
        Account account = Account.createAccount();

        //Add the account to the bank database
        Main.database.add(account);

        //Print account information
        System.out.println("Your card has been created");
        System.out.println("Your card number:");
        System.out.println(account.getID());
        System.out.println("Your card PIN:");
        System.out.println(account.getPIN());

        System.out.println();
        Main.mainMenu.show();
    }
}
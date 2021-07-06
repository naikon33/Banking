package banking.controller;

import banking.Main;
import banking.model.Account;
import banking.view.LogInMenu;

public class LogIn {
    public LogIn() {
        //Type in ID and PIN
        System.out.println("Enter your card number:");
        long id = Main.in.nextLong();
        System.out.println("Enter your PIN:");
        String PIN = Main.in.next();
        System.out.println();
        //Judge ID and PIN
        Account account = Main.database.findByID(id);
        if(account == null || !PIN.equals(account.getPIN())) {
            System.out.println("Wrong card number or PIN!");
        } else {
            System.out.println("You have successfully logged in!");
            System.out.println();
            LogInMenu logInMenu = new LogInMenu(account);
            logInMenu.show();
        }
        Main.mainMenu.show();
    }
}
package banking.model;

import java.util.Random;

/**
 * This class represent an bank account
 */
public class Account {
    private static long count = 0;
    private long ID;
    private String PIN;
    private int balance;    //cent

    private static String generatePIN() {
        Random random = new Random();
        int pin = random.nextInt(10000);
        String temp = Integer.toString(pin);
        if(temp.length() == 4)
            return temp;
        StringBuilder PIN = new StringBuilder();
        for(int i = 0; i < 4 - temp.length(); ++i) {
            PIN.append(0);
        }
        PIN.append(temp);
        return PIN.toString();
    }

    public static Account createAccount() {
        long ID = 4000000000000000L;
        ID += count * 10;  
        count++;
        String PIN = generatePIN();
        return new Account(ID, PIN, 0);
    }


    public Account(long ID, String PIN, int balance) {
        this.ID = ID;
        this.PIN = PIN;
        this.balance = balance;
    }

    public String getPIN() {
        return PIN;
    }

    public long getID() {
        return ID;
    }

    public int getBalance() {
        return balance;
    }

}
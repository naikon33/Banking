package banking;

import banking.database.Database;
import banking.view.MainMenu;


import java.util.Scanner;

public class Main {
    public static Scanner in = new Scanner(System.in);
    public static MainMenu mainMenu = new MainMenu();
    public static Database database = new Database();
    public static void main(String[] args) {
        mainMenu.show();
    }
}
import ConsoleUI.Commands.*;
import Logs.BucketLogger;
import Product.ProductsDB;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        ProductsDB productsDB = ProductsDB.getInstance();
        productsDB.initialize("src\\Source\\assortment");
        ConsoleCommand showMenuCommand = new ShowMenuCommand();
        while (true) {
            showMenuCommand.execute();
            int userChoice = Integer.parseInt(scanner.nextLine());
            switch (userChoice) {
                case 1:
                    new ShowcaseCommand(productsDB).execute();
                    break;
                case 2:
                    new ShowFiltersCommand().execute();
                    new FilterCommand().execute();
                    break;
                case 3:
                    new addToBucketCommand().execute();
                    break;
                case 4:
                    new ShowBucketCommand().execute();
                    break;
                case 5:
                    //new FormOrderCommand();
                    break;
                case 6:
                    new RepeatLastOrderCommand().execute();
                    break;
                case 7:
                    break;
                default:
                    System.out.println("Такого пункта нету");
            }
            if (userChoice == 7) {
                new BucketLogger().clearLog();
                break;
            }
        }
    }
}

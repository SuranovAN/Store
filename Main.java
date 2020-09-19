import ConsoleUI.ConsoleCommand;
import ConsoleUI.Switch;
import ConsoleUI.Menu;
import Product.ProductsDB;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        ProductsDB productsDB = ProductsDB.getInstance();
        productsDB.initialize("src\\Source\\assortment");
        Menu menu = new Menu();
        ConsoleCommand showAllProducts = menu::showAll;
        ConsoleCommand doSome1 = menu::some1;

        Switch mySwitch = new Switch();
        mySwitch.register("1", showAllProducts);
        mySwitch.register("2", doSome1);
        mySwitch.printMap();
        String str = scanner.nextLine();
        if (1 == Integer.parseInt(str)){
            mySwitch.execute(str);
        }
//        FilterByManufacturer filterByManufacturer = new FilterByManufacturer();
//        FilterByType filterByType = new FilterByType();
//        filterByType.filter(MILK);
//        filterByManufacturer.filter("останкино");

    }
}

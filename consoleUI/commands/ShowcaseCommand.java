package consoleUI.commands;

import product.ProductEntity;
import product.ProductsDB;

import java.util.List;

public class ShowcaseCommand implements ConsoleCommand {
    List<ProductEntity> productList;

    public ShowcaseCommand(ProductsDB db) {
        productList = db.getProductsList();
    }

    public void printV(int rows, int columns) {
        int count = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                if (count == productList.size()) {
                    i = count;
                    break;
                }
                System.out.print(productList.get(count++) + " | ");
            }
            System.out.println();
        }
        System.out.println();
    }

    @Override
    public void execute() {
        printV(3, 2);
    }
}

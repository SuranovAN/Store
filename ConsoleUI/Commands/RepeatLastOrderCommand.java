package ConsoleUI.Commands;

import Product.ProductEntity;
import Product.ProductsDB;
import UserBucket.UserBucket;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class RepeatLastOrderCommand implements ConsoleCommand {
    File fileBucket = new File("src\\Source\\lastOrder");
    File Order = new File("src\\order\\lastOrder");
    UserBucket userBucket = UserBucket.getInstance();
    ProductsDB productsDB = ProductsDB.getInstance();

    @Override
    public void execute() {
        try (FileReader fr = new FileReader(fileBucket); Scanner scanner = new Scanner(fr)) {
            while (scanner.hasNextLine()) {
                String str = scanner.nextLine();
                String[] arr = str.split(" X ");
                for (ProductEntity p : productsDB.getProductsList()) {
                    if (p.toString().equals(arr[0])) {
                        userBucket.getBucket().add(p);
                        userBucket.getSummary()
                                .append(p.getName())
                                .append(" x ")
                                .append(arr[1])
                                .append(" ")
                                .append("= ")
                                .append(Integer.parseInt(arr[1]) * p.getPrice())
                                .append("\n");
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

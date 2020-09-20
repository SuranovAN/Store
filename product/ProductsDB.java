package product;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductsDB {
    private final List<ProductEntity> productsList = new ArrayList<>();
    private static ProductsDB productsDB;

    public List<ProductEntity> getProductsList() {
        return productsList;
    }

    public static ProductsDB getInstance() {
        if (productsDB == null) {
            productsDB = new ProductsDB();
        }
        return productsDB;
    }

    public void initialize(String filePath) throws IOException {
        ProductBuilder productBuilder = new ProductBuilder();
        String[] arr;
        File file = new File(filePath);
        try (FileReader fr = new FileReader(file); Scanner scanner = new Scanner(fr)) {
            while (scanner.hasNextLine()) {
                arr = scanner.nextLine().split(", ");
                productsList.add(productBuilder
                        .setId(Integer.parseInt(arr[0]))
                        .setName(arr[1])
                        .setManufactures(arr[2])
                        .setType(arr[3])
                        .setPrice(Integer.parseInt(arr[4]))
                        .build());
            }
        }
    }
}

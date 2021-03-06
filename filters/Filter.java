package filters;

import product.*;

import java.util.List;

public abstract class Filter {
    List<ProductEntity> productsList = ProductsDB.getInstance().getProductsList();

    public abstract <T> void filter(T searchName);
}

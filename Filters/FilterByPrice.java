package Filters;

public class FilterByPrice extends Filter{
    @Override
    public <T> void filter(T searchPrice) {
        productsList.stream().filter(product -> product.getManufactures()
                .equals(searchPrice))
                .forEach(System.out::println);
    }
}

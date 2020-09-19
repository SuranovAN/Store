package Filters;

public class FilterByManufacturer extends Filter{
    @Override
    public <T> void filter(T manufacturesName) {
        productsList.stream().filter(product -> product.getManufactures()
                .equals(manufacturesName))
                .forEach(System.out::println);
    }
}

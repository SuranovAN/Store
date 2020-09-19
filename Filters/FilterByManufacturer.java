package Filters;

public class FilterByManufacturer extends Filter {
    private String Type;

    @Override
    public <T> void filter(T manufacturesName) {
        productsList.stream().filter(product -> product.getManufactures().toLowerCase()
                .equals(manufacturesName))
                .forEach(System.out::println);
    }
}

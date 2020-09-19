package Filters;

public class FilterByType extends Filter {
    @Override
    public <T> void filter(T searchName) {
        productsList.stream().filter(product -> product.getType()
                .equals(searchName))
                .forEach(System.out::println);
    }
}

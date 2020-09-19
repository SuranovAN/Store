package Filters;

public class FilterByName extends Filter{
    @Override
    public <T> void filter(T searchName) {
        productsList.stream().filter(product -> product.getName().toLowerCase()
                .equals(searchName))
                .forEach(System.out::println);
    }
}

package filters;


public class FilterByPrice extends Filter {
    @Override
    public <T> void filter(T searchPrice) {
        productsList.stream()
                .filter(p -> p.getPrice() < Integer.parseInt(searchPrice.toString()))
                .forEach(System.out::println);
    }
}

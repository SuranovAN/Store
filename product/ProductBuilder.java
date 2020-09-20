package product;

public class ProductBuilder {
    private String name;
    private String manufactures;
    private ProductTypes type;
    private int price, id;

    public ProductBuilder setId(int id) {
        this.id = id;
        return this;
    }

    public ProductBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public ProductBuilder setManufactures(String manufactures) {
        this.manufactures = manufactures;
        return this;
    }

    public ProductBuilder setPrice(int price) {
        this.price = price;
        return this;
    }

    public ProductBuilder setType(String type) {
        switch (type) {
            case "Энергетики":
                this.type = ProductTypes.ENERGY_DRINK;
                break;
            case "Колбасные изделия":
                this.type = ProductTypes.SAUSAGE;
                break;
            case "Молочные изделия":
                this.type = ProductTypes.MILK;
                break;
            default:
                throw new IllegalArgumentException("Нет такого типа");
        }
        return this;
    }

    public ProductEntity build() {
        return new ProductEntity(id, name, manufactures, type, price);
    }
}

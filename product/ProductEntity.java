package product;

public class ProductEntity {
    private String name, manufactures;
    private int price, id;
    private ProductTypes type;

    public ProductEntity(int id, String name, String manufactures, ProductTypes type, int price) {
        this.id = id;
        this.name = name;
        this.manufactures = manufactures;
        this.price = price;
        this.type = type;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getManufactures() {
        return manufactures;
    }

    public void setManufactures(String manufactures) {
        this.manufactures = manufactures;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public ProductTypes getType() {
        return type;
    }

    public void setType(ProductTypes type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "name='" + name + '\'' +
                ", manufactures='" + manufactures + '\'' +
                ", price=" + price +
                ", id=" + id +
                ", type=" + type;
    }
}

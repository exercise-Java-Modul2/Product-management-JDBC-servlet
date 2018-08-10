package models;

public class Product {
    private int id;
    private String name;
    private Double price;
    private  int Category_id;

    public Product() {
    }

    public Product(String name, Double price, int category_id) {
        this.name = name;
        this.price = price;
        Category_id = category_id;
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

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public int getCategory_id() {
        return Category_id;
    }

    public void setCategory_id(int category_id) {
        Category_id = category_id;
    }
}

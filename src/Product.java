import java.util.Random;
import java.util.List;
import java.util.ArrayList;

import static javax.management.Query.and;

public class Product {
    private final Long id;
    private String name;
    private String category;
    private double price;

    Random random = new Random();
    public Product(String name, String category, double price) {
        this.id = random.nextLong(1,1000000000);
        this.name = name;
        this.category = category;
        this.price = price;
    }

    public String getCategory() {
        return category;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public static List<Product> sameCategory(List<Product> products) {
        return products.stream().filter(prod -> prod.getCategory().equals("Books")&&(prod.getPrice() > 100) ).toList();
    }

    @Override
    public String toString() {
        return "ID: " + id + "\nName: " + name + "\nCategory: " + category + "\nPrice: " + price + "\n---------------------------------------------------------------" + "\n";

    }
}

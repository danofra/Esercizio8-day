
import java.time.LocalDate;
import java.util.List;
import java.util.ArrayList;
import java.util.stream.Stream;

import static entities.Status.*;

public class Main {
    public static void main(String[] args) {

        // PRODUCTS
        Product p1 = new Product("Book", "Books", 120);
        Product p2 = new Product("Book", "Books", 105);
        Product p3 = new Product("Baby", "Baby", 200);
        Product p4 = new Product("Baby", "Baby", 80);
        Product p5 = new Product("Boys", "Boys", 190);
        Product p6 = new Product("Boys", "Boys", 180);
        List<Product> products = new ArrayList<>(List.of(p1, p2, p3, p4, p5, p6));

        // CUSTOMERS
        Customers c1 = new Customers("Marco", 1);
        Customers c2 = new Customers("Paolo", 2);
        Customers c3 = new Customers("Giorgio", 3);
        Customers c4 = new Customers("Luca", 4);
        List<Customers> customers = new ArrayList<>(List.of(c1, c2, c3, c4));

        // ORDERS
        LocalDate dateOrder = LocalDate.now();
        Order o1 = new Order(NEW, dateOrder,  products, c1);
        Order o2 = new Order(IN_PROGRESS, dateOrder,  products, c2);
        Order o3 = new Order(DELIVERED, dateOrder,  products, c3);
        Order o4 = new Order(CANCELED, dateOrder,  products, c4);
        List<Order> orders = new ArrayList<>(List.of(o1, o2, o3, o4));

        // START OF THE PROGRAM
        System.out.println("Benvenuto nel nostro store!");
        System.out.println("In questa versione il nostro store non permette di effettuare ordini.");
        System.out.println("Per maggiori informazioni contattate il nostro team.");
        System.out.println("---------------------------------------------------------------");
        Product.sameCategory(products);
        System.out.println("Prodotti ricercati per categoria Books: " + "\n" + Product.sameCategory(products));







    List<Product> boys =  products.stream()
            .filter(product -> product.getCategory().equals("Boys"))
            .peek(product -> {
                double discount = product.getPrice() * 10 / 100;
                double price = product.getPrice() - discount;
                product.setPrice(price);
            })
            .toList();
        System.out.println("Prodotti ricercati per categoria Boys: " + "\n" + boys);
}}

import java.time.LocalDate;
import java.util.List;
import java.util.ArrayList;

import static entities.Status.NEW;

public class Main {
    public static void main(String[] args) {
        System.out.println("Benvenuto nel nostro store!");
        System.out.println("In questa versione il nostro store non permette di effettuare ordini.");
        System.out.println("Per maggiori informazioni contattate il nostro team.");
        System.out.println("---------------------------------------------------------------");
        Product p1 = new Product("Book", "Books", 120);
        Product p2 = new Product("Book", "Books", 105);
        Product p3 = new Product("Baby", "Baby", 200);
        Product p4 = new Product("Baby", "Baby", 80);
        Product p5 = new Product("Boys", "Boys", 190);
        Product p6 = new Product("Boys", "Boys", 180);
        List<Product> products = new ArrayList<>(List.of(p1, p2, p3, p4, p5, p6));
        Product.sameCategory(products);
        System.out.println("Prodotti ricercati per categoria Books: " + "\n" + Product.sameCategory(products));

        Customers c1 = new Customers("Marco", 1);
        Customers c2 = new Customers("Paolo", 2);

        LocalDate dateOrder = LocalDate.now();
        Order o1 = new Order(NEW, dateOrder,  products, c1);
        Order o2 = new Order(NEW, dateOrder,  products, c2);

        o1.getProducts().forEach(product -> {
            if(product.getCategory().equals("Baby")) {
                System.out.println("---------------------------------------------------------------");
                System.out.println("Prodotti ricercati per categoria Baby: " + "\n");
                System.out.println(product.toString());
            }
        });

        o2.getProducts().forEach(product -> {
            if(product.getCategory().equals("Boys")) {
                product.setPrice(product.getPrice() - (product.getPrice() * 10 / 100));
                System.out.println("---------------------------------------------------------------");
                System.out.println("Prodotti ricercati per categoria Boys: " + "\n");
                System.out.println(product.toString());
            }
        });
}

    }
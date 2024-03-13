
import java.time.LocalDate;
import java.util.List;
import java.util.ArrayList;
import static entities.Status.*;

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
        Customers c3 = new Customers("Giorgio", 3);
        Customers c4 = new Customers("Luca", 4);

        LocalDate dateOrder = LocalDate.now();
        Order o1 = new Order(NEW, dateOrder,  products, c1);
        Order o2 = new Order(IN_PROGRESS, dateOrder,  products, c2);
        Order o3 = new Order(DELIVERED, dateOrder,  products, c3);
        Order o4 = new Order(CANCELED, dateOrder,  products, c4);

        List<Order> orders = new ArrayList<>(List.of(o1, o2, o3, o4));
        Order.sameCategory(orders);
    System.out.println("Ordini ricevuti per categoria Baby: " + "\n" + orders);

        o2.getProducts().forEach(product -> {
            if(product.getCategory().equals("Boys")) {
                product.setPrice(product.getPrice() - (product.getPrice() * 10 / 100));
                System.out.println("---------------------------------------------------------------");
                System.out.println("Prodotti ricercati per categoria Boys: " + "\n");
                System.out.println(product);
            }
        });
}

    }
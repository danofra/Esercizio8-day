
import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        System.out.println("Benvenuto nel nostro store!");
        System.out.println("In questa versione il nostro store non permette di effettuare ordini.");
        System.out.println("Per maggiori informazioni contattate il nostro team.");
        System.out.println("---------------------------------------------------------------");
        Product p1 = new Product("Book", "Books", 120);
        Product p2 = new Product("Book", "Books", 105);
        Product p3 = new Product("Machine", "Machine", 200);
        List<Product> products = new ArrayList<>(List.of(p1, p2, p3));
        Product.sameCategory(products);
        System.out.println("Prodotti ricercati: " + "\n" + Product.sameCategory(products));
    }
}
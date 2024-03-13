import java.time.LocalDate;
import java.util.List;
import entities.Status;
import java.util.Random;

public class Order {
    private final Long id;
    private Status status;
    private LocalDate dateOrder;
    private LocalDate dateDelivery;
    private List<Product> products;
    private Customers customers;
    Random random = new Random();
    public Order( Status status, LocalDate dateOrder, List<Product> products, Customers customers) {
        this.id = random.nextLong(1,100000);
        this.status = status;
        this.dateOrder = dateOrder;
        this.products = products;
        this.customers = customers;
        this.dateDelivery = dateOrder.plusDays(5);
    }
    public List<Product> getProducts() {
        return this.products;
    }



}

import java.util.Random;
public class Customers {
    private Long id;
    private String name;
    private int tier;

    Random random = new Random();

    public Customers(String name, int tier) {
        this.id = random.nextLong(1,1000000000);
        this.name = name;
        this.tier = tier;
    }
}

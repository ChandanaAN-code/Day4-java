import java.util.LinkedHashSet;
public class Linkedhashset2 {
    public static void main(String[] args) {
        LinkedHashSet<String> products=new LinkedHashSet<>();
        products.add("Laptop");
        products.add("Mobile");
        products.add("HeadPhones");
        products.add("Smart Watch");
        System.out.println("All Products:"+products);
        products.remove("HeadPhones");
        products.add("Tablet");
        System.out.println("Mobile exsts or not:"+products.contains("Mobile"));
        System.out.println("All Products:"+products);

    }
}

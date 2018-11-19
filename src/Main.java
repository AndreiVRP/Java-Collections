import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        Product laptop = new Product("Lenovo", 799.99);
        Product smartphone1 = new Product("Samsung Galaxy", 1199.99);
        Product smartphone2 = new Product("Huawei", 599.99);


        Collection<Product> products = new ArrayList<>();
        products.add(laptop);
        products.add(smartphone1);

        //iterating with while
        //is considered a legacy way of interating, but you can use it if you need a nested if-statement to filter items
        final Iterator<Product> productIterator = products.iterator();
        System.out.println("Products over $1000:");

        while (productIterator.hasNext()) {
             Product product = productIterator.next();
             if (product.getPrice() > 1000) {
                 System.out.println(product.getDescription());
             }
        }

        //iterating with forEach
        System.out.println("The entire list of products available:");
        for (Product product : products) {
            System.out.println(product.getDescription());
        }

        //searching for the product
        Product productToSearch = smartphone2;
        if (products.contains(productToSearch)) {
            System.out.println("The product is in stock!");
        } else {
            System.out.println("Sorry! There is no such product in our database!");
        }

        //adding and removing collections to/from other collections
        Collection<Product> otherProducts = new ArrayList<>();
        otherProducts.addAll(products);
        System.out.println(otherProducts.size());
//        otherProducts.removeAll(products);
        otherProducts.clear(); //clearing the collection entirely
        System.out.println(otherProducts.size());
    }
}

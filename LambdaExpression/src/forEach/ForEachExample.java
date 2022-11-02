package forEach;

import java.util.*;

public class ForEachExample {
    public static void main(String[] args) {
        //add list of products
        List<Product> productList = Arrays.asList(new Product(1, "TV"), new Product(2, "Book"),
                new Product(3, "Computer"));

        //iterating over a collection - list
        System.out.println("== Iterating through LIST == ");
        productList.forEach(System.out::println);

        //iterating over a collection - set
        Set<Product> productSet = new HashSet<>(Arrays.asList(new Product(1, "TV"), new Product(2, "Book"),
                new Product(3, "Computer")));
        System.out.println("== Iterating through SET ==");
        productSet.forEach(System.out::println);

        //iterating over a - map
        Map<String, Product> productMap = new HashMap<>();
        productMap.put("Electronics", new Product(1, "TV"));
        productMap.put("Hardware", new Product(2, "cycle"));
        productMap.put("Food", new Product(3, "Yogurt"));

        System.out.println("== Iterating through MAP ==");
        productMap.forEach((key, value) -> System.out.println(key + " " + value));

    }
}

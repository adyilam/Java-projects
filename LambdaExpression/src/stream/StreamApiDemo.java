package stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamApiDemo {

    public static void main(String[] args) {
        //populating some items in the list
        List<Item> itemList = new ArrayList<>();
        itemList.add(new Item(01, "Book", "5"));
        itemList.add(new Item(02, "Computer", "1000"));
        itemList.add(new Item(03, "Speaker", "400"));
        itemList.add(new Item(04, "Pen", "2"));

        //Let us display the item its price less than 500 dollar?
        //without stream
        for (Item item : itemList) {
            if (Integer.parseInt(item.getPrice()) < 500) {
                System.out.println(item);
            }
        }

        //Now let us use stream to display the same question above
        List<Item> items = itemList.stream()
                .filter(i -> (Integer.parseInt(i.getPrice()) < 500))
                .collect(Collectors.toList());
        System.out.println(items);

        //Let us filter the list based on price
        itemList.stream()
                .filter(i -> Integer.parseInt(i.getPrice()) == 400)
                .forEach(i ->
                        System.out.println("Displaying name of the item with price 400: "
                                + i.getItemName()));

        //Let us Sum the total price of items in the list
        int totalItemsPrice = itemList.stream()
                .collect(Collectors.summingInt(item1 -> Integer.parseInt(item1.getPrice())));
        System.out.println("Total price of items: " + totalItemsPrice);

        //Finally, Let us convert List of items into Map
        Map<Integer, String> itemsToMap = itemList.stream()
                .collect(Collectors.toMap(item -> item.getItemNo(), item -> item.getItemName()));
        System.out.println("Items in Map: " + itemsToMap);
        
    }
}

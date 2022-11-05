package stream;

import forEach.Product;

import javax.management.InstanceNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import static java.lang.System.out;

public class StreamDemo {
    public static void main(String[] args) {
        //stream on collections
        List<Item> itemList = new ArrayList<>();
        itemList.add(new Item(01, "Book", "10"));
        itemList.add(new Item(02, "Pen", "2"));
        itemList.add(new Item(03, "Computer", "700"));
        itemList.add(new Item(04, "Speaker", "400"));

        //display items, there price less than $600
        //without stream
        for (Item item : itemList) {
            if (Integer.parseInt(item.getPrice()) < 600) {
                out.println(item);
            }
        }

        //with stream collect()
        List<Item> item = itemList.stream()
                .filter(i -> (Integer.parseInt(i.getPrice()) < 600))
                .collect(Collectors.toList());
        System.out.println(item);

        //stream with filter()
        itemList.stream()
                .filter(i -> (Integer.parseInt(i.getPrice()) == 700))
                .forEach(i -> System.out.println("Display item its price 700:  " + i.getItemName()));

        //sum the total items price using Collectors summing() method
        int totalItemsSum = itemList.stream()
                .collect(Collectors.summingInt(item1 -> Integer.parseInt(item1.getPrice())));
        System.out.println("Total price of Items:  $" + totalItemsSum);

        //stream with count() method, count item price less than $500
        int countItemPriceLessThan500 = (int) itemList.stream()
                .filter(item2 -> Integer.parseInt(item2.getPrice()) < 500)
                .count();
        System.out.println("Number of Items its price less than $500: " + countItemPriceLessThan500);


    }

}


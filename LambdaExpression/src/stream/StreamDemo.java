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
        itemList.add(new Item(02, "pen", "2"));
        itemList.add(new Item(03, "computer", "700"));
        itemList.add(new Item(04, "speaker", "400"));

        //display items, there price less than $600
        //without stream
        for (Item item : itemList) {
            if (Integer.parseInt(item.getPrice()) < 600) {
                out.println(item);
            }
        }

        //with stream
        List<Item> item = itemList.stream()
                .filter(i -> (Integer.parseInt(i.getPrice()) < 600))
                .collect(Collectors.toList());
        System.out.println(item);
    }
}

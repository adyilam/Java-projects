package javaFeatures.java9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class streamBreak {
    public static void main(String[] args) {
        //if element length is odd display and break
        //using plain java loop
        List<String> stringList = Arrays.asList("Phone", "Computer", "Car");
        for (String str : stringList) {
            if (str.length() % 2 != 0) {
                System.out.println(str);
                break;
            }
        }

        //stream.takeWhile
        Stream.of("Phone", "Computer", "Car")
                .takeWhile(n -> n.length() % 2 != 0)
                .forEach(System.out::println);

        //immutable list
        List<Item> listOfString = new ArrayList<>();
        listOfString.add(new Item(1, "Car"));
        listOfString.add(new Item(2, "House"));
        //listOfString = Collectors.toUnmodifiableList(listOfString);

        //List.of
        List<Item> list = List.of(new Item(1, "Car"), new Item(2, "House")); //already immutable
        list.add(new Item(3, "Train")); // throws UnsupportedOperationException

    }


}

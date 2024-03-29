package javaFeatures.java8.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
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

        //find employee name with his state address
        Employee employee = new Employee(1, "Smith",
                new Address("777 5th avenue", "GA", "Decatur", "30033"));
        //pre-java8
        if (employee != null) {
            Address address = employee.getAddress();
            if (address != null) {
                String state = address.getState();
                if (state != null) {
                    System.out.println(employee.getName() + " " + state);
                }
            }
        }

        //java8 using Optional
        Optional<Employee> employee1 = Optional.ofNullable(employee);
        String emp = employee1
                .map(e -> e.getName() + " " + e.getAddress().getState()) //convert getName(),getAddress to Optional
                .orElse("Employee record not found!");
        System.out.println(emp);

        //more Optional example
        int num1 = 5;
        Integer num2 = null;

        //this will throw NPE because num2 is null
        SimpleCalculatorImpl simpleCalculator = new SimpleCalculatorImpl();
        //System.out.println(simpleCalculator.add(num1, num2)); //Cannot invoke "java.lang.Integer.intValue()" because "number2" is null
        //System.out.println(simpleCalculator.divide(num1, num2)); //throws null-pointer exception,because num2 is null


        //Java8 optional allows passing parameter as null value
        Optional<Integer> number1 = Optional.of(num1);
        Optional<Integer> number2 = Optional.ofNullable(num2);

        System.out.println("Sum: " + simpleCalculator.add(number1, number2));
        System.out.println("Division: " + simpleCalculator.divide(number1, number2));

    }
}

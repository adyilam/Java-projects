package interview;

import java.util.ArrayList;
import java.util.List;

import static interview.TypeConverter.convertArrayToList;
import static interview.TypeConverter.convertListToArray;

public class TypeConverterDriver {

    public static void main(String[] args) {

        //create a list
        List<String> items = new ArrayList<>();
        items.add("TV");
        items.add("PHONE");
        items.add("BOOKS");
        items.add("WATCHES");

        //Convert List to array
        //calling a convertListToArray() method
        String[] myArray = convertListToArray(items);

        //print the values
        System.out.print("Items of an Array: ");
        for (String item : myArray) {
            System.out.print(item + ",");
        }
        System.out.println();
        //--------------------------
        //convert Array to List
        //create an array
        String[] myItems = {"TV", "PHONE", "BOOKS", "WATCHES"};

        //calling convertArrayToList() method
        List<String> myListItem = convertArrayToList(myItems);

        //print the value of the list
        System.out.println("Items in the list: " + myListItem);

    }
}

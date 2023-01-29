package interview;

import java.util.Arrays;
import java.util.List;

/**
 * Java program to convert List to Array and vice versa.
 */
public class TypeConverter {

    public static String[] convertListToArray(List<String> items) {
        //create an array to hold the items
        String[] myArray = new String[items.size()];

        //convert ArrayList to String array
        items.toArray(myArray);  //list converted to array and value store in myArray
        return myArray;
    }

    public static List<String> convertArrayToList(String[] items) {
        //create a list object to hold the values
        List<String> myListItem = Arrays.asList(items);  //converts array to list
        return myListItem;
    }

}



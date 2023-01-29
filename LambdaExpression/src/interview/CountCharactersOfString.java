package interview;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Java program helps to count frequencies of characters in a given String
 * Example : String input : Hello There
 * output: H:1, T:1, e:1, l:2, o:1, r:1,
 */
public class CountCharactersOfString {

    public static void main(String[] args) {
        //get user input
        System.out.println("ENTER THE STRING: ");
        Scanner sc = new Scanner(System.in);
        String userInput = sc.nextLine();

        //Convert string to character array
        char[] characters = userInput.toCharArray();

        //sort the given character array
        Arrays.sort(characters);

        //Call the function
        int[] charFreq = countFrequencyOfCharacters(characters);

        //print the character with its frequency
        for (int i = 0; i < characters.length; i++) {
            //checking for the ' ' , else will print the value
            if (characters[i] != ' ')
                System.out.print(characters[i] + ":" + charFreq[i] + ",");
        }

    }

    //this method counts the occurrence of the character ina given string
    private static int[] countFrequencyOfCharacters(char[] characters) {

        int len = characters.length;
        int[] charFreq = new int[len];
        //Need nested loop  to iterate through the characters and compare
        for (int i = 0; i <= len - 1; i++) {
            charFreq[i] = 1;
            for (int j = i + 1; j < len; j++) {
                if (characters[i] == characters[j]) {
                    //counter to hold the frequency...
                    charFreq[i]++;
                    //need to exclude printing already visited characters
                    characters[j] = ' ';
                }
            }
        }
        return charFreq;
    }
}

//let us run the app., doing more test
//Thanks for watching :)
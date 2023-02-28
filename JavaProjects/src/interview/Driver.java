package interview;

public class Driver {
    public static void main(String[] args) {
        String str = "Reverse String";
        System.out.println("Given String: " + str);

        //calling reverseString () method
        //StringBuilder result = reverseString1(str);
        //System.out.print("Reversed String: " + result);

        char[] result1 = reverseString(str);
        System.out.print("Reversed String: " + result1[0]);

    }

    private static StringBuilder reverseString1(String str) {
        StringBuilder reversedString = new StringBuilder();
        reversedString.append(str);
        reversedString.reverse();
        System.out.println("Reverse string using predefined method reverse() : " + reversedString);

        return reversedString;
    }

    private static char[] reverseString(String str) {
        char[] chars = str.toCharArray();
        int size = chars.length;
        StringBuilder reversedString = new StringBuilder();
        char[] revString = new char[size];

        for (int i = size - 1; i >= 0; i--) {
            revString[i] = chars[i];            //appends the chars
        }
        return revString;
    }
}


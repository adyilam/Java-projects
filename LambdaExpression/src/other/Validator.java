package other;

import java.util.Scanner;

public class Validator {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int minLen = 2;
        int maxLen = 20;

        while (true) {
            System.out.println("Enter name");
            try {
                String name = sc.nextLine();
                if (validateNameLength(name, minLen, maxLen)) {
                    break;
                }
            } catch (Exception e) {
                System.out.println("Input mismatch exception" + e);
                //sc.nextLine();
            }
        }

        while (true) {
            System.out.println("Enter Age");
            try {
                int age = sc.nextInt();
                if (validateAgeLength(age)) {
                    break;
                }
            } catch (Exception e) {
                System.out.println("Input mismatch exception" + e);
                sc.nextLine();
            }
        }


    }

    private static boolean validateAgeLength(int age) {
        if (age < 5) {
            System.out.println("Age can not be less than 5, Try Again");
        } else if (age > 90) {
            System.out.println("Age can not be greater than 90, Try Again");
        }
        return age >= 5 && age <= 89;
    }

    private static boolean validateNameLength(String name, int minLen, int maxLen) {
        if (name.length() < minLen) {
            System.out.println("Name can not be less than 2, Try Again");
        } else if (name.length() > maxLen) {
            System.out.println("Name can not be greater than 20, Try Again");
        }
        return name.length() >= minLen && name.length() <= maxLen;
    }
}

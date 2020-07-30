package Problems;


import java.util.NoSuchElementException;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Problem1 {

    public static void palindrome () {

        // TODO: Is a word palindrome
        try {
            Pattern pattern = Pattern.compile("[Yy][Ee][Ss]");
            Scanner sc = new Scanner(System.in);

            while (true) {
                System.out.println("Enter the word without spaces");
                String word = sc.nextLine();
                if (word.contains(" ")) {
                    System.out.println("Enter the word without spaces");
                }
                else {
                    StringBuilder sb = new StringBuilder(word).reverse();
                    boolean isPalindrome = word.equalsIgnoreCase(sb.toString());
                    System.out.println(isPalindrome ? "It's a palindrome" : "It's not a palindrome");
                }
                System.out.println("Want to try again?");
                System.out.println("Enter yes if you want to continue or enter any symbol if no");
                if (!sc.nextLine().matches(pattern.toString())) {
                    break;
                }
            }
        }

        catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
}

package Problems;

import java.util.Scanner;




public class Problem2 {
    //TODO: Drawing a staircase

    public static void staircase () {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Enter your desireable digit without spaces");
            String isVariableWithSpaces = sc.nextLine();
            boolean isInteger = tryParse(isVariableWithSpaces);
            if (isInteger) {
               int isYourVariable = Integer.parseInt(isVariableWithSpaces);
                System.out.println("You entered " + isYourVariable);
                for (int i = 0; i<isYourVariable; i++) {
                    for (int j = 0; j<i+1; j++) {
                        System.out.print("*");
                    }
                    System.out.println();
                }
            }
            else {
                System.out.println("It's not a digit or you entered digit with spaces");
            }
        }
        catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }

    public static boolean tryParse (String str) {
        try {
            Integer.parseInt(str);
            return true;
        }
        catch (Exception ex) {
            return false;
        }

    }

}



/* public void staircase (int n) {
       for (int i = 0; i<n; i++) {
           for (int j = 0; j<i+1; j++) {
               System.out.print("*");
           }
           System.out.println();
       }
    }
 */

//  int isYourVariable = sc.nextInt();
/*  System.out.println("Enter your desireable digit");
            if (sc.hasNextInt()) {
                int isYourVariable = sc.nextInt();
                System.out.println("You entered " + isYourVariable);
                for (int i = 0; i<isYourVariable; i++) {
                    for (int j = 0; j<i+1; j++) {
                        System.out.print("*");
                    }
                    System.out.println();
                }
 */


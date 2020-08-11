package newPackage;


import Problems.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int[][] kark = new int[][] {
                {3,7,6}, //16
                {9,5,1}, //15
                {4,3,7}, //14
        };

        int kwak [][] = new int[][] {
                {3, 7, 6, 5},
                {10, 1, 3, 5},
                {11, 1, 3, 5},
              //  {3, 4, 3,}
        };
        Problem12.sort(kark);
    /*    int [] array1 = new int[] {1,5,5};
        int [] array2 = new int[] {2,6,7};
        int [] array3 = new int[] {1,4,7,8};
     System.out.println(Problem11.merged(array1,array2,array3)); */
      // Problem9.friendlyPair(28);
       // int [] karl = new int[] {5, 2, 4, 3, 3, 2, 7, 8, 1};  // {2, 5, 3, 4, 2, 2, 2, 4, 8, 2, 5, 3, 3, 3, 7};
     //   Problem23.ascendedArray(karl);
      //  Problem8.primeNumbers(15);
       // System.out.println(Problem6.pi(6));
       // Problem6.pi(0);
  //  Problem1.palindrome();
  //  Problem2.staircase();
     /*
        Problem2 two = new Problem2();
        two.staircase(6);
        Problem3 three = new Problem3();
        float [] kejbfke = new float[] {0.3f, 0.4f, 0.7f};
        float [] result = three.inverseArray(kejbfke);
        for (float karl: result) {  //верни мне что  (по элементам) : откуда
            System.out.print(karl);
        int [] mass = new int[] {3,60,2,5};
        Problem5.oddEven(mass);


     System.out.println(Problem10.leapYear(1900));
        List<Integer> meow = new ArrayList<>();
        meow.add(1);
        meow.add(2);
        meow.add(3);
        meow.add(4);
        meow.add(5);
        meow.add(6);
        meow.add(7);
     Problem13.rotate(0, meow);
        for (int karl:meow) {
            System.out.println(karl);
        List<Integer> meow = new ArrayList<>();
        meow.add(1);
        meow.add(2);
        meow.add(3);
        meow.add(4);
        meow.add(5);
        meow.add(6);
        meow.add(7);
        Problem18.output(3, meow);
     int[][] kark = new int[][] {
             {3,7,6},
             {9,5,1},
             {4,3,8}
     }
   System.out.print(Problem7.checkMagicSquare(kark));

     System.out.print(Problem9.friendlyOrNot(12)); */

    /*    Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("Enter a word without spaces: ");
            String word = sc.next();
            if (word.contains(" ")) {
                System.out.println("It's not a word");
            } else {
                System.out.println("The word is correct");
                StringBuilder reverse = new StringBuilder(word).reverse();
                System.out.println(word.equalsIgnoreCase(reverse.toString()) ? "Palindrome" : "Not a palindrome");
            }
            System.out.println("Want to try another one?");
            System.out.print("Enter yes if you want to continue or enter any symbol if no: ");
            if (!sc.nextLine().matches("[Y|y][E|e][S|s]")) {
                break;
            }
        } */
    }
}



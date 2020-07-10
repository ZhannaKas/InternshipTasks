package Problems;

public class Problem2 {

    public void staircase (int n) {
       for (int i = 0; i<n; i++) {
           for (int j = 0; j<i+1; j++) {
               System.out.print("*");
           }
           System.out.println();
       }
    }
}

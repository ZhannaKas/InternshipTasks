package Problems;


public class Problem6 {
    public static double pi (int n) {
       String str = String.valueOf(Math.PI).substring(0,2+n);
       double perfectPi = Double.parseDouble(str);
      return perfectPi;
    }
}

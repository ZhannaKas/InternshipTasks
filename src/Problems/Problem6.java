package Problems;


public class Problem6 {
    //TODO: return n-digit after coma
    public static double pi (int n) {
        try {
            if (n>=0) {
                String str = String.valueOf(Math.PI).substring(0,2+n);
                double perfectPi = Double.parseDouble(str);
                return perfectPi;
            }
            else {
                System.out.println("Try another one");
                return 0.0;
            }
        }
        catch (Exception ex) {
            System.out.println(ex.getMessage());
            return 0.0;
        }

    }
}

/* public static double pi (int n) {
       String str = String.valueOf(Math.PI).substring(0,2+n);
       double perfectPi = Double.parseDouble(str);
      return perfectPi;
    }
 */

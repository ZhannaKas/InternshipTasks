package Problems;

public class Problem10 {
    public static boolean leapYear (int year) {
        if (1582<=year) {
            if ((year % 4 == 0 && year%100 != 0) || (year%400 == 0)) {
                System.out.println("Gregorian");
                return true;
            }
        }
        else {
            if (year%4 == 0) {
                System.out.println("Yulian");
                return true;
            }
        }
        return false;
    }
}

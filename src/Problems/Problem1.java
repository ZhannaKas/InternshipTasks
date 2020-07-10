package Problems;


public class Problem1 {

    public boolean palindrome (String text) {
        String text2 = "";
        StringBuilder sb = new StringBuilder();
        text2 =  sb.append(text).reverse().toString();
        if (text.equalsIgnoreCase(text2)) {
            return true;
        }
        else {
            return false;
        }
    }
}

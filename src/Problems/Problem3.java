package Problems;

public class Problem3 {
    //TODO: inverse array
    public float [] inverseArray (float [] array) {
        int sizeArray = array.length;
        float [] invesrsedArray = new float[sizeArray];
        for (int i = 0; i<invesrsedArray.length; i++) {
            invesrsedArray [sizeArray-1] = array [i];
            sizeArray--;
        }
        return invesrsedArray;
    }

}

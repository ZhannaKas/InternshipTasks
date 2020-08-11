package Problems;

public class Problem7 {
    //TODO: is a magic Square or not

public static   boolean checkMagicSquare (int [][] array) {
    int variablePrevious = 0;
    int currentVariable = 0;
    for (int i = 0; i < array.length; i++) {
        if (array.length != array[i].length) {
            return false;
        }
    }
    int rowSize = array.length;

        for (int i =0; i<rowSize; i++) {
            for (int j = 0; j<rowSize; j++) {
                variablePrevious += array[i][j];
            }
            if (currentVariable != variablePrevious && currentVariable !=0) {
                return false;
            }
            currentVariable = variablePrevious;
            variablePrevious = 0;
        }

        for (int j = 0; j<rowSize; j++) {
            for (int i = 0; i<rowSize; i++){
                variablePrevious += array [i][j];
            }
            if (currentVariable != variablePrevious && currentVariable !=0) {
                return false;
            }
            currentVariable = variablePrevious;
            variablePrevious = 0;
        }

        for (int i = 0; i<rowSize; i++) {
            variablePrevious += array [i][i];
            }
           if (currentVariable != variablePrevious && currentVariable !=0) {
            return false;
        }
           currentVariable = variablePrevious;
           variablePrevious = 0;

           for (int i = 0; i<rowSize; i++) {
               variablePrevious += array[i][rowSize - 1 - i];
           }
           if (currentVariable != variablePrevious && currentVariable !=0) {
              return false;
    }

return true;
}
}
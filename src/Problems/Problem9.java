package Problems;


public class Problem9 {
    //TODO: do number has a friendly pair?
    public static void friendlyPair(int number) {

        int sum = 0;
        float previousAbundancyIndex = 0;
        float actualAbundancyIndex = 0;
        for (float j = number; j > 0; j--) { // берем число и уменьшаем
            for (float i = j; i > 0; i--) { // узнаем индекс избыточности
                if (j % i == 0) {
                    sum += i;
                }
            }
            previousAbundancyIndex = sum / j; // узнали индекс
            if (actualAbundancyIndex == 0) {
                System.out.println("Number " + j + " is not pair for " + number);
                actualAbundancyIndex = previousAbundancyIndex;
                previousAbundancyIndex = 0;
                sum = 0;
                continue;
            }
            if (previousAbundancyIndex == actualAbundancyIndex) {
                System.out.println("Pair for number " + number + " is " + j);
                previousAbundancyIndex = 0;
                sum = 0;
            } else {
                System.out.println("Number " + j + " is not pair for " + number);
                previousAbundancyIndex = 0;
                sum = 0;
            }

        }
    }
}

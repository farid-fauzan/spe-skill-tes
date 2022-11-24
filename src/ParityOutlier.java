import java.util.ArrayList;

public class ParityOutlier {

    public int find(int[] integers) {
        int firstThreeParity = integers[0]%2 + integers[1]%2 + integers[2]%2;
        int rem = firstThreeParity < 2 ? 1 : 0;
        for (int i = 0; i < integers.length; i++) {
            if (integers[i] % 2 == rem) {
                return integers[i];
            }
        }
        return -1;

    }

}

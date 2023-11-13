import java.util.Arrays;

public class SortValue {
    public static void main(String[] args) {
        int[] rawData = {3, 2, 5, 1, 4};
        for (int i = 0; i <= rawData.length - 2; i++) {
            for (int j = i + 1; j <= rawData.length - 1; j++) {
                int temp;
                if (rawData[i] > rawData[j]) {
                    temp = rawData[i];
                    rawData[i] = rawData[j];
                    rawData[j] = temp;
                }
            }

        }
        System.out.println(Arrays.toString(rawData));
    }
}

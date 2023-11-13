import java.util.Arrays;

public class SortValue {
    public static void main(String[] args) {
        int[] rawData = { 4, 3, 6, 4, 8 };
        for (int i = 0; i <= rawData.length - 2; i++) {
            int temp;
            for (int j = i + 1; j <= rawData.length - 1; j++) {
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

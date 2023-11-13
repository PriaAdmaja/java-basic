import java.util.ArrayList;

public class SameValue {
    public static void main(String[] args) {
        int[] firstArray = { 2, 3, 4, 5 };
        int[] secondArray = { 1, 3, 5, 7 };
        ArrayList<Integer> results = new ArrayList<Integer>();

        for(int i = 0; i <= firstArray.length - 1; i++) {
            for(int j = 0; j <= secondArray.length - 1; j++) {
                if(firstArray[i] == secondArray[j]) {
                    results.add(firstArray[i]);
                }
            }
        }

        System.out.println(results.toString());
    }
}

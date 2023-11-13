import java.util.Scanner;

public class FindValue {
    public static void main(String[] args) {
        double[] numberList = {163, 160, 172, 168, 166, 168.5, 170, 169, 166.5, 180};
        Scanner inputData = new Scanner(System.in);
        double value;
        String result = "Data not found";
        System.out.print("Value : ");
        value = Double.parseDouble(inputData.nextLine());
        inputData.close();
        for(double item : numberList) {
            if (item == value) {
               result = "Found data " + item + "";
            } 
        }

        System.out.println(result);
    }
}

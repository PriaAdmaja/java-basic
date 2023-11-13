import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner inputData = new Scanner(System.in);
        String firstName;
        String lastName;
        String birthPlace;
        String birthYear;
        String progrLangFav;

        System.out.println("Hello!");
        System.out.print("Firstname : ");
        firstName = inputData.nextLine();

        System.out.print("Lastname : ");
        lastName = inputData.nextLine();

        System.out.print("Birthplace : ");
        birthPlace = inputData.nextLine();

        System.out.print("Birth Year : ");
        birthYear = inputData.nextLine();

        System.out.print("Your favorite programming language : ");
        progrLangFav = inputData.nextLine();
        inputData.close();

        System.out.println("=====================================");
        System.out.println("Hello, my name " + firstName + lastName + ". I was born in " + birthPlace + " in " + birthYear + ". My favorite programming language is " + progrLangFav);
        
    }
    
}

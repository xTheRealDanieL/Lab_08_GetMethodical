import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String firstName = "";
        String lastName = "";
        firstName = SafeInput.getNonZeroLength(in, "Enter your first name");
        lastName = SafeInput.getNonZeroLength(in, "Enter your last name");
        System.out.println("\nYour full name is: " + firstName + " " + lastName);


        SafeInput.prettyHeader("123 455 678");
    }


}

import java.util.Scanner;
public class DevTest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

    /*    String firstName = "";
        String lastName = "";
        firstName = SafeInput.getNonZeroLength(in, "Enter your first name");
        lastName = SafeInput.getNonZeroLength(in, "Enter your last name");
        System.out.println("\nYour full name is: " + firstName + " " + lastName);

        int favInt = SafeInput.getInt(in, "Enter your favorite integer");
        double favDouble = SafeInput.getDouble(in, "Enter your favorite double");

        System.out.println("Your favorite integer is " + favInt);
        System.out.println("Your favorite double is " + favDouble);

        int year = SafeInput.getRangedInt(in, "Enter your year", 1950, 2010);
        int month = SafeInput.getRangedInt(in, "Enter your month", 1, 12);
        int day=0;

        switch(month) {
            case 2:
                day = SafeInput.getRangedInt(in, "Enter your day", 1, 29);
                break;
            case 4:
                day = SafeInput.getRangedInt(in, "Enter your day", 1, 30);
                break;
            case 6:
                day = SafeInput.getRangedInt(in, "Enter your day", 1, 30);
                break;
            case 9:
                day = SafeInput.getRangedInt(in, "Enter your day", 1, 30);
                break;
            case 11:
                day = SafeInput.getRangedInt(in, "Enter your day", 1, 30);
                break;
            default:
                day = SafeInput.getRangedInt(in, "Enter your day", 1, 31);
                break;
        }

        int hrs = SafeInput.getRangedInt(in, "Enter your hours", 1, 24);
        int mins = SafeInput.getRangedInt(in, "Enter your minutes", 1, 59);

        System.out.println("You said you were born on " + month + "/" + day + "/" + year + " at " + hrs + ":" + mins);

        double total = 0;
        boolean done = false;

        while (!done) {
            double price = SafeInput.getRangedDouble(in, "Enter your the price of your item", .50, 9.99);
            total += price;
            boolean again = SafeInput.getYNConfirm(in, "Do you want to continue shopping");

            if(again==false)
            {
                done=true;
            }
        }
        System.out.printf("Total price is %.2f", total);


        String SSN = SafeInput.getRegExString(in,"Enter your SSN", "\\d{3}-\\d{2}-\\d{4}");
        System.out.println("Your SSN is " + SSN);

        String UC = SafeInput.getRegExString(in, "Enter your UC Student number", "(M|m)\\d{5}");
        System.out.println("Your UC Number is " + UC);

        String menu = SafeInput.getRegExString(in, "What is your choice", "[OoSsVvQq]");
        System.out.println("Your menu choice is " + menu);

        SafeInput.prettyHeader("Alo Alo Alo");*/



    }
}

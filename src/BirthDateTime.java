import java.util.Scanner;

public class BirthDateTime {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

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
    }
}

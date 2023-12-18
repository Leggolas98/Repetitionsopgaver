import javax.swing.*;
import java.util.Scanner;

public class Dialog {
    int currentYear;

    public Dialog(int currentYear) {
        this.currentYear = currentYear;
    }

    public void getYearOfBirth() {
        System.out.println("Please type your year of birth");

        Scanner scanner = new Scanner(System.in);

        int yearOfBirth = Integer.parseInt(scanner.nextLine());

        getYearsToRetirement(yearOfBirth);


    }

    public int getYearsToRetirement(int yearOfBirth) {
        int retirementAge = 67;

        int retirement = yearOfBirth + retirementAge;

        int yearsUntilRetirement = retirement - currentYear;

        System.out.println("You have " + yearsUntilRetirement + " years left, before you can retire");

        return yearsUntilRetirement;
    }
}

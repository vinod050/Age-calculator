
import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class Agecalculator{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your birthdate (YYYY-MM-DD): ");
        String birthDateString = scanner.nextLine();
        LocalDate birthDate = LocalDate.parse(birthDateString);
        LocalDate currentDate = LocalDate.now();
        Period period = Period.between(birthDate, currentDate);
        System.out.println("Your age is: " + period.getYears() + " years, " + period.getMonths() + " months, and " + period.getDays() + " days.");
        
        scanner.close();
    }
}   


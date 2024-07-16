import java.util.Scanner;
import java.time.Period;
import java.time.LocalDate;

public class Scanner_T4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter your birth year (YYYY): ");
		int year = sc.nextInt();
		
		System.out.print("Enter your birth month (MM): ");
		int month = sc.nextInt();
		
		System.out.print("Enter your birth day (DD): ");
		int day = sc.nextInt();
		
		sc.close();
		
		LocalDate currentDate = LocalDate.now();
		LocalDate birthDate = LocalDate.of(year, month, day);
		
		Period age = Period.between(birthDate, currentDate);
		
		System.out.println("You are " + age.getYears() + " years, " + age.getMonths() + " months and " + age.getDays() + " days old.");
		
		
		System.out.println(age);
	}
}
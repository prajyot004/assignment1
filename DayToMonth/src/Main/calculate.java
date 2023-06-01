package Main;
import java.util.*;
public class calculate {
	public static void main(String[] args) {
		Scanner sc1 = new Scanner(System.in);
		System.out.print("Enter the Number of days: ");
		int days = sc1.nextInt();
		int month = days/30;
		int remDays = days%30;
		System.out.print("Number of Months is " +month+" months & "+remDays+" days");
	}
}

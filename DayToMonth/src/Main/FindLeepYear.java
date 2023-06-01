package Main;
import java.util.*;
public class FindLeepYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the year");
		int year = sc.nextInt();
		
		if(year % 100 == 0) {
			if(year % 400 == 0) {
				System.out.print("year is leap year");
			}else {
				System.out.print("year is not leap year. It is ceturial Year");
			}
		}else if(year % 4 == 0) {
			System.out.print("year is leap year");
		}else {
			System.out.print("year is not leap year");
		}
		
		
	}

}

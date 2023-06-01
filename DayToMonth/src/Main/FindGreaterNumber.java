package Main;

import java.util.Scanner;

public class FindGreaterNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter first number");
		int a = sc.nextInt();
		System.out.print("Enter second number");
		int b = sc.nextInt();
		System.out.print("Enter Third number");
		int c = sc.nextInt();
		
		if(a > b && a > c) {
			System.out.print("First number is greater");
		}
		if(b > a && b > c) {
			System.out.print("Second number is greater");
		}
		if(c > a && c > b) {
			System.out.println("Third number is greater");
		}
		
		
	}

}

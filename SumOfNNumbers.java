import java.util.Scanner;

public class SumOfNNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number:");
        int n = sc.nextInt();
        double sum = ((n)*(n+1))/2;
        System.out.println("Sum of First " + n+" numbers is :" +sum);
    }

}

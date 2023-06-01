import java.util.Scanner;

public class OrderWeight {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of widgets:");
        int widgets = sc.nextInt();
        System.out.println("Enter the number of gizmo:");
        int gizmo = sc.nextInt();
        int total = (gizmo * 112) + (widgets * 75);
        System.out.println("Total weight of order is "+total+" grams");
    }
}

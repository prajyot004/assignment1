import java.util.Scanner;

public class AreaOfTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the height of triangle:");
        float height = sc.nextFloat();
        System.out.print("Enter the base of Triangle:");
        float base = sc.nextFloat();
        double Area = (1.0/2.0) * height * base;
        System.out.println("Area of triangle is: "+ Area);
    }
}

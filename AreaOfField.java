import java.util.Scanner;

public class AreaOfField {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of field in feet:");
        float length = sc.nextFloat();
        System.out.println("Enter the width of field in feet:");
        float width = sc.nextFloat();
        double area = (length * width) / 43560;
        System.out.println("Area of field is: " + area + " acres");
    }
}

import java.util.Scanner;

public class AreaOfRectangle {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of Rectangle:");
        int l = sc.nextInt();
        System.out.print("Enter the breadth of Rectangle:");
        int b = sc.nextInt();
        System.out.println("Area of Rectangle is "+l*b);
    }

}

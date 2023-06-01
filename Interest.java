import java.util.Scanner;

public class Interest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Principal amount:");
        float principal = sc.nextFloat();
        System.out.println("Enter the Rate of Interest:");
        float rate = sc.nextFloat();
        System.out.println("Enter the duration of Time in Year");
        float time = sc.nextFloat();
        double si = (principal * rate * time) / 100;
        System.out.println("Simple Interest is :"+si);
    }

}

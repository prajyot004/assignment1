import java.util.Scanner;

public class Temperature {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the temperature in Celsius:");
        float temp = sc.nextFloat();
        double far = (temp * 1.8) + 32.0;
        System.out.println("Temperature in Fahrenheit:"+far);
    }
}

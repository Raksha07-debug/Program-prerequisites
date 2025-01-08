import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the base value: ");
        double base = scanner.nextDouble();

        System.out.println("Enter the exponent value: ");
        double exponent = scanner.nextDouble();

        double result = Math.pow(base, exponent);
        
        System.out.println("The result of " + base + " raised to the power of " + exponent + " is: " + result);
    }
}

import java.util.Scanner;

public class TemperatureConverter {

    
    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    public static double celsiusToKelvin(double celsius) {
        return celsius + 273.15;
    }

    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    public static double fahrenheitToKelvin(double fahrenheit) {
        return (fahrenheit + 459.67) * 5 / 9;
    }

    public static double kelvinToCelsius(double kelvin) {
        return kelvin - 273.15;
    }

    public static double kelvinToFahrenheit(double kelvin) {
        return (kelvin * 9 / 5) - 459.67;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Temperature Conversion Program");
        System.out.println("Choose the original temperature unit:");
        System.out.println("1. Celsius");
        System.out.println("2. Fahrenheit");
        System.out.println("3. Kelvin");
        
        System.out.print("Enter your choice (1/2/3): ");
        int choice = scanner.nextInt();
        
        System.out.print("Enter the temperature value: ");
        double temp = scanner.nextDouble();

        System.out.println();

        switch (choice) {
            case 1: 
                System.out.printf("%.2f°C is equal to:%n", temp);
                System.out.printf("%.2f°F%n", celsiusToFahrenheit(temp));
                System.out.printf("%.2f K%n", celsiusToKelvin(temp));
                break;

            case 2: 
                System.out.printf("%.2f°F is equal to:%n", temp);
                System.out.printf("%.2f°C%n", fahrenheitToCelsius(temp));
                System.out.printf("%.2f K%n", fahrenheitToKelvin(temp));
                break;

            case 3: 
                System.out.printf("%.2f K is equal to:%n", temp);
                System.out.printf("%.2f°C%n", kelvinToCelsius(temp));
                System.out.printf("%.2f°F%n", kelvinToFahrenheit(temp));
                break;

            default:
                System.out.println("Invalid choice. Please restart the program and select a valid option.");
        }

        scanner.close();
    }
}

import java.util.Scanner;
class CelciusFahrenheitKelvinConversion {

    static void temperatureConvertor(double temp, String unit) {
        final String alphabet_F = "F";
        final String alphabet_C = "C";
        final String alphabet_K = "K";

        if(unit.toUpperCase().startsWith(alphabet_C)) {
            double fahrenheitTemp = ((9*temp)/5)+32;
            double kelvinTemp = temp + 273.15;
            System.out.printf("%.2f in Celcius = %.2f in Fahrenheit%n", temp, fahrenheitTemp);
            System.out.printf("%.2f in Celcius = %.2f in Kelvin%n", temp, kelvinTemp);
        }
        else if(unit.toUpperCase().startsWith(alphabet_F)) {
            double celciusTemp = ((temp-32)*5)/9;
            double kelvinTemp = celciusTemp + 273.15;
            System.out.printf("%.2f in Fahrenheit = %.2f in Celcius%n", temp, celciusTemp);
            System.out.printf("%.2f in Fahrenheit = %.2f in Kelvin%n", temp, kelvinTemp);
        }
        else if(unit.toUpperCase().startsWith(alphabet_K)) {
            double celciusTemp = temp - 273.15;
            double fahrenheitTemp = ((celciusTemp*9)/5)+32;
            System.out.printf("%.2f in Kelvin = %.2f in Celcius%n", temp, celciusTemp);
            System.out.printf("%.2f in Kelvin = %.2f in Fahrenheit%n", temp, fahrenheitTemp);
        }
        else {
            System.out.println("Please enter the correct unit for temperature.");
        }
    }
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the temperature: ");
        double temperature = scanner.nextDouble();

        System.out.println("Please enter the unit (F for Fahrenheit, C for Celcius and K for Kelvin): ");
        String unitOfTemperature = scanner.next();

        temperatureConvertor(temperature, unitOfTemperature);

        scanner.close();
    }
}

import java.util.Scanner;
import java.util.HashMap;

class CurrencyConverter {
    private HashMap<String, Double> exchangeRates;

    public CurrencyConverter() {
        exchangeRates = new HashMap<>();
        exchangeRates.put("USD", 1.0);
        exchangeRates.put("EUR", 0.85);
        exchangeRates.put("INR", 83.0);
        exchangeRates.put("JPY", 110.0);
        exchangeRates.put("GBP", 0.75);
    }

    public double convert(String fromCurrency, String toCurrency, double amount) {
        if (!exchangeRates.containsKey(fromCurrency) || !exchangeRates.containsKey(toCurrency)) {
            return -1;
        }
        double baseRate = exchangeRates.get(fromCurrency);
        double targetRate = exchangeRates.get(toCurrency);
        return (amount / baseRate) * targetRate;
    }

    public void displayCurrencies() {
        System.out.println("Available currencies: " + exchangeRates.keySet());
    }
}

public class CurrencyConversionApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CurrencyConverter converter = new CurrencyConverter();

        converter.displayCurrencies();
        System.out.print("Enter base currency (e.g., USD): ");
        String baseCurrency = scanner.next().toUpperCase();

        System.out.print("Enter target currency (e.g., INR): ");
        String targetCurrency = scanner.next().toUpperCase();

        System.out.print("Enter amount to convert: ");
        double amount = scanner.nextDouble();

        double convertedAmount = converter.convert(baseCurrency, targetCurrency, amount);

        if (convertedAmount == -1) {
            System.out.println("Invalid currency selection.");
        } else {
            System.out.printf("Converted Amount: %.2f %s\n", convertedAmount, targetCurrency);
        }

        scanner.close();
    }
}

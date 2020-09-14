import java.util.Scanner;

public class CurrencyConvertClient {
    public static void main(String[] args) {
        // Exchange rate aqquired: 2020-09-07 15:43
        Currency usd = new Currency(8.93, "United States Dollar");
        Currency gbp = new Currency(11.75, "Pound Sterling");
        Currency sek = new Currency(1.02, "Swedish Krona");

        Currency chosenCurrency = usd;

        System.out.println("Choose currency to work with:");
        System.out.println(" 1: " + usd);
        System.out.println(" 2: " + gbp);
        System.out.println(" 3: " + sek);


        Scanner sc = new Scanner(System.in);
        int currencyChoice = (sc.nextInt());

        switch (currencyChoice) {
            case 1:
                System.out.println("Working with USD");
                chosenCurrency = usd;
                break;
            case 2:
                System.out.println("Working with GBP");
                chosenCurrency = gbp;
                break;
            case 3:
                System.out.println("Working with SEK");
                chosenCurrency = sek;
            default:
                System.out.println("Working with USD");
                break;
        }

        System.out.println("Convert to or from NOK?\n 1: To NOK from " + chosenCurrency + "\n 2: From NOK to " + chosenCurrency);
        int toOrFrom = sc.nextInt();

        System.out.print("Amount to convert: ");
        double amount = sc.nextDouble();

        sc.close();

        switch (toOrFrom) {
            case 1:
                // Converting to NOK from chosen currency
                System.out.println(amount + " " + chosenCurrency + " is " +  chosenCurrency.convertToNOK(amount) + " NOK");
                break;
            case 2:
                // Converting to chosen currency from NOK
                System.out.println(amount + " NOK is " + chosenCurrency.convertFromNOK(amount) + " " + chosenCurrency);
                break;
            default:
                break;
        }
    }
}

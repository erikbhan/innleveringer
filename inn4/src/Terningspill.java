import java.util.Scanner;

public class Terningspill {
    public static void main(String[] args) {
        Spiller bot = new Spiller();
        Spiller spiller = new Spiller();

        System.out.println("\nTrykk enter for å kaste.");
        System.out.println("(Skriv 'exit' for å avslutte.\n");

        Scanner sc = new Scanner(System.in);
        int i = 1;

        while (true) {
            String input = sc.nextLine();
            if (input.equals("exit")) {
                break;
            }

            System.out.println("\n-===-+-===-");
            System.out.println("Runde: " + i + "\n");

            System.out.println("Spiller kaster...");
            System.out.println("Fikk: " + spiller.kastTerning());
            System.out.println("Sum så langt: " + spiller.getSumPoeng());

            if (spiller.getSumPoeng() == 100) {
                System.out.print("\nGratulerer! Du vant!\n\n");
                break;
            }

            System.out.println();
            System.out.println("Bot kaster...");
            System.out.println("Fikk: " + bot.kastTerning());
            System.out.println("Sum så langt: " + bot.getSumPoeng());
            
            if (bot.getSumPoeng() == 100) {
                System.out.print("\nBeklager! Du tapte!\n\n");
                break;
            }
            i++;
            System.out.println("-===-+-===-");
        }

        sc.close();
    }
}
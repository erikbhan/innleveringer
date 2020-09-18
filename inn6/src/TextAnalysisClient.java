import java.util.Scanner;

public class TextAnalysisClient {
    public static void main(String[] args) {
        while (true) {
            System.out.print("Text to analyze ('exit' to exit): ");
            Scanner scanner = new Scanner(System.in);
            String input = scanner.nextLine();
            if (input.equals("exit")) {
                break;
            }
            TextAnalysis textAnalysis = new TextAnalysis(input);
            System.out.println(textAnalysis);
            System.out.print("Velg bokstav å analysere forekomster av: ");
            char charInput = scanner.next().charAt(0);
            System.out.println(textAnalysis.occurrencesOfLetter(charInput) + " forekomst(er)\n");
        }
    }
}

import java.util.Scanner;

public class TextAnalysisClient {
    public static void main(String[] args) {
        while (true) {
            System.out.print("Text to analyze: ");
            Scanner scanner = new Scanner(System.in);
            String input = scanner.nextLine();
            TextAnalysis textAnalysis = new TextAnalysis(input);
            System.out.println(textAnalysis);
        }
    }
}

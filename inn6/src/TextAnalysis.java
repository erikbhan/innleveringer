public class TextAnalysis {

    private int[] differentCharacters;
    private String textToAnalyze;

    public TextAnalysis(String textToAnalyze) {
        this.textToAnalyze = textToAnalyze;
        this.differentCharacters = new int[30];
        fillDifferentCharacters();
    }

    //privat fordi klient ikke trenger tilgang og kjøres bare en gang ved konstruksjon
    private void fillDifferentCharacters() {
        for (int i = 0; i < this.textToAnalyze.length(); i++) {
            char charToAnalyze = Character.toLowerCase(this.textToAnalyze.charAt(i));
            switch (charToAnalyze) {
                case 'a' -> differentCharacters[0]++;
                case 'b' -> differentCharacters[1]++;
                case 'c' -> differentCharacters[2]++;
                case 'd' -> differentCharacters[3]++;
                case 'e' -> differentCharacters[4]++;
                case 'f' -> differentCharacters[5]++;
                case 'g' -> differentCharacters[6]++;
                case 'h' -> differentCharacters[7]++;
                case 'i' -> differentCharacters[8]++;
                case 'j' -> differentCharacters[9]++;
                case 'k' -> differentCharacters[10]++;
                case 'l' -> differentCharacters[11]++;
                case 'm' -> differentCharacters[12]++;
                case 'n' -> differentCharacters[13]++;
                case 'o' -> differentCharacters[14]++;
                case 'p' -> differentCharacters[15]++;
                case 'q' -> differentCharacters[16]++;
                case 'r' -> differentCharacters[17]++;
                case 's' -> differentCharacters[18]++;
                case 't' -> differentCharacters[19]++;
                case 'u' -> differentCharacters[20]++;
                case 'v' -> differentCharacters[21]++;
                case 'w' -> differentCharacters[22]++;
                case 'x' -> differentCharacters[23]++;
                case 'y' -> differentCharacters[24]++;
                case 'z' -> differentCharacters[25]++;
                case 'æ' -> differentCharacters[26]++;
                case 'ø' -> differentCharacters[27]++;
                case 'å' -> differentCharacters[28]++;
                default -> differentCharacters[29]++;
            }
        }
    }

    public int amountOfDifferentCharacters() {
        return -1;
    }
}

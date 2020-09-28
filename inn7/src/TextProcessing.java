public class TextProcessing {
    String textToAnalyze;
    public TextProcessing(String textToAnalyze) {
        this.textToAnalyze = textToAnalyze;
    }

    public String getTextToAnalyze() {
        return this.textToAnalyze;
    }

    public String getTextToAnalyzeUppercase() {
        return this.textToAnalyze.toUpperCase();
    }

    public int findWordCount() {
        int count = 0;
        for (String word: this.textToAnalyze.split(" ")) {
            count++;
        }
        return count;
    }

    public int findWordCount(String toAnalyze) {
        int count = 0;
        for (String word: toAnalyze.split(" ")) {
            count++;
        }
        return count;
    }

    public double averageWordLength() {
        int sumWordLength = 0;
        for (String word: this.textToAnalyze.split(" ")) {
            sumWordLength += word.length();
        }
        return (sumWordLength*1.0 / this.findWordCount());
    }

    public double averageWordLength(String toAnalyze) {
        int sumWordLength = 0;
        for (String word: toAnalyze.split(" ")) {
            sumWordLength += word.length();
        }
        return (sumWordLength*1.0 / this.findWordCount(toAnalyze));
    }

    public double[] averageWordLengthInPeriod() {
        String[] periods = this.textToAnalyze.split("[.!?:]");
        double[] averageWordLengths = new double[periods.length];
        int i = 0;
        for (String period: periods) {
            averageWordLengths[i] = this.averageWordLength(period);
            i++;
        }
        return averageWordLengths;
    }

    public String replaceWord(String replace, String replaceWith) {
        return this.textToAnalyze.replace(replace, replaceWith);
    }
}

public class TextProcessingClient {
    public static void main(String[] args) {
        String textToAnalyze = ("æ ø å When you are courting a nice girl an hour seems like a second." +
                "When you sit on a red-hot cinder a second seems like an hour. That's relativity. -Albert Einstein");
        TextProcessing tp = new TextProcessing(textToAnalyze);
        double[] averageWordLengths = tp.averageWordLengthInPeriod();

        System.out.println(tp.findWordCount());
        System.out.println(tp.averageWordLength());
        System.out.println("Total periods: " + averageWordLengths.length);

        for (double count: averageWordLengths) {
            System.out.println(count);
        }

        System.out.println(tp.replaceWord("you", "I"));
        System.out.println(tp.getTextToAnalyze());
        System.out.println(tp.getTextToAnalyzeUppercase());
    }
}

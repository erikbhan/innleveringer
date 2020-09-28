public class NewString {
    String string;

    public NewString(String string) {
        this.string = string;
    }

    public String abbreviate() {
        String[] words = this.string.split(" ");
        String output = "";
        for (String word: words) {
            output += word.charAt(0);
        }
        return output;
    }

    public String removeSymbol(String toRemove) {
        String output = "";
        for (int i = 0; i < this.string.length(); i++) {
            String c = String.valueOf(this.string.charAt(i));
            if (c.equals(toRemove)) {
                continue;
            }
            output += c;
        }
        return output;
    }
}

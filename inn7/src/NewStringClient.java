public class NewStringClient {
    public static void main(String[] args) {
        NewString test = new NewString("Hello world, how are you today?");
        System.out.println(test.abbreviate());
        System.out.println(test.removeSymbol("e"));
    }
}

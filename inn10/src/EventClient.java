import java.util.Scanner;

public class EventClient {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        EventRegister eventRegister = new EventRegister(scanner);
        EventUI ui = new EventUI(eventRegister, scanner);
        ui.start();
        scanner.close();
    }
}

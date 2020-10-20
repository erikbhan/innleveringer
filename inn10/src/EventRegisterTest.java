import java.util.ArrayList;
import java.util.Scanner;

public class EventRegisterTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        EventRegister er = new EventRegister(scanner);

        er.addNewEvent("Hello", "World", "Me", "Coding", 202012312030L);
        er.addNewEvent("Hello", "World", "Me", "Coding", 202012302030L);
        er.addNewEvent("Hello", "World", "Me", "Coding", 202012292030L);
        er.addNewEvent("Hello", "World", "Me", "Coding", 202012282030L);
        er.addNewEvent("Hello", "World", "Me", "Coding", 202012312030L);
        er.addNewEvent("Hello", "World", "Me", "Coding", 202012312030L);

        System.out.println(er.getEvents().size());
        //System.out.println(er);
        for (Event event: er.findEventsGivenDate(202012312030L)) {
            System.out.println(event);
        }

        //System.out.println(er);
    }
}

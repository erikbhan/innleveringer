import java.util.Scanner;

public class EventRegisterTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        EventRegister er = new EventRegister(scanner);

        er.addNewEvent("Hello", "World", "Me", "Coding", 20201231, 2030);
        er.addNewEvent("Hello", "World", "Me", "Coding", 20201230, 2030);
        er.addNewEvent("Hello", "World", "Me", "Coding", 20201229, 2030);
        er.addNewEvent("Hello", "World", "Me", "Coding", 20201228, 2030);
        er.addNewEvent("Hello", "World", "Me", "Coding", 20201231, 2030);
        er.addNewEvent("Hello", "World", "Me", "Coding", 20201231, 2030);

        System.out.println(er.getEvents().size());
        //System.out.println(er);
        for (Event event: er.findEventsGivenDate(20201231)) {
            System.out.println(event);
        }
    }
}

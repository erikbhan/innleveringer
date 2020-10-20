import java.util.ArrayList;
import java.util.Scanner;

public class EventUI {
    private EventRegister eventRegister;
    private Scanner scanner;

    public EventUI(EventRegister eventRegister, Scanner scanner) {
        this.eventRegister = eventRegister;
        this.scanner = scanner;
    }

    public void start() {
        while (true) {
            printAvailableCommands();
            int command = scanner.nextInt();
            if (command == 0) {
                System.out.println("Exiting...");
                break;
            }
            processCommand(command);
        }
        scanner.close();
    }

    public void printAvailableCommands() {
        System.out.println("\n-- COMMANDS --");
        System.out.println("0: Exit");
        System.out.println("1: Add new event");
        System.out.println("2: Find all events at a given location");
        System.out.println("3: Find all events on a given date");
        System.out.println("4: Find all events within a time interval");
        System.out.println("5: List all events sorted by location, type or time");
    }

    public void processCommand(int command) {
        switch (command) {
            case 1:
                System.out.println("Adding new event...");
                this.eventRegister.addNewEvent();
                break;
            case 2:
                System.out.print("Location: ");
                printEvents(this.eventRegister.findEventsGivenLocation(scanner.next()));
                break;
            case 3:
                System.out.print("Date: ");
                printEvents(this.eventRegister.findEventsGivenDate(scanner.nextLong()));
                break;
            case 4:
                System.out.print("Date from: ");
                long dateFrom = scanner.nextLong();

                System.out.print("\nDate to: ");
                long dateTo = scanner.nextLong();

                printEvents(this.eventRegister.findEventsGivenTimeInterval(dateFrom, dateTo));
                break;
            case 5:
                System.out.print("Sort by... (location, type, time): ");
                printEvents(this.eventRegister.listAllEventSortedByUserChoice(scanner.next()));
                break;
            default:
                System.out.println("Invalid command, try again.");
                break;
        }
    }

    public void printEvents(ArrayList<Event> listOfEvents) {
        for (Event event: listOfEvents) {
            System.out.println(event);
        }
    }
}

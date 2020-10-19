import java.util.Scanner;

public class EventClient {
    public static void main(String[] args) {
        EventRegister er = new EventRegister();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Available commands:");
            System.out.println(" 0: Exit");
            System.out.println(" 1: Add new event");
            System.out.println(" 2: Find events at a location");
            System.out.println(" 3: Find events on a date");
            System.out.println(" 4: Find events in a time interval (sorted by time)");
            System.out.println(" 5: List all events (sorted by user choice)");
            int command = scanner.nextInt();
            if (command == 0) {
                break;
            }
            switch (command) {
                case 1:
                    System.out.println("Please enter event information:");
                    System.out.print("Name: ");
                    String name = scanner.next();
                    System.out.print("Location: ");
                    String location = scanner.next();
                    System.out.print("Organizer: ");
                    String organizer = scanner.next();
                    System.out.print("Type of event: ");
                    String type = scanner.next();
                    System.out.print("Time and date (YYYYMMDDHHMM): ");
                    int timeAndDate = scanner.nextInt();
                    er.addNewEvent(name, location, organizer, type, timeAndDate);
                    break;
                case 2:
                    System.out.println("Enter location to search for:");
                    System.out.print("Location: ");
                    String locationToSearchFor = scanner.next();
                    System.out.print(er.findEventsAtLocation(locationToSearchFor));
                    break;
                case 3:
                    System.out.println("Enter date to search for (YYYYMMDD):");
                    System.out.print("Date: ");
                    int dateToSearchFor = scanner.nextInt();
                    System.out.print(er.findEventsOnDate(dateToSearchFor));
                    break;
                case 4:
                    break;
                case 5:
                    break;
                default:
                    break;
            }
        }
        scanner.close();
    }
}

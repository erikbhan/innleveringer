import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class EventRegister {
    private ArrayList<Event> events;
    private final Scanner scanner;

    public EventRegister(Scanner scanner) {
        this.events = new ArrayList<>();
        this.scanner = scanner;
    }

    public ArrayList<Event> getEvents() {
        return events;
    }

    private boolean checkIfEventNrExists(int eventNr) { //returns true if eventNr exists already
        for (Event event : this.events) {
            if (event.getEventNr() == eventNr) {
                return true;
            }
        }
        return false;
    }

    public void addNewEvent() {
        System.out.print("Event name: ");
        String eventName = scanner.useDelimiter("\n").next();

        System.out.print("Event location: ");
        String eventLocation = scanner.useDelimiter("\n").next();

        System.out.print("Event organizer: ");
        String eventOrganizer = scanner.useDelimiter("\n").next();

        System.out.print("Event type: ");
        String eventType = scanner.useDelimiter("\n").next();

        System.out.print("Date/time (YYYYMMDDHHMM): ");
        long eventDateAndTime = scanner.nextLong();
        System.out.println();

        int eventNr = 1;
        while (checkIfEventNrExists(eventNr)) { //Forsikre at eventNr er entydig
            eventNr++;
        }
        this.events.add(new Event(eventNr, eventName, eventLocation, eventOrganizer, eventType, eventDateAndTime));
    }

    public ArrayList<Event> findEventsGivenLocation(String location) {
        ArrayList<Event> eventsGivenLocation = new ArrayList<>();
        for (Event event : this.events) {
            if (event.getEventLocation().equals(location)) {
                eventsGivenLocation.add(event);
            }
        }
        return eventsGivenLocation;
    }

    public ArrayList<Event> findEventsGivenDate(long date) {
        ArrayList<Event> eventsGivenDate = new ArrayList<>();
        for (Event event : this.events) {
            if (event.getEventDateAndTime() == date) {
                eventsGivenDate.add(event);
            }
        }
        return eventsGivenDate;
    }

    public ArrayList<Event> findEventsGivenTimeInterval(long dateFrom, long dateTo) { //Sorted by time
        ArrayList<Event> eventsGivenInterval = new ArrayList<>();
        for (Event event : this.events) {
            if (event.getEventDateAndTime() >= dateFrom &&
                    event.getEventDateAndTime() <= dateTo) {
                eventsGivenInterval.add(event);
            }
        }
        Collections.sort(eventsGivenInterval);
        return eventsGivenInterval;
    }

    public ArrayList<Event> listAllEventSortedByUserChoice(String sortBy) {
        ArrayList<Event> allEventsSorted = new ArrayList<>();
        for (Event event : this.events) {
            allEventsSorted.add(event);
        }

        Comparator<Event> sortByLocation = new Comparator<>() {
            @Override
            public int compare(Event o1, Event o2) {
                return o1.getEventLocation().compareTo(o2.getEventLocation());
            }
        };

        Comparator<Event> sortByType = new Comparator<>() {
            @Override
            public int compare(Event o1, Event o2) {
                return o1.getEventType().compareTo(o2.getEventType());
            }
        };

        switch (sortBy) {
            case "location" -> Collections.sort(allEventsSorted, sortByLocation);
            case "type" -> Collections.sort(allEventsSorted, sortByType);
            case "time" -> Collections.sort(allEventsSorted);
            default -> {
                System.out.println("Invalid sort, returning default (sorted by time)");
                Collections.sort(allEventsSorted);
            }
        }
        return allEventsSorted;
    }

    @Override
    public String toString() {
        String returnString = "";
        for (Event event : events) {
            returnString += event + "\n";
        }
        return returnString;
    }
}

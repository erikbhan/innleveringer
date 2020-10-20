import java.util.ArrayList;
import java.util.Collections;
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
        for (Event event: this.events) {
            if (event.getEventNr() == eventNr) {
                return true;
            }
        }
        return false;
    }

    public void addNewEvent(String eventName, String eventLocation, String eventOrganizer, String eventType, long eventDateAndTime) {
        int eventNr = 1;
        while (checkIfEventNrExists(eventNr)) { //Forsikre at eventNr er entydig
            eventNr++;
        }
        this.events.add(new Event(eventNr, eventName, eventLocation, eventOrganizer, eventType, eventDateAndTime));
    }

    public ArrayList<Event> findEventsGivenLocation(String location) {
        ArrayList<Event> eventsGivenLocation = new ArrayList<>();
        for (Event event: this.events) {
            if (event.getEventLocation().equals(location)) {
                eventsGivenLocation.add(event);
            }
        }
        return eventsGivenLocation;
    }

    public ArrayList<Event> findEventsGivenDate(long date) {
        ArrayList<Event> eventsGivenDate = new ArrayList<>();
        for (Event event: this.events) {
            if (event.getEventDateAndTime() == date) {
                eventsGivenDate.add(event);
            }
        }
        return eventsGivenDate;
    }

    public void findEventsGivenTimeInterval(long dateFrom, long dateTo) { //Sorted by time
        ArrayList<Event> eventsGivenInterval = new ArrayList<>();
        for (Event event: this.events) {
            if (event.getEventDateAndTime() >= dateFrom && event.getEventDateAndTime() <= dateTo) {
                eventsGivenInterval.add(event);
            }
        }

        Collections.sort(eventsGivenInterval);
    }

    public void listAllEventsSortedByLocation() {

    }

    public void listAllEventsSortedByType() {

    }

    public void listAllEventsSortedByDateAndTime() {

    }

    @Override
    public String toString() {
        String s = "";
        for (Event event: events) {
            s += event + "\n";
        }
        return s;
    }
}

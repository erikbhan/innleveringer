import java.util.ArrayList;

public class EventRegister {
    private final ArrayList<Event> events;

    public EventRegister() {
        this.events = new ArrayList<>();
    }

    public void addNewEvent(String name, String location, String organizer, String type, int timeAndDate) {
        int nr = this.events.get(this.events.size()).getNr() + 1;
        Event event = new Event(nr, name, location, organizer, type, timeAndDate);
        this.events.add(event);
        System.out.println("Added new event successfully.");
    }

    public ArrayList<Event> findEventsAtLocation(String location) {
        ArrayList<Event> eventsAtLocation = new ArrayList<>();
        for (Event event: this.events) {
            if (event.getLocation().equals(location)) {
                eventsAtLocation.add(event);
            }
        }
        return eventsAtLocation;
    }

    public ArrayList<Event> findEventsOnDate(int date) {
        date *= 10000; //Ex.: Sets "20021017" to "200210170000"
        ArrayList<Event> eventsOnDate = new ArrayList<>();
        for (Event event: this.events) {
            if (event.getTimeAndDate() >= date && event.getTimeAndDate() <= date + 2359) {
                eventsOnDate.add(event);
            }
        }
        eventsOnDate.sort();
        return eventsOnDate;
    }

    public ArrayList<Event> findEventsWithingTimeInterval(int dateAndTimeFrom, int dateAndTimeTo) {
        ArrayList<Event> eventsInInterval = new ArrayList<>();
        for (Event event: this.events) {
            if (dateAndTimeFrom <= event.getTimeAndDate() && event.getTimeAndDate() <= dateAndTimeTo) {
                eventsInInterval.add(event);
            }
        }
        return eventsInInterval;
    }
}

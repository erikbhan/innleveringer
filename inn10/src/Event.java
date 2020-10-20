public class Event {
    private final int eventNr; //Entydig
    private final String eventName;
    private final String eventLocation;
    private final String eventOrganizer;
    private final String eventType;
    private final EventDateTime eventDateAndTime; //YYYYMMDDHHMM

    public Event(int eventNr, String eventName, String eventLocation, String eventOrganizer, String eventType, int eventDate, int eventTime) {
        this.eventNr = eventNr;
        this.eventName = eventName;
        this.eventLocation = eventLocation;
        this.eventOrganizer = eventOrganizer;
        this.eventType = eventType;
        this.eventDateAndTime = new EventDateTime(eventDate, eventTime);
    }

    public int getEventNr() {
        return eventNr;
    }

    public String getEventName() {
        return eventName;
    }

    public String getEventLocation() {
        return eventLocation;
    }

    public String getEventOrganizer() {
        return eventOrganizer;
    }

    public String getEventType() {
        return eventType;
    }

    public EventDateTime getEventDateAndTime() {
        return eventDateAndTime;
    }

    @Override
    public String toString() {
        return "Event #" + eventNr + ":\t'" + eventName + "'\n " +
                "Location.:\t" + eventLocation + "\n " +
                "Organizer:\t" + eventOrganizer + "\n " +
                "Type.....:\t" + eventType + "\n " +
                "Date/time:\t" + eventDateAndTime;
    }
}

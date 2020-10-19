public class Event {
    private final int nr;
    private final String name;
    private final String location;
    private final String organizer;
    private final String type;
    private final int timeAndDate;

    public Event(int nr, String name, String location, String organizer, String type, int timeAndDate) {
        this.name = name;
        this.nr = nr;
        this.location = location;
        this.organizer = organizer;
        this.type = type;
        this.timeAndDate = timeAndDate;
    }

    public int getNr() {
        return nr;
    }

    public String getName() {
        return name;
    }

    public String getLocation() {
        return location;
    }

    public String getOrganizer() {
        return organizer;
    }

    public String getType() {
        return type;
    }

    public int getTimeAndDate() {
        return timeAndDate;
    }

    @Override
    public String toString() {
        return "Event{" +
                "nr=" + nr +
                ", name='" + name + '\'' +
                ", location='" + location + '\'' +
                ", organizer='" + organizer + '\'' +
                ", type='" + type + '\'' +
                ", timeAndDate=" + timeAndDate +
                '}';
    }
}

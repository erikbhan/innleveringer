public class EventDateTime {
    private int date;
    private int time;

    public EventDateTime(int date, int time) {
        this.date = date;
        this.time = time;
    }

    public int getDate() {
        return date;
    }

    public int getTime() {
        return time;
    }

    public int compareTo(EventDateTime eventDateTime) { //Returns difference in time between events in minutes
        return (eventDateTime.getDate() - this.date)*24*60 + (eventDateTime.getTime() - this.time);
    }

    public String toString() {
        return String.valueOf(date) + time;
    }
}

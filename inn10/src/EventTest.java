public class EventTest {
    public static void main(String[] args) {
        Event event = new Event(3, "Painting", "At home", "Me", "Contest", 20201031, 2359);
        System.out.println(event);
        Event event2 = new Event(4, "Painting", "At home", "Me", "Contest", 20201030, 2359);
        System.out.println(event2);
        System.out.println(event2.getEventDateAndTime().compareTo(event.getEventDateAndTime()));
    }
}

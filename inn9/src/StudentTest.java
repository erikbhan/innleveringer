public class StudentTest {
    public static void main(String[] args) {
        Student karl = new Student("Karl");
        Student torgeir = new Student("Torgeir", 4);

        System.out.println(karl);
        System.out.println(torgeir);

        System.out.println(karl.getName() + ", tasks: " + karl.getTaskCount());

        karl.increaseTaskCount(2);
        torgeir.increaseTaskCount(2);

        System.out.println(karl);
        System.out.println(torgeir);
    }
}

public class TaskOverviewClient {
    public static void main(String[] args) {
        TaskOverview to = new TaskOverview();

        to.registerNewStudent(new Student("Karl"));
        to.registerNewStudent(new Student("Torgeir", 10));

        System.out.println(to.findStudentTaskCount("Torgeir") + " tasks completed by Torgeir.");
        System.out.println(to.getStudentCount() + " students.");

        to.increaseTaskCount("Karl", 5);
        System.out.println(to);
    }
}

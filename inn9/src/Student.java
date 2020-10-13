public class Student {
    private String name;
    private int taskCount;

    public Student(String name, int taskCount) {
        this.name = name;
        this.taskCount = taskCount;
    }

    public Student(String name) {
        this.name = name;
        this.taskCount = 0;
    }

    public String getName() {
        return this.name;
    }

    public int getTaskCount() {
        return this.taskCount;
    }

    public void increaseTaskCount(int increment) {
        this.taskCount += increment;
    }

    @Override
    public String toString() {
        return this.name + ", tasks completed: " + this.taskCount;
    }
}

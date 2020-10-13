public class TaskOverview {
    private Student[] students;
    private int studentCount;

    public TaskOverview() {
        this.students = new Student[0];
        this.studentCount = 0;
    }

    public int getStudentCount() {
        return this.studentCount;
    }

    public int findStudentTaskCount(String name) {
        for (Student student: this.students) {
            if (student.getName().equals(name)) {
                return student.getTaskCount();
            }
        }
        return -1; //Couldn't find student
    }

    public void registerNewStudent(Student studentToAdd) {
        Student[] temp = new Student[this.students.length];

        for (int i = 0; i < this.students.length; i++) {
            temp[i] = this.students[i];
        }

        this.students = new Student[this.students.length + 1];

        for (int i = 0; i < temp.length; i++) {
            this.students[i] = temp[i];
        }
        this.students[this.students.length - 1] = studentToAdd;
        this.studentCount++;
    }

    public void increaseTaskCount(String name, int increment) {
        for (Student student: this.students) {
            if (student.getName().equals(name)) {
                student.increaseTaskCount(increment);
            }
        }
    }

    @Override
    public String toString() {
        String out = "";
        for (Student student: this.students) {
            out += student.getName() + ", tasks completed: " + student.getTaskCount() + "\n";
        }
        return out;
    }
}

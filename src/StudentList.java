import java.util.ArrayList;

public class StudentList {
    ListDataRandom listDataRandom = new ListDataRandom();
    ArrayList<Student> students = new ArrayList<>();
    Operation operation = new Operation();
    public ArrayList<Student> getStudents() {
        return students;
    }

    public void setStudents(ArrayList<Student> students) {
        this.students = students;
    }
}

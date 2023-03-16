import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ListDataRandom listDataRandom = new ListDataRandom();
        ArrayList<Student> students = new ArrayList<>();
        Operation operation = new Operation();
        Writer writer = new Writer();
        while (listDataRandom.getI() < 20) {
            students.add(listDataRandom.getI(), new Student(listDataRandom.getI(), listDataRandom.getRandomString(listDataRandom.listFirstName), listDataRandom.getRandomString(listDataRandom.listLastName), listDataRandom.getRandomPhone(), listDataRandom.getRandomInt(listDataRandom.listGroup)));
            listDataRandom.setI(listDataRandom.getI()+1);
        }

        students.add(operation.addRandomStudent());
        System.out.println(students);
        writer.writerInFile(students.toString().replace("[","").replace("]",""));

    }
}
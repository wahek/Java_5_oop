import java.util.List;

public class Operation {
    ListDataRandom listDataRandom = new ListDataRandom();
//    while (listDataRandom.getI() < 20) {
//        students.add(listDataRandom.getI(), new Student(listDataRandom.getI(), listDataRandom.getRandomString(listDataRandom.listFirstName), listDataRandom.getRandomString(listDataRandom.listLastName), listDataRandom.getRandomPhone(), listDataRandom.getRandomInt(listDataRandom.listGroup)));
//        listDataRandom.setI(listDataRandom.getI()+1);
//    }
    public Student addRandomStudent(){

        return new Student(listDataRandom.getI(), listDataRandom.getRandomString(listDataRandom.listFirstName),
                listDataRandom.getRandomString(listDataRandom.listLastName), listDataRandom.getRandomPhone(),
                listDataRandom.getRandomInt(listDataRandom.listGroup));
    }
    public Student searchStudent(List<Student> list, int id){
        for (Student st: list){
            try {
                if (id == st.getId()){
                    return st;
                }
            }catch (Exception e){
                System.out.println("Ничего не найдено");
            }
        }
        return null;
    }
}

public class Student {
    private final int id;
    private String firstName;
    private String lastName;
    private String phone;
    private int group;
    ListDataRandom listDataRandom;

    public Student(int id, String firstName, String lastName, String phone, int group) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phone = phone;
        this.group = group;
    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPhone() {
        return phone;
    }

    public int getGrope() {
        return group;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setGroup(int group) {
        this.group = group;
    }


    @Override
    public String toString() {
        return ("\nid:"+id +" ("+ firstName +" "+ lastName +") "+ phone +" группа:"+ group);
    }
}

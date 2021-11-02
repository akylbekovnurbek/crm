package model;

import java.time.LocalDate;

public class Student extends Person {

    private Group group;

    public Student(long id, String firstName, String lastName, String email, String phoneNumber, LocalDate dob, Group group) {
        super(id, firstName, lastName, email, phoneNumber, dob);
        this.group = group;
    }

    public Group getGroup() {
        return group;
    }

    public void setGroup(Group group) {
        this.group = group;
    }

    @Override
    public String toString() {
        return "model.Student{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", dob=" + dob +
                '}';
    }
}

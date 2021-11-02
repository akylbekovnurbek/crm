package model;

import java.time.LocalDate;

public class Mentor extends Person {
    private long id;
    private String firstName; // John // John
    private String lastName; // Doe // Doe
    private String email;
    private String phoneNumber;
    private LocalDate dob;
    private double salary;

    public Mentor(long id, String firstName, String lastName, String email, String phoneNumber, LocalDate dob, double salary) {
        super(id,firstName,lastName, email, phoneNumber, dob);
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String toString() {
        return "model.Mentor{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", dob=" + dob +
                ", salary=" + salary +
                '}';
    }
}

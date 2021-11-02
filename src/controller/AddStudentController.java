package controller;

import javafx.fxml.FXML;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;
import model.Student;
import service.StudentService;

import java.time.LocalDate;

public class AddStudentController {

    @FXML
    private TextField firstNameTextField;

    @FXML
    private TextField lastNameTextField;

    @FXML
    private TextField emailTextField;

    @FXML
    private TextField phoneNumberTextField;

    @FXML
    private TextField groupTextField;

    @FXML
    private DatePicker dob;

    private StudentService studentService;

    public AddStudentController() {
        studentService = new StudentService();
    }

    @FXML
    private void onMouseClicked() {
        Student student = new Student();
        student.setFirstName(getFirstName());
        student.setLastName(getLastName());
        student.setEmail(getEmail());
        student.setPhoneNumber(getPhoneNumber());
        student.setGroup(getGroup());
        student.setDob(getDob());

        studentService.create(student);
    }

    private String getFirstName() {
        return firstNameTextField.getText();
    }

    private String getLastName() {
        return lastNameTextField.getText();
    }

    private String getPhoneNumber() {
        return phoneNumberTextField.getText();
    }

    private String getEmail() {
        return emailTextField.getText();
    }

    private double getGroup() {
        return Double.parseDouble(groupTextField.getText());
    }

    private LocalDate getDob() {
        return dob.getValue();
    }

}
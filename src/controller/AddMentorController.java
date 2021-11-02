package controller;

import javafx.fxml.FXML;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;
import model.Mentor;
import service.MentorService;

import java.time.LocalDate;

public class AddMentorController {

    @FXML
    private TextField firstNameTextField;

    @FXML
    private TextField lastNameTextField;

    @FXML
    private TextField emailTextField;

    @FXML
    private TextField phoneNumberTextField;

    @FXML
    private TextField salaryTextField;

    @FXML
    private DatePicker dob;

    private MentorService mentorService;

    public AddMentorController() {
        mentorService = new MentorService();
    }

    @FXML
    private void onMouseClicked() {
        Mentor mentor = new Mentor();
        mentor.setFirstName(getFirstName());
        mentor.setLastName(getLastName());
        mentor.setEmail(getEmail());
        mentor.setPhoneNumber(getPhoneNumber());
        mentor.setSalary(getSalary());
        mentor.setDob(getDob());

        mentorService.create(mentor);
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

    private double getSalary() {
        return Double.parseDouble(salaryTextField.getText());
    }

    private LocalDate getDob() {
        return dob.getValue();
    }

}
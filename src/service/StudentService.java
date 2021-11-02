package service;

import java.time.LocalDate;
import java.util.Scanner;
import java.time.format.DateTimeFormatter;

import dao.StudentDao;
import model.Student;

public class StudentService {

    private Scanner scan;
    private StudentDao studentDao;
    private DateTimeFormatter dateTimeFormatter;

    private static long idCounter;

    static {
        idCounter = StudentDao.getCurrentId();
    }

    public StudentService() {
        scan = new Scanner(System.in);
        studentDao = new StudentDao();
    }

    public void create(Student student) {
        student.setId(idCounter);
        studentDao.save(student);

        studentDao.save(student);
    }
}

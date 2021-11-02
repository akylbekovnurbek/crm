package service;

import java.util.Scanner;

import dao.CourseDao;
import model.Course;

public class CourseService {

    private static long idCounter;

    static {
        idCounter = CourseDao.getCurrentId();
    }

    private Scanner scan;
    private CourseDao courseDao;


    public CourseService() {
        scan = new Scanner(System.in);
        courseDao = new CourseDao();
    }

    public void create() {
        System.out.println("Creating course.");
        Course course = new Course();

        course.setId(idCounter);

        System.out.print("CourseName: ");
        course.setCourseName(scan.nextLine());

        System.out.print("MonthlyCost: ");
        course.setMonthlyCost(scan.nextDouble());

        scan.nextLine();

        System.out.print("CourseType: ");
        course.setCourseType(scan.nextLine());

        System.out.print("ClassesPerMonth: ");
        course.setClassesPerMonth(scan.nextInt());

        scan.nextLine();

        System.out.print("DurationInMonth: ");
        course.setDurationInMonth(scan.nextInt());

        System.out.print("DurationOfOneLesson ");
        course.setDurationOfOneLesson(scan.nextInt());

        courseDao.save(course);
        idCounter++;
    }
}

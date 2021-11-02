package controller;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import dao.GroupDao;
import model.Group;
import model.Mentor;

public class GroupController {

    private static long idCounter;

    static {
        idCounter = GroupDao.getCurrentId();
    }

    private Scanner scan;
    private GroupDao groupDao;
    private DateTimeFormatter dateTimeFormatter;

    public GroupController() {
        scan = new Scanner(System.in);
        groupDao = new GroupDao();
        dateTimeFormatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");

    }

    public void create() {
        System.out.println("Creating mentor.");
        Group group = new Group();

        group.setId(idCounter);

        System.out.print("GroupName: ");
        group.setGroupName(scan.nextLine());

       // System.out.print("Course: ");
       // group.setCourse(scan.nextLine());

      //  System.out.print("Mentor: ");
      //  Mentor mentor = new Mentor();
       // group.setMentor(mentor);

        //System.out.print("Students ");
       // group.setStudents(scan.nextLine());

        scan.nextLine();

       // System.out.print("ClassTime ");
       // group.setClassTime(LocalDateTime.);

        groupDao.save(group);
        idCounter++;
    }
}
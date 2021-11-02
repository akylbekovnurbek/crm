package service;

import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import dao.MentorDao;
import model.Mentor;

public class MentorService {

    private static long idCounter;

    static {
        idCounter = MentorDao.getCurrentId();
    }

    private Scanner scan;
    private MentorDao mentorDao;
    private DateTimeFormatter dateTimeFormatter;

    public MentorService() {
        scan = new Scanner(System.in);
        mentorDao = new MentorDao();
        dateTimeFormatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
    }

    public void create(Mentor mentor) {
        mentor.setId(idCounter);
        mentorDao.save(mentor);
        idCounter++;
    }
}
package dao;

import model.Mentor;

import java.io.*;
import java.util.Scanner;

public class MentorDao {

    private static File file;

    private static final String PATH_TO_FOLDER;
    private static final String PATH_TO_FILE;

    static {
        PATH_TO_FOLDER = "C:\\Users\\Ади\\Desktop\\crm_system\\";
        PATH_TO_FILE = PATH_TO_FOLDER + "mentor.txt";

        File folder = new File(PATH_TO_FOLDER);
        if (!folder.exists()) {
            folder.mkdirs();
        }

        file = new File(PATH_TO_FILE);
        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException e) {
                System.out.println("Check your path to file");
            }
        }
    }

    public MentorDao() {

    }

    public void save(Mentor mentor) {
        try {
            PrintWriter output = new PrintWriter(new FileWriter(PATH_TO_FILE, true));
            output.println("id: " + mentor.getId());
            output.println("first_name: " + mentor.getFirstName());
            output.println("last_name: " + mentor.getLastName());
            output.println("email: " + mentor.getEmail());
            output.println("phone_number: " + mentor.getPhoneNumber());
            output.println("salary: " + mentor.getSalary());
            output.println("dob: " + mentor.getDob());

            output.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static long getCurrentId() {
        long lastId = 0L;
        try {
            Scanner scan = new Scanner(file);
            while (scan.hasNextLine()) {
                String line = scan.nextLine();
                if (line.contains("id")) {
                    lastId = Integer.parseInt(line.replaceAll("[^0-9]", "")); // "135"
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return ++lastId;
    }
}

package dao;

import model.Student;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class StudentDao {
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


    public void save(Student student) {
        try {
            PrintWriter output = new PrintWriter(PATH_TO_FILE);
            output.println(student.getId());
            output.println(student.getFirstName());
            output.println(student.getLastName());
            output.println(student.getEmail());
            output.println(student.getPhoneNumber());
            output.println(student.getDob());

            output.close();

        } catch (FileNotFoundException e) {
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

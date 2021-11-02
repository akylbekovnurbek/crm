package dao;

import model.Group;

import java.io.*;
import java.util.Scanner;

public class GroupDao {

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

    public GroupDao() {

    }

    public void save(Group group) {
        try {
            PrintWriter output = new PrintWriter(new FileWriter(PATH_TO_FILE, true));
            output.println("id: " + group.getId());
            output.println("group_name: " + group.getGroupName());
            output.println("course: " + group.getCourse());
            output.println("mentor: " + group.getMentor());
            output.println("students: " + group.getStudents());
            output.println("salary: " + group.getClassTime());

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
package controller;

import java.time.DateTimeException;

public class DateParser {

    private String date;

    private int day;
    private int month;
    private int year;

    public DateParser(String date) {
        if (!date.matches("[\\.0-9]+")) {
            throw new DateTimeException("For input: " + date + ". Sample date format dd.MM.yyyy");
        }
        this.date = date;
        parse();
    }

    private void parse() {
        String[] parts = date.split("\\.");// 12.12.2020 -> {"12", "12", "2020"}
        day = Integer.parseInt(parts[0]);
        month = Integer.parseInt(parts[1]);
        year = Integer.parseInt(parts[2]);
    }

    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }
}

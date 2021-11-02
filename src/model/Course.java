package model;

public class Course {

    private long id;
    private String courseName;
    private double monthlyCost;
    private int classesPerMonth;
    private int durationInMonth;
    private int durationOfOneLesson;
    private String courseType;

    public Course() {
    }

    public Course(long id, String courseName, double monthlyCost, int classesPerMonth, int durationInMonth, int durationOfOneLesson, String courseType) {
        this.id = id;
        this.courseName = courseName;
        this.monthlyCost = monthlyCost;
        this.classesPerMonth = classesPerMonth;
        this.durationInMonth = durationInMonth;
        this.durationOfOneLesson = durationOfOneLesson;
        this.courseType = courseType;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public double getMonthlyCost() {
        return monthlyCost;
    }

    public void setMonthlyCost(double monthlyCost) {
        this.monthlyCost = monthlyCost;
    }

    public int getClassesPerMonth() {
        return classesPerMonth;
    }

    public void setClassesPerMonth(int classesPerMonth) {
        this.classesPerMonth = classesPerMonth;
    }

    public int getDurationInMonth() {
        return durationInMonth;
    }

    public void setDurationInMonth(int durationInMonth) {
        this.durationInMonth = durationInMonth;
    }

    public int getDurationOfOneLesson() {
        return durationOfOneLesson;
    }

    public void setDurationOfOneLesson(int durationOfOneLesson) {
        this.durationOfOneLesson = durationOfOneLesson;
    }

    public String getCourseType() {
        return courseType;
    }

    public void setCourseType(String courseType) {
        this.courseType = courseType;
    }

    public String toString() {
        return "model.Course{" +
                "id=" + id +
                ", courseName='" + courseName + '\'' +
                ", monthlyCost=" + monthlyCost +
                ", classesPerMonth=" + classesPerMonth +
                ", durationInMonth=" + durationInMonth +
                ", durationOfOneLesson=" + durationOfOneLesson +
                ", courseType='" + courseType + '\'' +
                '}';
    }
}

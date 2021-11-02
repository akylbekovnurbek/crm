package model;

import java.util.Arrays;
import java.time.LocalDateTime;

public class Group {

    private long id;
    private String groupName;
    private Course course;
    private Mentor mentor;
    private Student[] students;
    private LocalDateTime classTime;

    public Group() {
    }

    public Group(long id, String groupName, Course course, Mentor mentor, Student[] students, LocalDateTime classTime) {
        this.id = id;
        this.groupName = groupName;
        this.course = course;
        this.mentor = mentor;
        this.students = students;
        this.classTime = classTime;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public Mentor getMentor() {
        return mentor;
    }

    public void setMentor(Mentor mentor) {
        this.mentor = mentor;
    }

    public Student[] getStudents() {
        return students;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }

    public LocalDateTime getClassTime() {
        return classTime;
    }

    public void setClassTime(LocalDateTime classTime) {
        this.classTime = classTime;
    }

    public String toString() {
        return "model.Group{" +
                "id=" + id +
                ", groupName='" + groupName + '\'' +
                ", course=" + course +
                ", mentor=" + mentor +
                ", students=" + Arrays.toString(students) +
                ", classTime=" + classTime +
                '}';
    }
}

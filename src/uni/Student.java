package uni;

import base.Person;
import java.util.ArrayList;

public class Student {
    public int id;
    public int personID;
    public final int entranceYear;
    public int majorID;
    public String studentID;

    public static ArrayList<Student> studentList = new ArrayList<>();

    public Student(int personID, int entranceYear, int majorID) {
        this.id = studentList.size() + 1;
        this.personID = personID;
        this.entranceYear = entranceYear;
        this.majorID = majorID;
        setStudentCode();
        studentList.add(this);

        Major major = Major.findById(majorID);
        if (major != null) {
            major.addStudent();
        }
    }

    private void setStudentCode() {
        Major major = Major.findById(majorID);
        if (major != null) {
            this.studentID = String.valueOf(entranceYear) + String.format("%02d", major.id) + String.format("%02d", major.numberOfStudents);
        }
    }

    public static Student findById(int id) {
        for (Student student : studentList) {
            if (student.id == id) {
                return student;
            }
        }
        return null;
    }
}

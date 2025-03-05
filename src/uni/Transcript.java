package uni;

import java.util.HashMap;

public class Transcript {
    public int studentID;
    public HashMap<Integer, Double> transcript;

    public Transcript(int studentID) {
        this.studentID = studentID;
        this.transcript = new HashMap<>();
    }

    public void setGrade(int presentedCourseID, double grade) {
        transcript.put(presentedCourseID, grade);
    }

    public void printTranscript() {
        System.out.println("Transcript for Student ID: " + studentID);
        for (Integer courseID : transcript.keySet()) {
            Course course = Course.findById(courseID);
            if (course != null) {
                System.out.println(course.title + ": " + transcript.get(courseID));
            }
        }
    }

    public double getGPA() {
        double totalPoints = 0;
        int totalUnits = 0;
        for (Integer courseID : transcript.keySet()) {
            Course course = Course.findById(courseID);
            if (course != null) {
                totalPoints += transcript.get(courseID) * course.units;
                totalUnits += course.units;
            }
        }
        return totalPoints / totalUnits;
    }
}

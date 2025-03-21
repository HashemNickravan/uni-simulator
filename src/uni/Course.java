package uni;

import java.util.ArrayList;

public class Course {
    public int id;
    public String title;
    public int units;

    public static ArrayList<Course> courseList = new ArrayList<>();

    public Course(String title, int units) {
        this.id = courseList.size() + 1;
        this.title = title;
        this.units = units;
        courseList.add(this);
    }

    public static Course findById(int id) {
        for (Course course : courseList) {
            if (course.id == id) {
                return course;
            }
        }
        return null;
    }
}

import base.*;
import uni.*;

public class Main {
    public static void main(String[] args) {
        base.Person person1 = new base.Person("Hashem", "40312051");
        base.Person person2 = new base.Person("Hooman", "40011111");
        base.Person person3 = new base.Person("Shahab", "40022222");
        base.Person person4 = new base.Person("Omid", "40112051");
        base.Person person5 = new base.Person("Amin", "40113001");

        uni.Major major1 = new uni.Major("Computer Engineering", 50);
        uni.Major major2 = new uni.Major("Computer Science", 30);

        uni.Student student1 = new uni.Student(3, 2026, 2);
        uni.Student student2 = new uni.Student(2, 2025, 1);
        uni.Student student3 = new uni.Student(3, 2024, 2);

        System.out.println("Student 1: " + student1.studentID);
        System.out.println("Student 2: " + student2.studentID);
        System.out.println("Student 3: " + student3.studentID);

        uni.Professor professor1 = new uni.Professor(2, 1);
        uni.Professor professor2 = new uni.Professor(3, 3);

        System.out.println("Professor 1 ID: " + professor1.id);
        System.out.println("Professor 2 ID: " + professor2.id);

        uni.Course course1 = new uni.Course("Advanced Programming", 3);
        uni.Course course2 = new uni.Course("Algorithms", 2);
        uni.Course course3 = new uni.Course("Logic property", 1);

        uni.PresentedCourse presentedCourse1 = new uni.PresentedCourse(1, 1, 30);
        uni.PresentedCourse presentedCourse2 = new uni.PresentedCourse(2, 1, 25);
        uni.PresentedCourse presentedCourse3 = new uni.PresentedCourse(3, 2, 20);

        presentedCourse1.addStudent(1);
        presentedCourse1.addStudent(2);
        presentedCourse2.addStudent(1);
        presentedCourse2.addStudent(2);
        presentedCourse3.addStudent(3);

        uni.Transcript transcript1 = new uni.Transcript(1);
        transcript1.setGrade(1, 18.5);
        transcript1.setGrade(2, 17.0);

        uni.Transcript transcript2 = new uni.Transcript(2);
        transcript2.setGrade(1, 19.0);
        transcript2.setGrade(2, 16.5);

        uni.Transcript transcript3 = new uni.Transcript(3);
        transcript3.setGrade(3, 20.0);

        transcript1.printTranscript();
        transcript2.printTranscript();
        transcript3.printTranscript();

        System.out.println("GPA for Student 1: " + transcript1.getGPA());
        System.out.println("GPA for Student 2: " + transcript2.getGPA());
        System.out.println("GPA for Student 3: " + transcript3.getGPA());
    }
}

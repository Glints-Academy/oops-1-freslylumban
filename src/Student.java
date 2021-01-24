import java.util.ArrayList;
import java.util.List;

public class Student extends Person {
    int numCourse = 0;
    List<String> courses = new ArrayList<>();
    List<Integer> grades = new ArrayList<>();

    public Student(String name, String address) {
        System.out.println("Input new Student!");
        this.name = name;
        this.address = address;
    }

    public String toString() {
        return "Student: " + name + "(" + address + ")";
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public void addCourseGrade(String course, int grade) {
        courses.add(course);
        grades.add(grade);
        numCourse = numCourse + 1;
        System.out.println("Input Grade Success!");
    }

    public void printGrades() {
        for (int i = 0; i < courses.size(); i++) {
            System.out.println("Student: " + name + "(" + address + "), " + "have course: " + courses.get(i) + ", grade: " + grades.get(i));
        }
    }

    public double getAverageGrade() {
        double sum = 0;
        double avg = 0;

        if (grades.size() == 0) {
            System.out.println("Student " + getName() + " not have grade!");
        } else {
            for (int i = 0; i < grades.size(); i++) {
                sum += grades.get(i);
            }
        }
        avg = sum / numCourse;
        return avg;
    }
}

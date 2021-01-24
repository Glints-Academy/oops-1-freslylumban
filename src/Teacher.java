import java.util.ArrayList;
import java.util.List;

public class Teacher extends Person {
    private boolean result;
    int numCourses = 0;
    List<String> courses = new ArrayList<>();

    public Teacher(String name, String address) {
        System.out.println("Input new Teacher!");
        this.name = name;
        this.address = address;
    }

    public String toString() {
        return "Teacher: " + name + "(" + address + ")";
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public boolean addCourse(String course) {
        boolean addcourse = true;

        if (courses.size() == 0) {
            courses.add(course);
        } else {
            for (int i = 0; i < courses.size(); i++) {
                if (courses.get(i) == course) {
                    addcourse = false;
                } else {
                    courses.add(course);
                }
            }
        }
        return addcourse;
    }

    public boolean removeCourse(String course) {
        boolean removecourse = false;

        for (int i = 0; i < courses.size(); i++) {
            if (course == courses.get(i)) {
                courses.remove(i);
                removecourse = true;
            } else {
                removecourse = false;
            }
        }

        return removecourse;
    }
}

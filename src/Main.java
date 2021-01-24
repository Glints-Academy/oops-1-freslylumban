public class Main {
    public static void main(String[] args) {
        // Test PERSON
        Person person = new Person("Adrian", "Batam");
        System.out.println(person);

        person.setAddress("Papua");
        System.out.println(person);
        person.setAddress("Jogja");
        System.out.println(person);

        System.out.println();
        System.out.println("--------------------------------------");

        // Test STUDENT
        Student std1 = new Student("Fresly", "Cikarang, Bekasi");
        System.out.println(std1);
        std1.addCourseGrade("Matematika", 3);
        std1.addCourseGrade("Kimia", 2);
        std1.printGrades();
        System.out.println("Average grade from " + std1.getName() + " is: " + std1.getAverageGrade());

        System.out.println();
        System.out.println("--------------------------------------");

        // Test TEACHER
        Teacher tch1 = new Teacher("Rachel", "Bekasi");
        System.out.println(tch1);
        System.out.println("1" + tch1.addCourse("Matematika"));
        System.out.println("2" + tch1.addCourse("Matematika"));
        System.out.println("3" + tch1.removeCourse("Matematika"));
        System.out.println("4" + tch1.removeCourse("Matematika"));
        System.out.println("5" + tch1.removeCourse("Matematika"));
        tch1.addCourse("Matematika");
    }
}

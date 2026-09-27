import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Book b1 = new Book("Clean Code", "Robert Martin", 2008);
        Book b2 = new Book("Design Patterns", "Erich Gamma", 1994);
        Book b3 = new Book("Java Basics", "Oracle", 2024);
        b1.showInformation(); b2.showInformation(); b3.showInformation();

        Teacher teacher = new Teacher("Ana Torres", "Programming");
        Course course = new Course("Object Oriented Programming", teacher);

        Student s1 = new Student("Carlos", "SIS001", 20);
        Student s2 = new Student("Ana", "SIS002", 21);
        Student s3 = new Student("Luis", "SIS003", 19);

        course.addStudent(s1); course.addStudent(s2); course.addStudent(s3);
        course.showInformation();
        course.showStudents();

        Car car = new Car("Toyota", "2.0 Turbo", 200);
        car.showInformation();

        List<Student> students = new ArrayList<>();
        students.add(s1); students.add(s2); students.add(s3);
        System.out.println("Total students: " + students.size());
        students.remove(1);
        System.out.println("After delete: " + students.size());

        s1.study();
    }
}

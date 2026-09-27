import java.util.ArrayList;
import java.util.List;

public class Course {
    private String name;
    private Teacher teacher;
    private List<Student> students;

    public Course(String name, Teacher teacher) {
        this.name = name;
        this.teacher = teacher;
        students = new ArrayList<>();
    }

    public void addStudent(Student student){ students.add(student); }
    public void removeStudent(Student student){ students.remove(student); }

    public void showStudents(){
        System.out.println("Students enrolled:");
        for(Student s: students) s.showInformation();
    }

    public void showInformation(){
        System.out.println("Course: " + name);
        System.out.println("Teacher: " + teacher.getName());
        System.out.println("Specialty: " + teacher.getSpecialty());
    }
}

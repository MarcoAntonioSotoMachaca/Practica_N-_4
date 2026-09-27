public class Student extends Person {
    private String studentId;

    public Student(String name, String studentId, int age) {
        super(name, age);
        this.studentId = studentId;
    }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public String getStudentId() { return studentId; }
    public void setStudentId(String studentId) { this.studentId = studentId; }
    public int getAge() { return age; }
    public void setAge(int age) { if(age >= 0) this.age = age; }

    @Override
    public void showInformation() {
        System.out.println(studentId + " - " + name + " - Age: " + age);
    }

    public void study() {
        System.out.println(name + " is studying.");
    }
}

package week03.exercise.v1;

class Course {
    private String code;

    public Course(String code) {
        this.code = code;
    }
}

class Teacher {
    private String name;
    private Course course1;
    private Course course2;

    public Teacher(String name) {
        this.name = name;
    }
    public void setCourse1(Course course) {
        this.course1 = course;
    }
    public void setCourse2(Course course) {
        this.course2 = course;
    }
}

public class CourseManagementSystem {
    public static void main(String[] args) {
        Course cs101 = new Course("CS101");
        Course cs102 = new Course("CS102");
        Course math112 = new Course("MATH112");

        Teacher baris = new Teacher("Baris");
        Teacher ismail = new Teacher("Ismail");

        baris.setCourse1(cs102);
        baris.setCourse2(cs101);
        ismail.setCourse1(cs101);
        ismail.setCourse2(math112);
    }
}

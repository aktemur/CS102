package lecture;

class Student {
    private String name;
    private double gpa;

    public Student(String name, double gpa) {
        this.name = name;
        this.gpa = gpa;
    }

    @Override
    public String toString() {
        return name + ": " + gpa + "\n";
    }
}

class FlexibleList<T> {
    T[] elements;
    int numElements;

    public FlexibleList() {
        elements = (T[])new Object[3];
        numElements = 0;
    }

    public void add(T item) {
        if (numElements == elements.length) {
            T[] newList = (T[])new Object[numElements * 2];
            for (int i = 0; i < numElements; i++) {
                newList[i] = elements[i];
            }
            elements = newList;
        }
        elements[numElements] = item;
        numElements++;
    }

    public int size() {
        return numElements;
    }

    public T get(int index) {
        return elements[index];
    }
}

class Course {
    private String department;
    private int code;
    private FlexibleList<Student> students;

    public Course(String department, int code) {
        this.department = department;
        this.code = code;
        this.students = new FlexibleList<Student>();
    }

    public void enroll(Student student) {
        students.add(student);
    }

    public String toString() {
        String result = department + " " + code + "\n";
        for (int i = 0; i < students.size(); i++) {
            Student student = students.get(i);
            result += student.toString();
        }
        return result;
    }
}

public class CourseManagementSystem {
    public static void main(String[] args) {
        Student student1 = new Student("Talha", 3.8);
        Student student2 = new Student("Onur", 3.5);
        Student student3 = new Student("Can", 3.3);
        Student student4 = new Student("Emre", 2.3);
        Student student5 = new Student("Elif", 3.9);
        Course course = new Course("CS", 102);
        course.enroll(student1);
        course.enroll(student2);
        course.enroll(student3);
        course.enroll(student4);
        course.enroll(student5);

        System.out.println(course);
    }
}

class Student {
    private static String universityName = "RGPV University";
    private static int totalStudents = 0;
    private final int rollNumber;
    private String name;
    private String grade;

    public Student(int rollNumber, String name, String grade) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.grade = grade;
        totalStudents++;
    }

    public void displayStudentDetails() {
        if (this instanceof Student) {
            System.out.println("University: " + universityName);
            System.out.println("Roll Number: " + rollNumber);
            System.out.println("Name: " + name);
            System.out.println("Grade: " + grade);
            System.out.println("---------------------------");
        } else {
            System.out.println("Invalid Student object.");
        }
    }

    public static void displayTotalStudents() {
        System.out.println("Total Students Enrolled: " + totalStudents);
    }
}

public class UniversityManagement {
    public static void main(String[] args) {
        Student stu1 = new Student(101, "Aman", "A");
        Student stu2 = new Student(102, "Adarsh", "B");

        stu1.displayStudentDetails();
        stu2.displayStudentDetails();
        Student.displayTotalStudents();
    }
}

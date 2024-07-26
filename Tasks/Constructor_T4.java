// 4. Copy Constructor: Create a 'Student' class with fields 'name', 'rollNumber', and 'grade'. Implement a copy constructor that initializes a new object as a copy of an existing 'Student' object. Also, provide a method to display the student's details.

class Student {
    private int rollNumber;
    private String name;
    private int grade;

    public Student(int rollNumber, String name, int grade) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.grade = grade;
    }

    public Student(Student other) {
        this(other.rollNumber, other.name, other.grade);
        // this.rollNumber = other.rollNumber;
        // this.name = other.name;
        // this.grade = other.grade;
    }

    public void getStudentDetails() {
        System.out.println("> " + rollNumber + ", " + name + ", " + grade);
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }
}

class Constructor_T4 {
    public static void main(String[] args) {
        Student s = new Student(89, "Arin Pra", 3);
        s.getStudentDetails();

        Student s1 = new Student(s);
        s1.setGrade(4);
        s1.getStudentDetails();
    }
}
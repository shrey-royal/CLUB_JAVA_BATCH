import java.util.Scanner;

class Student {
    int rollNo;
    String name;
    double fees;

    void getStudentDetails() {
        System.out.print("\nRoll No: " + rollNo);
        System.out.print("Name: " + name);
        System.out.println("Fees: " + fees);
    }    
}

public class Basics {
    public static void main(String[] args) {
        // Student s1; //object declaration
        // s1 = new Student(); //object instantiation

        // s1.rollNo = 23;
        // s1.name = "Dhairya";
        // s1.fees = 1500;

        // s1.getStudentDetails();

        Student[] s = new Student[5];
        Scanner sc = new Scanner(System.in);
        
        for (int i = 0; i < s.length; i++) {
            s[i] = new Student();
            System.out.println("Enter rollNo, Name, Fees: ");
            s[i].rollNo = sc.nextInt();
            s[i].name = sc.next();
            s[i].fees = sc.nextDouble();
        }
        sc.close();

        for (Student student : s) {
            student.getStudentDetails();
        }
    }
}

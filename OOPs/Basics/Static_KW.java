class Student {
    public int id;
    public String name;
    public static String college = "LDRP";
    public static int studentCounts = 0;


    public Student() {
        studentCounts++;
    }
    public Student(int id, String name) {
        this.id = id;
        this.name = name;
        studentCounts++;
    }

    void display() {
        System.out.println("(" + id + ", " + name + ")");
    }

    static int totalStudents() {
        return studentCounts;
    }


}

public class Static_KW {
    public static void main(String[] args) {
        Student[] s = new Student[2];

        // for (int i = 0; i < s.length; i++) {
        //     s[i] = new Student();
        // }

        s[0] = new Student(23, "Tirth");
        s[1] = new Student(67, "Shreya");

        System.out.println("College: " + Student.college);

        for (int i = 0; i < s.length; i++) {
            s[i].display();
        }

        System.out.println("Total Students: " + Student.totalStudents());
    }
}

/*
Static is used to refer the common property of all objects.

Anything that will be declared as static will be common for all the objects of that class.

Task:

Problem Statement: Car Fleet Management

You are tasked with developing a car fleet management system. The system needs to keep track of various pieces of information for each car in the fleet, such as the make, model, year, price, and whether the car is currently in use. Additionally, the system should maintain a count of the total number of cars in the fleet.

Design and implement a `Car` class to represent individual cars in the fleet. The `Car` class should have the following features:

- Attributes:
  - `make` (String): The make or brand of the car.
  - `model` (String): The model of the car.
  - `year` (int): The manufacturing year of the car.
  - `price` (double): The price of the car.
  - `isRunning` (boolean): A flag indicating whether the car is currently running or not.

- Static Attribute:
  - `numberOfCars` (int): A static variable to keep track of the total number of cars in the fleet.

- Methods:
  - A constructor to initialize the car's attributes.
  - `start()` and `stop()` methods to change the `isRunning` status.
  - `displayCarInfo()` method to display car information.
  - A `getNumberOfCars()` static method to retrieve the total number of cars in the fleet.

You need to implement the `Car` class and use it to create, manage, and display information for multiple cars in the fleet. Ensure that the `numberOfCars` variable is properly incremented when new cars are added to the fleet and that it can be accessed without creating an instance of the `Car` class.




*/
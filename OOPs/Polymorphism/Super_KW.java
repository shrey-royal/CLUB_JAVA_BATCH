class Animal {
    String name, color;

    Animal(String name, String color) {
        this.name = name;
        this.color = color;
    }

    void display() {
        System.out.println("My animal's name is " + name + " and he/she is " + color + " in color.");
    }
}

class Dog extends Animal {

    Dog(String name, String color) {
        super(name, color);
    }

    void getDogDetails() {
        super.display();
        // System.out.println("My animal's name is " + super.name + " and he/she is " + super.color + " in color.");
    }
}

public class Super_KW {
    public static void main(String[] args) {
        Dog d = new Dog("Tomy", "Golden");

        d.getDogDetails();
    }
}
/*
Super Keyword is used to refer immediate parent class.

-> instance variable
-> method
-> constructor

Problem Statement: Employee Information System

Create a system to manage employee information using Java classes and inheritance. Implement a `Person` class that stores basic personal details and an `Emp` class that extends the `Person` class to include salary information.

The `Person` class contains:
- Properties: `id` (integer), `name` (String)
- Constructor: Initializes `id` and `name`

The `Emp` class inherits from `Person` and adds:
- Property: `salary` (float)
- Constructor: Initializes `id`, `name`, and `salary`

Implement the `display()` method in the `Emp` class to print the employee's information: ID, name, and salary.

In the `TestSuper5` class:
- Create an instance of `Emp` with ID `1`, name `"ankit"`, and a salary of `45000`.
- Display the details of this employee using the `display()` method.


*/
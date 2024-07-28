class Person {
    private String name;
    private int age;
    private String gender;

    Person(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    void display() {
        System.out.println("Person: (" + name + ", " + age + ", " + gender + ")");
    }
}

class Developer extends Person {
    private String desg;
    private double salary;

    public Developer(String name, int age, String gender, String desg, double salary) {
        super(name, age, gender);   //calls the parent class' constructor
        this.desg = desg;
        this.salary = salary;
    }

    void display() {
        super.display();
        System.out.println("Dev: (" + desg + ", " + salary + ")");
    }
}

public class Single {
    public static void main(String[] args) {
        Developer dev = new Developer("Arin Pra", 20, "male", "Sr. Manager", 23000);
        dev.display();
    }
}

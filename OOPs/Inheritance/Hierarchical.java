class Religion {
    private String name;
    private String hierarchyDetails;

    public Religion(String name, String hierarchyDetails) {
        this.name = name;
        this.hierarchyDetails = hierarchyDetails;
    }

    public void displayDetails() {
        System.out.println(name + " Hierarchy:");
        System.out.println(hierarchyDetails);
    }
}

class Hinduism extends Religion {
    public Hinduism() {
        super("Hinduism",
            "  - Major sects: Shaivism, Shaktism, Vaishnavism\n" +
            "  - Key deities: Brahma, Vishnu, Shiva");
    }
}

class Islam extends Religion {
    public Islam() {
        super("Islam",
            "  - Major branches: Sunni, Shia\n" +
            "  - Key divisionsn(Sunni): Hanafi, Shafi'i, Mailiki, Hanbali");
    }
}

class Sikhism extends Religion {
    public Sikhism() {
        super("Sikhism",
            "  - Major sects: Khalsa, Namdhari\n" +
            "  - Key principles: Teachings of Guru Nanak and other gurus");
    }
}

public class Hierarchical {
    public static void main(String[] args) {
        Religion hinduism = new Hinduism();
        Religion islam = new Islam();
        Religion sikhism = new Sikhism();

        hinduism.displayDetails();
        System.out.println();
        islam.displayDetails();
        System.out.println();
        sikhism.displayDetails();
    }
}

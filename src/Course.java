public class Course {
    public Course() {
    }

    public Course(int id, String name, String description, double price, Instructor instructor) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.description = description;
        this.instructor = instructor;
    }

    int id;
    String name;
    String description;
    double price;
    Instructor instructor;
}

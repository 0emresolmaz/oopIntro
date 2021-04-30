public class Main {

    public static void main(String[] args) {

        Course course1 = new Course();
        course1.id = 1;
        course1.name = "Java & React";
        course1.description = "Nitelikli Yazılımcı kursu ücretsiz olup 21 Nisan 2021 tarihinde başlayacaktır. ";
        course1.price = 900;
        course1.instructor = new Instructor(1, "Engin Demiroğ", "engindemirog@gmail.com");

        Course course2;
        course2 = new Course(
                2,
                "C#-Angular",
                "Nitelikli yazılımcı kursu ucretsiz olup ocak ayında başlayacaktır",
                1000,
                new Instructor(2, "Emre Solmaz", "emresolmaz@gmail.com"));


        Course[] courses = {course1, course2};

        CourseManager courseManager = new CourseManager();

        courseManager.addCourse(course1);

        courseManager.addCourse(course2);

        courseManager.getCourses(courses);
    }
}

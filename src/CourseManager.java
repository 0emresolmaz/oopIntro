public class CourseManager {

    public void addCourse(Course course) {
        System.out.println("Kurs eklendi: " + course.name + ", " + course.instructor.nameSurname);
    }

    public void getCourses(Course[] courses) {

        for (Course course : courses) {
            System.out.println(course.name);
        }
    }
}

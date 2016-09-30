package Module3.task3;


import java.text.SimpleDateFormat;
import java.util.Date;

public class Student {
    private String firstName;
    private String lastName;
    private int group;
    private int age;
    private SimpleDateFormat dateFormat = new SimpleDateFormat("MM-DD-YYYY");
    private Date date = dateFormat.parse("01-01-2016");
    private Course firstCourse = new Course(date, "Math");
    private Course secondCourse = new Course(date,"Phi");
    public Course[] coursesTaken = {firstCourse, secondCourse};


    public Student(String firstName, String lastName, int age, int group, Course[] coursesTaken) {
        this.lastName = lastName;
        this.coursesTaken = coursesTaken;
        this.firstName = firstName;
        this.age = age;
        this.group = group;
    }

    public Student(String lastName, String firstName, int group) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.group = group;
    }

    public int getGroup() {
        return group;
    }

    public int getAge() {
        return age;
    }

    public Course[] getCoursesTaken() {
        return coursesTaken;
    }

    public String getLastName() {

        return lastName;
    }

    public String getFirstName() {

        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setGroup(int group) {
        this.group = group;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setCoursesTaken(Course[] coursesTaken) {
        this.coursesTaken = coursesTaken;
    }
}

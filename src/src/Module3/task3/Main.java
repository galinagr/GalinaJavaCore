package Module3.task3;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat dateFormat = new SimpleDateFormat("MM-DD-YYYY");
        Date date = dateFormat.parse("01-01-2016");
        Student student1 = new Student("Jack", "Pitt", 101);
        Student student2 = new Student("Jack", "Pitt", 18, 101, Student.class.getCoursesTaken()[0]);
        Course course1 = new Course(date, "Nick");
        Course course2 = new Course ("Jack",10,"Nickolson");

        CollegeStudent collegeStudent1 = new CollegeStudent("Nick","Nick",101);
        SpecialStudent specialStudent1 = new SpecialStudent("Nick","Nick",101,15);
            }
}

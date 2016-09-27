package Module3.task3;


public class CollegeStudent extends Student {
    private String collegeName;
    private int rating;
    private long id;


    public CollegeStudent(String firstName, String lastName, int age, int group, Course[] coursesTaken) {
        super(firstName, lastName, age, group, coursesTaken);
    }

    public CollegeStudent(String lastName, String firstName, int group) {
        super(lastName, firstName, group);
    }

    public void setCollegeName(String collegeName) {
        this.collegeName = collegeName;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getCollegeName() {

        return collegeName;
    }

    public int getRating() {
        return rating;
    }

    public long getId() {
        return id;
    }

    public CollegeStudent(String lastName, String firstName, int age, int group, Course[] coursesTaken, String collegeName, long id, int rating) {
        super(lastName, firstName, age, group, coursesTaken);
        this.collegeName = collegeName;
        this.id = id;
        this.rating = rating;
    }
}

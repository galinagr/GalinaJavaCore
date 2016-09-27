package Module3.task3;

public class SpecialStudent extends CollegeStudent {
    private long secretKey;
    private String email;

    public SpecialStudent(String firstName, String lastName, int age, int group, Course[] coursesTaken) {
        super(firstName, lastName, age, group, coursesTaken);
    }

    public SpecialStudent(String lastName, String firstName, int age, int group, Course[] coursesTaken, String collegeName, long id, int rating) {
        super(lastName, firstName, age, group, coursesTaken, collegeName, id, rating);
    }

    public SpecialStudent(String lastName, String firstName, int group, long secretKey) {
        super(lastName, firstName, group);
        this.secretKey = secretKey;
    }

    public long getSecretKey() {
        return secretKey;
    }

    public void setSecretKey(long secretKey) {
        this.secretKey = secretKey;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}

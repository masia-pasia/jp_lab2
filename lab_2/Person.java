package lab_2;

public class Person {
    private final String FirstName;
    private final String LastName;
    private final int Age;
    private final String Job;

    public Person(String firstName, String lastName, int age, String job) {
        FirstName = firstName;
        LastName = lastName;
        Age = age;
        Job = job;
    }

    public String getFirstName() {
        return FirstName;
    }

    public String getLastName() {
        return LastName;
    }

    public int getAge() {
        return Age;
    }

    public String getJob() {
        return Job;
    }
}

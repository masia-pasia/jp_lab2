package lab_2;

public class BetterPerson {
    private final String FirstName;
    private final String LastName;
    private final int Age;
    private final String Job;

    public BetterPerson(String firstName, String lastName, int age, String job) {
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

    @Override
    public boolean equals(Object o)
    {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        BetterPerson that = (BetterPerson) o;

        if (Age != that.Age) return false;
        if (!FirstName.equals(that.FirstName)) return false;
        return LastName.equals(that.LastName);
    }

    @Override
    public int hashCode()
    {
        int result = FirstName.hashCode();
        result = 31 * result + LastName.hashCode();
        result = 31 * result + Age;
        return result;
    }


}

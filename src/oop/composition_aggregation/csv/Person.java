package oop.composition_aggregation.csv;

public class Person {
    private String firstName;
    private String lastName;
    private Date birthdate;

    public Person(String firstName, String lastName, Date birthdate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthdate = birthdate;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Date getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(Date birthdate) {
        this.birthdate = birthdate;
    }

    @Override
    public String toString() {
        return String.format("%s %s,%d,%d,%d",
                firstName, lastName,
                birthdate.getYear(), birthdate.getMonth(), birthdate.getDay());
    }
}

package classwork_11;

import java.util.Objects;

public class Person {
    private String firstName;

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(firstName, person.firstName);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(firstName);
    }
    public Person(String firstName) {
        this.firstName = firstName;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                '}';
    }
}

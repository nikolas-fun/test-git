package classwork_16;

public class User /*implements Comparable<User>*/{
    private String name;
    private int age;
    private String email;
    private boolean active;
    private String city;
    public User(String name, int age, String email, boolean active, String city) {
        this.name = name;
        this.age = age;
        this.email = email;
        this.active = active;
        this.city = city;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public boolean isActive() {
        return active;
    }

    public String getEmail() {
        return email;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", email='" + email + '\'' +
                ", active=" + active +
                '}';
    }



  /*  @Override
    public int compareTo(User other) {
        return this.age - other.age;
    }*/
}

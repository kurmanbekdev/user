import java.util.List;

public class User {
    private String name;
    private String surNane;
    private int age;
    

    public User() {
    }

    public User(String name, String surNane, int age, List<User> users) {
        this.name = name;
        this.surNane = surNane;
        this.age = age;
        
    }

    public User(String b, String c, int age) {
    }


    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", surNane='" + surNane + '\'' +
                ", age=" + age +
                ", users=" +
                '}';
    }
}

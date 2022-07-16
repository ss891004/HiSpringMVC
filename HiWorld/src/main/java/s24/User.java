package s24;

import java.util.List;

public class User {
    private String name;
    private Integer age;
    private List<String> skills;
    //省略get、set
    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", skills=" + skills +
                '}';
    }
}
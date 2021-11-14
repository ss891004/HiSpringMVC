package s03;

public class UserDto {
    //姓名
    private String name;
    //年龄
    private Integer age;
    //地址
    private String address;
    //省略get、set
    @Override
    public String toString() {
        return "UserDto{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                '}';
    }
}
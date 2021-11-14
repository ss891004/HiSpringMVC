package s02;

//Data Transfer Object  数据传输对象
//POJO Plain Ordinary Java Object，简单Java对象
/**
 * 用户基本信息
 */
public class UserInfoDto {
    //姓名
    private String name;
    //年龄
    private Integer age;
    //省略了get、set方法
    @Override
    public String toString() {
        return "UserModel{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
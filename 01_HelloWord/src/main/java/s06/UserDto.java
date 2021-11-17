package s06;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserDto {
    //id
    private Long id;
    //姓名
    private String name;
    //年龄
    private Integer age;

    //省略get、set
    @Override
    public String toString() {
        return "UserDto{" +
                "id= " + id +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
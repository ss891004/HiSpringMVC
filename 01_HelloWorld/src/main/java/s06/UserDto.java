package s06;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class UserDto {
    //id
    private Long id;
    //姓名
    private String name;
    //年龄
    private Integer age;

}
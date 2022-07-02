package s04;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

//自定义了一个UserDto，来接收上面表单的参数。

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserDto {
    //姓名
    private String name;
    //年龄
    private Integer age;
    //头像
    private MultipartFile headImg;
    //身份证（多张图像）
    private List<MultipartFile> idCardImg;
    //省略了get、set方法...
}

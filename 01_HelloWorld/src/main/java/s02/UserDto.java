package s02;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * 用户信息
 */


@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserDto {
    //个人基本信息
    private UserInfoDto userInfo;
    //工作信息
    private WorkInfoDto workInfo;
    //工作经验（0到n个）
    private List<ExperienceInfoDto> experienceInfos;
    //省略了get、set方法
    @Override
    public String toString() {
        return "UserDto{" +
                "userInfo=" + userInfo +
                ", workInfo=" + workInfo +
                ", experienceInfos=" + experienceInfos +
                '}';
    }
}


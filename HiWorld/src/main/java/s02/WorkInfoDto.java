package s02;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 工作基本信息
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class WorkInfoDto {
    //工作年限
    private Integer workYears;
    //工作地点
    private String workAddress;
    //省略了get、set方法
    @Override
    public String toString() {
        return "WorkInfoDto{" +
                "workYears=" + workYears +
                ", workAddress='" + workAddress + '\'' +
                '}';
    }
}
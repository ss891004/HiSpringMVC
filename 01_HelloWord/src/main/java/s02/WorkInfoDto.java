package s02;

/**
 * 工作基本信息
 */
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
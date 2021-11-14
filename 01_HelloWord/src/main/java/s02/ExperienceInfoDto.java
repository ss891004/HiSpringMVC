package s02;

/**
 * 工作经验
 */
public class ExperienceInfoDto {
    //公司
    private String company;
    //职位
    private String position;
    //省略了get、set方法
    @Override
    public String toString() {
        return "ExperienceInfoDto{" +
                "company='" + company + '\'' +
                ", position='" + position + '\'' +
                '}';
    }
}
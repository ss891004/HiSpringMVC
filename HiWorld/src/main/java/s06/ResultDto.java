package s06;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * rest接口通用返回值数据结构
 * 客户端调用服务器端接口的时候，接口有可能会发生异常，这些异常信息需要返回给调用者，通常我们会为错误定义错误码以及提示信息。
 * @param <T>
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResultDto<T> {
    //接口状态（成功还是失败）
    private Boolean success;
    //错误码
    private String code;
    //提示信息
    private String msg;
    //数据
    private T data;
    public static <T> ResultDto<T> success(T data) {
        return success(data, "操作成功!");
    }
    public static <T> ResultDto<T> success(T data, String msg) {
        ResultDto<T> result = new ResultDto<>();
        result.setSuccess(Boolean.TRUE);
        result.setMsg(msg);
        result.setData(data);
        return result;
    }
    //省略get、set方法
}

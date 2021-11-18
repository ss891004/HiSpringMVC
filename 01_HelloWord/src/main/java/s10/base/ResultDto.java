package s10.base;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * rest接口通用返回值数据结构
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
    public static <T> ResultDto<T> error(String msg) {
        return error(null,msg);
    }
    public static <T> ResultDto<T> error(String code,String msg) {
        return error(code,msg,null);
    }
    public static <T> ResultDto<T> error(String code, String msg, T data) {
        ResultDto<T> result = new ResultDto<>();
        result.setSuccess(Boolean.FALSE);
        result.setCode(code);
        result.setMsg(msg);
        result.setData(data);
        return result;
    }
}
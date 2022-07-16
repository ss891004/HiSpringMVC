package s10.base;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 业务异常
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class BusException extends RuntimeException {
    //异常错误码
    private String code;
    //错误扩展信息
    private Object data;

    public BusException(String code, String msg, Object data) {
        super(msg);
        this.code = code;
        this.data = data;
    }

    public static void throwBusException(String msg) {
        throwBusException(null, msg);
    }
    public static void throwBusException(String code, String msg) {
        throwBusException(code, msg, null);
    }
    public static void throwBusException(String code, String msg, Object data) {
        throw new BusException(code, msg, data);
    }
}


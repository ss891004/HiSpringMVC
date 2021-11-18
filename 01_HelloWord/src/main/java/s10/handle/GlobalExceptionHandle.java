package s10.handle;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import s10.base.BusException;
import s10.base.ResultDto;

/**
 * 全局异常处理
 */
@RestControllerAdvice // @1
public class GlobalExceptionHandle {
    /**
     * 统一处理业务异常
     *
     * @param e
     * @param <T>
     * @return
     */
    @ExceptionHandler(BusException.class)
    public <T> ResultDto<T> doBusException(BusException e) {
        //1、记录错误日志
        //2.png、返回结果
        return ResultDto.error(e.getCode(), e.getMessage(), (T) e.getData());
    }
    /**
     * 处理其他异常
     *
     * @param e
     * @param <T>
     * @return
     */
    @ExceptionHandler
    public <T> ResultDto<T> doException(Exception e) {
        //1、记录错误日志
        //2.png、返回结果
        return ResultDto.error("系统异常，请联系管理员，错误详情：" + e.getMessage());
    }
}
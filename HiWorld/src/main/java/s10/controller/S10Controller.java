package s10.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import s10.base.BusException;
import s10.base.ResultDto;

@RestController
@RequestMapping("/s10")
public class S10Controller {
    /**
     * 获取用户id
     *
     * @param code
     * @return
     */
    @RequestMapping("/getUserName")
    public ResultDto<String> getUserName(@RequestParam("code") Integer code) {
        if (!Integer.valueOf(6666).equals(code)) {
            //验证码有误的时候，返回4001错误码
            BusException.throwBusException("4001", "验证码有误!");
        }
        return ResultDto.success("路人");
    }
    /**
     * 获取用户id
     *
     * @param code
     * @return
     */
    @RequestMapping("/getUserId")
    public ResultDto<String> getUserId(@RequestParam("code") Integer code) {
        if (!Integer.valueOf(6666).equals(code)) {
            BusException.throwBusException("4001", "验证码有误!");
        }
        return ResultDto.success("8888");
    }
}


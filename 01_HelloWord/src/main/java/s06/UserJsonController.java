package s06;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Collection;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

@Controller
@RequestMapping("/s06")
public class UserJsonController {

    /**
     * 用户列表(用户id->用户信息)
     */
    Map<Long, UserDto> userDtoMap = new ConcurrentHashMap<>();
    {
        userDtoMap.put(1L, new UserDto(1L, "路人", 30));
        userDtoMap.put(2L, new UserDto(2L, "张三", 20));
        userDtoMap.put(3L, new UserDto(3L, "李四", 18));
    }
    @GetMapping("/list.do")
    @ResponseBody
    public Collection<UserDto> list() {
        return this.userDtoMap.values();
    }
}

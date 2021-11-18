package s06;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

@RestController
@RequestMapping("/s06/2.png")
public class User2JsonController {
    Map<Long, UserDto> userDtoMap = new ConcurrentHashMap<>();
    {
        userDtoMap.put(1L, new UserDto(1L, "路人", 30));
        userDtoMap.put(2L, new UserDto(2L, "张三", 20));
        userDtoMap.put(3L, new UserDto(3L, "李四", 18));
    }
    @GetMapping("/list.do")
    public ResultDto<Collection<UserDto>> list() {
        return ResultDto.success(this.userDtoMap.values());
    }
    @GetMapping("/{id}.do")
    public ResultDto<UserDto> user(@PathVariable("id") Long id) {
        return ResultDto.success(this.userDtoMap.get(id));
    }
}


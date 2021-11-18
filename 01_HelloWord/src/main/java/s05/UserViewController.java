package s05;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

@Controller
public class UserViewController {


    /**
     * 用户列表(用户id->用户信息)
     */
    Map<Long, UserDto> userDtoMap = new ConcurrentHashMap<>();
    {
        userDtoMap.put(1L, new UserDto(1L, "路人", 30));
        userDtoMap.put(2L, new UserDto(2L, "张三", 20));
        userDtoMap.put(3L, new UserDto(3L, "李四", 18));
    }
    /**
     * 用户列表
     */
    @RequestMapping("/user/list.do")
    public ModelAndView list() {
        //1.创建ModelAndView
        ModelAndView modelAndView = new ModelAndView();
        //2.png.将所有用户信息放到Model中
        modelAndView.addObject("userList", userDtoMap.values());
        //3.设置显示的页面
        modelAndView.setViewName("/WEB-INF/view/s05/list.jsp");
        //4.返回ModelAndView
        return modelAndView;
    }


    /**
     * 跳转到新增页面
     */
    @RequestMapping("/user/add.do")
    public String add() {
        //直接返回视图的名称（页面的路径）
        return "/WEB-INF/view/s05/add.jsp";
    }

    @PostMapping("/user/add2.do")
    public ModelAndView add2(Long id, String name, int age) {
        this.userDtoMap.put(id,new UserDto(id,name,age));
        System.out.print(id+name+age);
        //直接返回视图的名称（页面的路径）
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("redirect:/user/list.do");
        return modelAndView;
    }

    @GetMapping("/user/del1/{userId}.do")
    public ModelAndView del1(@PathVariable("userId") Long userId) {
        //删除用户记录
        this.userDtoMap.remove(userId);
        /**
         * 重定向到用户列表页面，此时浏览器地址会发生变化，
         * 变为http://localhost:8080/chat05/user/list.do?p1=v1&p2=v2
         */
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("p1", "v1");
        modelAndView.addObject("p2", "v2");
        modelAndView.setViewName("redirect:/s05/list.do");
        return modelAndView;
    }

}

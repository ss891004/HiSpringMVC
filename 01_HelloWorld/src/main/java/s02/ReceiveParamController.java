package s02;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/receiveParam")
public class ReceiveParamController {

    // 接收Servlet中的参数
    @RequestMapping("/test1.do")
    public ModelAndView test1(HttpServletRequest request,
                              HttpServletResponse response,
                              HttpSession session) {
        String name = request.getParameter("name");
        String age = request.getParameter("age");
        String msg = String.format("name:%s,age:%s", name, age);
        System.out.println(msg);
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("/WEB-INF/view/result.jsp");
        modelAndView.addObject("msg", msg);
        return modelAndView;
    }


    //通过方法形参名称接收参数

    /**
     * springmvc调用这个方法之前，会根据方法参数名称，请求中获取参数的值，将其传入
     * 过程：
     * 1、将request.getParameter("name")传递给方法的第1个参数name
     * 2.png、将Integer.valueOf(request.getParameter("age"))传递给方法的第2个参数age
     */
    @RequestMapping("/test2.do")
    public ModelAndView test2(String name, Integer age) {
        String msg = String.format("name:%s,age:%s", name, age);
        System.out.println(msg);
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("/WEB-INF/view/result.jsp");
        modelAndView.addObject("msg", msg);
        return modelAndView;
    }

    //通过@RequestParam接收参数

    /**
     * 如果方法的参数名称和表单中的参数名称不一致的时候，可以通过 @RequestParam注解的value属性来指定表单中参数的名称
     * 比如：@RequestParam("pname") String name 接收 request.getParameter("pname") 的值
     * 1、将request.getParameter("pname")传递给方法的第1个参数name
     * 2.png、将Integer.valueOf(request.getParameter("page"))传递给方法的第2个参数age
     */
    @RequestMapping("/test3.do")
    public ModelAndView test3(@RequestParam("pname") String name,
                              @RequestParam("page") Integer age) {
        String msg = String.format("name:%s,age:%s", name, age);
        System.out.println(msg);
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("/WEB-INF/view/result.jsp");
        modelAndView.addObject("msg", msg);
        return modelAndView;
    }

    //通过1个对象接收参数

    /**
     * 传递对象信息，参数比较多的时候，可以通过对象来传递信息
     * 比如表单中2个参数（name、age）
     * 那么可以定义一个类 UserInfoDto(2个属性：name、age) 来接收表单提交的参数
     * 控制器的方法参数为：(UserInfoDto userInfoDto)
     * springmvc调用这个方法的时候，会自动将UserModel创建好，并且将请求中的参数按名称设置到 UserInfoDto 的属性中，然后传递进来
     * 相当于会执行下面代码：
     * UserInfoDto user = new UserInfoDto();
     * user.setName(request.getParameter("name"));
     * user.setAge(Integer.valueOf(request.getParameter("age")));
     * 然后将user对象传给当前方法的第一个参数
     */
    @RequestMapping("/test4.do")
    public ModelAndView test4(UserInfoDto userInfoDto) {
        String msg = String.format("userDto：%s", userInfoDto);
        System.out.println(msg);
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("/WEB-INF/view/result.jsp");
        modelAndView.addObject("msg", msg);
        return modelAndView;
    }

    //通过多个对象接收参数

    /**
     * 比如表单有4个元素[name,age,workYear,workAddress]
     * 其中请求的参数 name,age 赋值给UserInfoDto中的2个属性（name,age）
     * 另外2个参数 workYear,workAddress 赋值给WorkInfoDto中的2个属性（workYear,workAddress）
     */
    @RequestMapping("/test5.do")
    public ModelAndView test5(UserInfoDto userInfoDto, WorkInfoDto workInfoDto) {
        String msg = String.format("userInfoDto：[%s], workInfoDto：[%s]", userInfoDto, workInfoDto);
        System.out.println(msg);
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("/WEB-INF/view/result.jsp");
        modelAndView.addObject("msg", msg);
        return modelAndView;
    }

    //组合对象接收参数（对象中嵌套对象、集合等等）
    @RequestMapping("/test6.do")
    public ModelAndView test6(UserDto userDto) {
        String msg = String.format("userDto：[%s]", userDto);
        System.out.println(msg);
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("/WEB-INF/view/result.jsp");
        modelAndView.addObject("msg", msg);
        return modelAndView;
    }

    //通过@PathVariable接受url中的参数

    /**
     * 动态url：url中可以使用{变量名称}来表示动态的部分，{}包裹的部分可以替换为任意内容
     * 比如：/receiveparam/{v1}/{v2}.do可以接受:/receiveparam/1/2.png.do、/receiveparam/路人/30.do 等等
     */
    @RequestMapping("/{v1}/{v2}.do")
    public ModelAndView test7(@PathVariable("v1") String p1, @PathVariable("v2") String p2) {
        String msg = String.format("p1：[%s]，p2：[%s]", p1, p2);
        System.out.println(msg);
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("/WEB-INF/view/result.jsp");
        modelAndView.addObject("msg", msg);
        return modelAndView;
    }
}

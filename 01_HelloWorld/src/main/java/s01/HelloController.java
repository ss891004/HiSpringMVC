package s01;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
//用来标注在类上，表示这个类是一个控制器类，可以用来处理http请求，通常会和@RequestMapping一起使用。
public class HelloController {

    @RequestMapping("/hello.do")
    //表示请求映射，一般用在我们自定义的Controller类上或者Controller内部的方法上。
    public ModelAndView hello() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("/WEB-INF/view/hello.jsp");
        //稍后将这个信息显示在hello.jsp中，modelAndView.addObject相当于request.setAttribute(name,value)
        modelAndView.addObject("msg","这是第一个springboot程序!");
        return modelAndView;
    }
}

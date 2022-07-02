package s03;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/s03")
public class UserController {

    @PostMapping("/add.do")
    public ModelAndView add(@RequestBody UserDto user) {
        System.out.println("user:" + user);
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("/WEB-INF/view/result.jsp");
        modelAndView.addObject("msg", user);
        return modelAndView;
    }

    @GetMapping("/add2.do")
    public ModelAndView fun(){
        return new ModelAndView();
    }


}

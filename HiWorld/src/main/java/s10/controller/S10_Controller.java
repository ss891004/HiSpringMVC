package s10.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import s10.base.NameException;
import s10.base.PassException;

@RestController
@RequestMapping("/s10_")
public class S10_Controller {
    @RequestMapping("/login")
    public ModelAndView login(@RequestParam("name") String name,
                              @RequestParam("pass") Integer pass) throws Exception {
        //用户名必须为路人
        if (!"路人".equals(name)) {
            throw new NameException("用户名有误!");
        }
        //密码必须为666
        if (Integer.valueOf(666).equals(pass)) {
            throw new PassException("密码有误!");
        }
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("name", name);
        modelAndView.setViewName("s10/success");
        return modelAndView;
    }
}


package s23;

import org.springframework.http.MediaType;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/s23")
public class S23Controller {
    // @RequestParam用法及原理详解
    // http://127.0.0.1:8080/01_HelloWorld/s23/test1?name=路人&age=35&interests=篮球&interests=旅游&pets=小狗&pets=小猫
    // http://127.0.0.1:8080/01_HelloWorld/s23/test1?age=35&interests=篮球&interests=旅游&pets=小狗&pets=小猫
    @RequestMapping("/test1")
    public Map<String, Object> test1(@RequestParam(value = "name", required = false, defaultValue = "ready") String name, //相当于request.getParameter("name")
                                     @RequestParam("age") int age, //Integer.parseInt(request.getParameter("age"))
                                     @RequestParam("interests") String[] interests, //request.getParameterValues("pets")
                                     @RequestParam("pets") List<String> pets //Arrays.asList(request.getParameterValues("pets"))
    ) {
        Map<String, Object> result = new LinkedHashMap<>();
        result.put("name", name);
        result.put("age", age);
        result.put("interests", interests);
        result.put("pets", pets);
        return result;
    }

    // http://127.0.0.1:8080/01_HelloWorld/s23/test1?name=路人&age=35&interests=篮球&interests=旅游&pets=小狗&pets=小猫
    // interests和pet都是有多个值，上面的结果中都只获取了第一个 值
    @RequestMapping("/test2")
    public Map<String, String> test2(@RequestParam Map<String, String> paramMap) {
        return paramMap;
    }

    @RequestMapping(value = "/test3", produces = MediaType.APPLICATION_JSON_VALUE)
    public MultiValueMap<String, String> test3(@RequestParam MultiValueMap<String, String> paramMap) {
        return paramMap;
    }

}

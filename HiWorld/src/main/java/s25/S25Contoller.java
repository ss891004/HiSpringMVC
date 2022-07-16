package s25;

import org.apache.commons.io.IOUtils;
import org.springframework.core.io.InputStreamResource;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/s25")
public class S25Contoller {

    //@RequestHeader

    @RequestMapping("/test1")
    public Map<String, Object> test1(@RequestHeader(value = "name", required = false, defaultValue = "ready") String name,
                                     @RequestHeader(value = "age") int age,
                                     @RequestHeader(value = "header1") List<String> header1) {
        Map<String, Object> result = new LinkedHashMap<>();
        result.put("name", name);
        result.put("age", age);
        result.put("header1", header1);
        return result;
    }

    @RequestMapping("/test2")
    public Map<String, String> test2(@RequestHeader Map<String, String> headerMap) {
        return headerMap;
    }

    @RequestMapping("/requestbody/test3")
    public String test3(@RequestBody InputStreamResource body) throws IOException {
        String content = IOUtils.toString(body.getInputStream(), "UTF-8");
        System.out.println("content:" + content);
        return "ok";
    }
}

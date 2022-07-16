package s24;

import org.apache.commons.io.IOUtils;
import org.springframework.core.io.InputStreamResource;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.RequestEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.lang.reflect.Type;
import java.net.URI;

@RestController
@RequestMapping("/s24")
public class S24Controller {

    // @RequestBody 用法

    @RequestMapping("/test1")
    public String test1(@RequestBody String body) {
        System.out.println("body:" + body);
        return "ok";
    }

    @RequestMapping("/test2")
    public String test2(@RequestBody User user) {
        System.out.println("user:" + user);
        return "ok";
    }

    @RequestMapping("/test3")
    public String test3(@RequestBody InputStreamResource body) throws IOException {
        String content = IOUtils.toString(body.getInputStream(), "UTF-8");
        System.out.println("content:" + content);
        return "ok";
    }

    @RequestMapping("/test4")
    public String test4(@RequestBody byte[] bodyBytes) {
        System.out.println("body长度(bytes)：" + bodyBytes.length);
        System.out.println("body内容：" + new String(bodyBytes));
        return "ok";
    }

    @RequestMapping("/test5")
    public String test5(HttpEntity<User> httpEntity) {
        //header信息
        HttpHeaders headers = httpEntity.getHeaders();
        System.out.println("headers:" + headers);
        //body中的内容会自动转换为HttpEntity中泛型指定的类型
        User user = httpEntity.getBody();
        System.out.println("body:" + user);
        return "ok";
    }


    @RequestMapping("/test6")
    public String test6(RequestEntity<User> requestEntity) {
        //请求方式
        HttpMethod method = requestEntity.getMethod();
        System.out.println("method:" + method);
        //请求地址
        URI url = requestEntity.getUrl();
        System.out.println("url:" + url);
        //body的类型，即RequestEntity后面尖括号中的类型
        Type type = requestEntity.getType();
        System.out.println("body的类型，即RequestEntity后面尖括号中的类型:" + type);
        //header信息
        HttpHeaders headers = requestEntity.getHeaders();
        System.out.println("headers:" + headers);
        //body中的内容会自动转换为HttpEntity中泛型指定的类型
        User user = requestEntity.getBody();
        System.out.println("body:" + user);
        return "ok";
    }
}

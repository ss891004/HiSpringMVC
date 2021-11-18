package s11;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.multipart.MultipartResolver;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
@Configuration
@ComponentScan("s11")
@EnableWebMvc
public class MvcConfig  {

    /**
     * 定义文件上传类型的请求解析器
     *
     * @return
     */
    @Bean
    public MultipartResolver multipartResolver() {
        CommonsMultipartResolver multipartResolver = new CommonsMultipartResolver();
        //maxUploadSizePerFile:单个文件大小限制（byte）
        multipartResolver.setMaxUploadSizePerFile(10 * 1024 * 1024);
        //maxUploadSize：整个请求大小限制（byte）
        multipartResolver.setMaxUploadSizePerFile(100 * 1024 * 1024);
        return multipartResolver;
    }
}

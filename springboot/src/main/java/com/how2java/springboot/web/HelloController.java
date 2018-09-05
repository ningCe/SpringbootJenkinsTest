package com.how2java.springboot.web;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
 
//@RestController 是spring4里的新注解，是@ResponseBody和@Controller的缩写。
//意思是controller里面的方法都以json格式输出，不用再写什么jackjson配置的了
@RestController
public class HelloController {
 
    @RequestMapping("/hello")
    public String hello() {
        return "Hello Spring Boot!";
    }
 
}
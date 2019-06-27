package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author:ldw
 * @Description
 * @Date ：Create in 17:20 2019/6/26
 * @Modified By :
 */
@RestController("/")
public class HelloController {

    @GetMapping(value = "/hello")
    public String hello(){
        return  "hello";
    }
}

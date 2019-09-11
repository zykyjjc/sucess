package hello.controller;

import hello.bean.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


/**
 * created by 不器 on 2019/9/9.
 */
@Controller
public class HelloController {
    @Autowired
    Person person;
    @RequestMapping("/hello")
    @ResponseBody
    public Person say(){
        return person;
    }
}

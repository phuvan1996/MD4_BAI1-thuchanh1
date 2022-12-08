package ra.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("studentController")
public class StudentController {
    @RequestMapping("helloWord")
    public String helleWord(){
     return "Hello";
    }
}
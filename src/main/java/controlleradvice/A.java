package controlleradvice;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class A {

    @GetMapping("/test")
    public void test(){
        System.out.println("test");
        throw  new RuntimeException("tset wo");
    }
}

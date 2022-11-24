package springboot.one.hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @RequestMapping("/sup")
    public String sayHi() {
        return "Sup, dawg";
    }
}

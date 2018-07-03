package framework.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by speedjive at 17:26 on 2018/7/3
 */
@RestController
public class ExampleController {

    @RequestMapping("/")
    public String test() {
        return "test...";
    }
}

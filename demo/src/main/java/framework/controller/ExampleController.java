package framework.controller;

import framework.model.User;
import framework.model.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Created by speedjive at 17:26 on 2018/7/3
 */
@SuppressWarnings("SpringJavaAutowiredFieldsWarningInspection")
@RestController
public class ExampleController {

    @Autowired
    private UserRepository userRepository;

    @RequestMapping("/")
    public String test() {
        return "test...";
    }

    @RequestMapping(value = "/user",method = RequestMethod.GET)
    public User findUser() {
        return userRepository.findUser("b");
    }
}

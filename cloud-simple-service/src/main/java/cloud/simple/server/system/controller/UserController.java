package cloud.simple.server.system.controller;

import cloud.simple.server.system.domain.UserService;
import cloud.simple.server.system.model.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {
    private static final Logger logger = LoggerFactory.getLogger(UserController.class);

    @Autowired
    UserService userService;

    @RequestMapping(value = "/user", method = RequestMethod.GET)
    public List<User> readUserInfo() {
        List<User> ls = userService.searchAll();
        logger.info("===========================success");
        return ls;
    }


    @RequestMapping(value = "/hi", method = RequestMethod.GET)
    public String hi() {
        logger.info("===========================hi");
        return "hi";
    }
}

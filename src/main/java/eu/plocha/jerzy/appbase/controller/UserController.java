package eu.plocha.jerzy.appbase.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Slf4j
@Controller
public class UserController {

    @RequestMapping(method = RequestMethod.GET, value = "/hello")
    public String hello() {
        return "hello";
    }


    @RequestMapping(method = RequestMethod.GET, value = "/home")
    public String home() {
        return "home";
    }

    @RequestMapping(method = RequestMethod.GET, value = "/login")
    public String login() {
        return "login";
    }

    @RequestMapping(method = RequestMethod.GET, value = "/loginFail")
    public String failLogin() {
        return "loginFail";
    }

    @RequestMapping(method = RequestMethod.GET, value = "/")
    public String base() {
        return "home";
    }
}

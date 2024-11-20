package kz.nik.probnik.proba.controller;

import ch.qos.logback.core.model.Model;
import kz.nik.probnik.proba.service.UserService;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@RequiredArgsConstructor

public class HomeController {

    private final UserService userService;

    @GetMapping(value = "/")
    public String index(Model model) {
        return "index";
    }

    @GetMapping(value = "/signin")
    public String login(Model model) {
        return "signin";
    }

    @GetMapping(value = "/signup")
    public String signup(Model model) {
        return "signup";
    }

    @GetMapping(value = "/profile")
    public String profile(Model model) {
        return "profile";
    }

    @GetMapping(value = "/logout")
    public String logout(Model model) {
        return "logout";
    }

    @GetMapping(value = "/error")
    public String error(Model model) {
        return "error";
    }




}

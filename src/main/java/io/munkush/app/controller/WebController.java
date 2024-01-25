package io.munkush.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WebController {
    @GetMapping("/successful-page")
    public String success(){
        return "success";
    }
}

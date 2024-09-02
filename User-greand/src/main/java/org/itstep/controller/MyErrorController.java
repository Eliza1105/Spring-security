package org.itstep.controller;

import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyErrorController implements ErrorController {

    @GetMapping(value = "/403")
    public String denied(){
        return "403";
    }
    @RequestMapping("/error")
    public String handleError() {
        //do something like logging
        return "404";
    }
} 
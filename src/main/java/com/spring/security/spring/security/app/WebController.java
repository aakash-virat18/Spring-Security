package com.spring.security.spring.security.app;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebController {
    @RequestMapping("/")
    public String greet()
    {
        return "Hello World !";
    }
}

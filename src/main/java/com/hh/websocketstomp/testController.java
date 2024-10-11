package com.hh.websocketstomp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class testController {

    @GetMapping("/healthCheck")
    public String testCheck() {
        return "connect success";
    }
}

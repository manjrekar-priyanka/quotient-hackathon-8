package com.quotient.hackathon.Controller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HackathonController {

    private static Logger log = LogManager.getLogger(HackathonController.class);

    @RequestMapping("/")
    public String hello() {

        return "Hello!";
    }
}

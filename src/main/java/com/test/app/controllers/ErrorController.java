package com.test.app.controllers;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ErrorController {
    private static final Logger LOG = LogManager.getLogger(HomeController.class);

    @GetMapping("/error")
    public String error(){
        LOG.info("An http error has occurred");
        return "error";
    }
}

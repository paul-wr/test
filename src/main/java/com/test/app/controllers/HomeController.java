package com.test.app.controllers;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class HomeController {
    private static final Logger LOG = LogManager.getLogger(HomeController.class);

    @GetMapping("/")
    public String home(Model model){
        LOG.info("Getting home page.");

        model.addAttribute("test", true);
        return "home";
    }
}

package com.example.tokendemo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

@Controller
public class HomeController {

    private static final Logger logger = LoggerFactory.getLogger(HomeController.class);


    @GetMapping("/")
    public String home(Locale locale, Model model)
    {

        logger.info("welcome home ! client locale is {}.", locale);

        Date date = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE, yyyy년 MM월 dd일  HH:mm:ss Z");

        String nowDate = simpleDateFormat.format(date);

        logger.info("nowDate {}", nowDate);

        model.addAttribute("serverTime", nowDate);

        return "home";

    }

}

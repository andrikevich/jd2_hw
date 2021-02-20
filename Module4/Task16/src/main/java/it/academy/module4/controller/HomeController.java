package it.academy.module4.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController {


    @GetMapping("/page0")
    public String homePage(){
        return "page0";
    }

    @GetMapping("/page1")
    public String productsPage(ModelMap model) {
        return "page1";
    }

    @GetMapping("/page2")
    public String page2(){
        return "page2";
    }
}

package com.tracy.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;

@Controller
public class TestController {
    @GetMapping(value = "/index")
    public String promo() {

        return "index";
    }


    @GetMapping(value = "/sign")
    public String sign() {

        return "sign";
    }

    @GetMapping(value = "/deposit")
    public String deposit() {

        return "deposit";
    }
}

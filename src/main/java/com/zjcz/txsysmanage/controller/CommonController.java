package com.zjcz.txsysmanage.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class CommonController {

    @RequestMapping(value = "test")
    public @ResponseBody String Test(){
        return "111111111";
    }
}

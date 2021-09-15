package com.zjcz.txsysmanage.controller;

import com.zjcz.txsysmanage.service.BaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class CommonController {

    @Autowired
    private BaseService baseService;

    @RequestMapping(value = "test")
    public @ResponseBody String Test(){
        List list = baseService.Select();
        System.out.println(list);
        return "111111111";
    }
}

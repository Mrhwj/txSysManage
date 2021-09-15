package com.zjcz.txsysmanage.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BaseService {

    @Autowired
    JdbcTemplate jdbcTemplate;

    public List Select(){
        String sql = "select * from `user` where id=1";
        List list = jdbcTemplate.queryForList(sql);
        return list;
    }

}

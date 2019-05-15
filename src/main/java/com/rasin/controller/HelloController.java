package com.rasin.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @Description
 * @Author wangyu
 * @Date 2019/5/14 21:22
 */
@Slf4j
@RestController
public class HelloController {

    private static DateFormat dateFormator = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    @RequestMapping("/hello")
    public String hello(){
        Date d = new Date();
        log.info("hello");
        return dateFormator.format(d);
    }

}

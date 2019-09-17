package com.mr.wxsc.web.controller;

import com.mr.wxsc.service.DemoService;
import com.mr.wxsc.service.impl.DemoServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @Autowired
    private DemoServiceImpl demoServiceImpl;

    @GetMapping("/demo")
    public String demo(){
        return demoServiceImpl.test();
    }
}

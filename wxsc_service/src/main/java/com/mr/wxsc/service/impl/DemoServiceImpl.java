package com.mr.wxsc.service.impl;

import com.mr.wxsc.service.DemoService;
import org.springframework.stereotype.Service;

@Service
public class DemoServiceImpl implements DemoService {
    @Override
    public String test() {
        return "hello";
    }
}

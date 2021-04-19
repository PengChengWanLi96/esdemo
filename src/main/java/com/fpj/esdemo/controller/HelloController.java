package com.fpj.esdemo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author:FangPengJun
 * @Date:2021/4/19
 */
@RestController
@RequestMapping("/hello")
public class HelloController {

    @RequestMapping("index")
    public String getIndex(){
        return "index";
    }
}

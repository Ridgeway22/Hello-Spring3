package org.launchcode.hellospring3.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class hello {

    @RequestMapping(value = "" +)
    @ResponseBody
    public String index(){
        return "Hello world";
    }
}

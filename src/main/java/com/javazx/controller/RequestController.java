package com.javazx.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author: itmrchen
 * @Description:
 * @date 2019/7/30 0:55
 */
@Controller
public class RequestController {
    @RequestMapping("testRequest")
    @ResponseBody
    public String test() {
        return this.toString();
    }
}

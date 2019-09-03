package com.javazx.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author: itmrchen
 * @Description:
 * @date 2019/9/4 1:40
 */
@Controller
public class SessionController {
    @RequestMapping("testSession")
    @ResponseBody
    public String test() {
        return this.toString();
    }
}

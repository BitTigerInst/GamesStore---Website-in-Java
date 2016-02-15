package com.totoro.appstore.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by ruihanzou on 2/15/16.
 */
@Controller
public class AppStoresController {
    @RequestMapping("/")
    @ResponseBody
    public String listApps(){
        return "list of all the Apps";
    }
}

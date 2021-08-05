package com.zouli.freemakerdemo.controller;

import com.zouli.freemakerdemo.config.Resource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author leocathy
 */

// @RestController 不能用该注解，无法返回web页面
@Controller
public class FreemarkerController {
    @Autowired
    private Resource resource;

    @GetMapping("/")
    public String index(ModelMap map) {
        map.addAttribute("resource", resource);
        return "index";
    }
}

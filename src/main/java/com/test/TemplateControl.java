package com.test;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

@Controller
@EnableAutoConfiguration
public class TemplateControl {

    @RequestMapping("/helloTemplate/{name}")
    public String hello(@PathVariable("name") String name, Model model) {
        System.out.println(name);
        model.addAttribute("name", name);
        Map map = model.asMap();

        System.out.println(map.get("name"));
        return "Hello";
    }
}

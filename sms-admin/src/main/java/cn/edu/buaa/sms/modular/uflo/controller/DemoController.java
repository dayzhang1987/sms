package cn.edu.buaa.sms.modular.uflo.controller;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/demoController")
public class DemoController {

    public String str() {
        return "fff";
    }
}

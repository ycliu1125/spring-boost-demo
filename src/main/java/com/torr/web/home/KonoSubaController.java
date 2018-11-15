package com.torr.web.home;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/konosuba")
public class KonoSubaController {

    @RequestMapping("/index")
    public String konosuba() {

        return "index.html";
    }
}

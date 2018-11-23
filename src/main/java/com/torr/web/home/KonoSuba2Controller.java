package com.torr.web.home;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("")
public class KonoSuba2Controller {

    @RequestMapping("/index")
    public String konosuba2(){
        return "index.html";
    }

    //維護介面
    @RequestMapping("/maintain")
    public String maintain(){
        return "maintain.html";
    }


}

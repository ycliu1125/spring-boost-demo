package com.torr.web.home;


import com.torr.domain.KonoSuba;
import com.torr.service.KonoSubaService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.validation.Valid;

@Controller
@RequestMapping("")
public class KonoSuba2Controller {

    @Resource
    private KonoSubaService konoSubaService;

    @RequestMapping("/index")
    public String konosuba2(){
        return "index.html";
    }

    //POST 處理新增
    @PostMapping("/maintain")
    public String save(
            @Valid @ModelAttribute("main") KonoSuba main,
            BindingResult bindingResult,
            Model model){
        String willReturn = "pages/maintain.html";
        if (bindingResult.hasErrors()) {
            willReturn = "pages/maintain.html";
        } else {
            konoSubaService.insert(main);
        }
        return willReturn;
    }


}

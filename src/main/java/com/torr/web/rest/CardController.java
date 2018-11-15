package com.torr.web.rest;

import com.torr.domain.KonoSuba;
import com.torr.service.KonoSubaService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/rest")
public class CardController {
    @Resource
    private KonoSubaService konoSubaService;

    @GetMapping("card")
    public List<KonoSuba> findAll() {
        return konoSubaService.findAll();
    }
}

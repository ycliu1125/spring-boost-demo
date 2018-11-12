package com.torr.service;

import com.torr.domain.KonoSuba;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import javax.transaction.Transactional;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringRunner.class)
@SpringBootTest
@Transactional
public class KonoSubaServiceTest {

    @Resource
    private KonoSubaService konoSubaService;

    @Test
    public void testKonosuba(){
        //新增
        KonoSuba card1 = new KonoSuba();
        card1.setCardId("2020");
        card1.setName("Alice");
        card1.setHp(3865);
        card1.setAtk(2487);
        card1.setRec(655);
        card1.setSex(false);
        card1.setRace("Human");
        System.err.println(card1);
        card1 = konoSubaService.insert(card1);
        assertThat(card1).isNotNull();
        System.err.println(card1);

        //查詢By Id
        KonoSuba target =konoSubaService.findOne("2020");
        assertThat(target).isNotNull();
        System.err.println(target);

        //修改
        target.setName("Gill");
        target.setHp(6666);
        KonoSuba target2 = konoSubaService.update(target);
        assertThat(target2).isNotNull();
        System.err.println(target2);

        //查詢By Name
        KonoSuba target3 = konoSubaService.findOneByName("Gill");
        assertThat(target3).isNotNull();
        System.err.println(target3);

        //模糊查詢
        //List<KonoSuba> cards = new ArrayList<>();


        //刪除
        konoSubaService.delete(target3);
        KonoSuba target4 = konoSubaService.findOne("2020");
        assertThat(target4).isNull();
        System.err.println(target4);
    }
}

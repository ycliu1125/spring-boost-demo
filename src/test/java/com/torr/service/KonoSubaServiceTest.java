package com.torr.service;

import com.torr.domain.KonoSuba;
import com.torr.service.impl.KonoSubaServiceImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringRunner.class)
@SpringBootTest
public class KonoSubaServiceTest {

    @Resource
    private KonoSubaServiceImpl konoSubaServiceImpl;

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
        konoSubaServiceImpl.insert(card1);
        assertThat(card1).isNotNull();
        System.out.println(card1);

        //查詢By Id
        KonoSuba target =konoSubaServiceImpl.findOne("2020");
        assertThat(target).isNotNull();
        System.out.println(target);

        //修改
        target.setName("Gill");
        target.setHp(6666);
        KonoSuba target2 = konoSubaServiceImpl.update(target);
        assertThat(target2).isNotNull();
        System.out.println(target2);

        //查詢By Name
        KonoSuba target3 = konoSubaServiceImpl.findOneByName("Gill");
        assertThat(target3).isNotNull();
        System.out.println(target3);

        //刪除
        konoSubaServiceImpl.delete(target3);
        KonoSuba target4 = konoSubaServiceImpl.findOne("2020");
        assertThat(target4).isNull();
        System.out.println(target4);
    }
}

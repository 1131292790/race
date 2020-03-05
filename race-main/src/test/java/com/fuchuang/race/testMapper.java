package com.fuchuang.race;

import com.fuchuang.race.mapper.AppUserMapper;
import com.fuchuang.race.model.AppUser;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = RaceMainApplication.class)
public class testMapper {

    @Autowired
    private AppUserMapper appUserMapper;

    @Test
    public void testAppUserMapper(){
        AppUser login = appUserMapper.selectByPrimaryKey("1");
        AppUser login1 = appUserMapper.login("1", "12345");
        appUserMapper.updatePwdByUserId("1","123456");

        System.out.println(login);
        System.out.println(login1);
    }

}


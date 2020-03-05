package com.fuchuang.race.service.impl;

import com.fuchuang.race.mapper.AppUserMapper;
import com.fuchuang.race.model.AppUser;
import com.fuchuang.race.service.AppUserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class AppUserServiceImpl implements AppUserService {
    @Resource
    private AppUserMapper appUserMapper;

    /**
     * 登录
     * @param userid
     * @param userpwd
     * @return
     */
    public AppUser login(String userid, String userpwd){
        return appUserMapper.login(userid,userpwd);
    }


    public int insert(AppUser record){
        return appUserMapper.insert(record);
    }

    public int deleteByPrimaryKey(String userId){
        return appUserMapper.deleteByPrimaryKey(userId);
    }

    /**
     * 注册
     * @param record
     * @return
     */

    public int insertSelective(AppUser record){
        return appUserMapper.insertSelective(record);
    }

    public AppUser selectByPrimaryKey(String userId){
        return appUserMapper.selectByPrimaryKey(userId);
    }

    /**
     * 修改信息
     * @param record
     * @return
     */
    public int updateByPrimaryKeySelective(AppUser record){
        return appUserMapper.updateByPrimaryKeySelective(record);
    }

    public int updateByPrimaryKey(AppUser record){
        return appUserMapper.updateByPrimaryKey(record);
    }

    @Override
    public int updatePwdByUserId(String userid, String password) {
        return appUserMapper.updatePwdByUserId(userid,password);
    }
}

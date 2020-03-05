package com.fuchuang.race.service;
import com.fuchuang.race.model.AppUser;
import org.apache.ibatis.annotations.Param;

public interface AppUserService {

    /**
     * 登录
     * @param userid
     * @param userpwd
     * @return
     */
    AppUser login(String userid,String userpwd);


    int insert(AppUser record);

    int deleteByPrimaryKey(String userId);

    /**
     * 注册
     * @param record
     * @return
     */

    int insertSelective(AppUser record);
    AppUser selectByPrimaryKey(String userId);

    /**
     * 修改信息
     * @param record
     * @return
     */
    int updateByPrimaryKeySelective(AppUser record);

    int updateByPrimaryKey(AppUser record);

    int updatePwdByUserId(String userid,String password);

}

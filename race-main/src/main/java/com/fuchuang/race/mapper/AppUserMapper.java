package com.fuchuang.race.mapper;


import com.fuchuang.race.model.AppUser;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface AppUserMapper {
    /**
     * 登录
     * @param userid 账号
     * @param password 密码
     * @return
     */
    AppUser login(@Param("userId")String userid,@Param("passWord")String password);

    /**
     * 注册
     * @param record
     * @return
     */
    int insert(AppUser record);

    int deleteByPrimaryKey(String userId);

    int insertSelective(AppUser record);

    AppUser selectByPrimaryKey(String userId);

    int updateByPrimaryKeySelective(AppUser record);

    int updateByPrimaryKey(AppUser record);

    int updatePwdByUserId(@Param("userId") String userid,@Param("passWord") String password);
}
package com.gq.dao;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.gq.beans.PeRole;
import com.gq.beans.SsoUser;
@Repository("ssoUserMapper")
public interface SsoUserMapper {
	//添加用户
	int insert(SsoUser ssoUser);
	//通过用户名查询用户信息
    SsoUser selectByLoginId(String loginId);
    //更新用户信息
    int updateByPrimaryKey(SsoUser ssoUser);
    //查询所有的用户角色
    List<PeRole> selectAllRole(Integer isvalide);
   //查询所有有效用户
    List<SsoUser> selectAllSsoUse(Integer isvalide);
}
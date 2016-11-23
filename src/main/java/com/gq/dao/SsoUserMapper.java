package com.gq.dao;

import org.springframework.stereotype.Repository;

import com.gq.beans.SsoUser;
@Repository("ssoUserMapper")
public interface SsoUserMapper {

  /*  int deleteByPrimaryKey(Integer id);

   

    int insertSelective(SsoUser record);


    SsoUser selectByPrimaryKey(Integer id);*/
	int insert(SsoUser ssoUser);
    SsoUser selectByLoginId(String loginId);
    int updateByPrimaryKey(SsoUser ssoUser);
	/*
    int updateByPrimaryKeySelective(SsoUser record);

    int updateByPrimaryKey(SsoUser record);*/
}
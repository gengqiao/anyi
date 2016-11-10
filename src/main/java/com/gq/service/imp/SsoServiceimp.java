package com.gq.service.imp;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.gq.beans.SsoUser;
import com.gq.dao.SsoUserMapper;
import com.gq.service.SsoService;
@Service("ssoServiceimp")
public class SsoServiceimp implements SsoService {
@Resource 
SsoUserMapper ssoUserMapper;
	@Override
	public Boolean checkLogin(SsoUser ssouser) {
		String loginId=ssouser.getLoginid();
		String password=ssouser.getPassword();
		SsoUser	s=ssoUserMapper.selectByPrimaryKey(11);
		if(s!=null&&password.equals(s.getPassword())){
			return true ;
		}else{
			return false;
		}
		
	}

}

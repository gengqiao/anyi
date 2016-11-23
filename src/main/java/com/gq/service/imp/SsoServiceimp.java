package com.gq.service.imp;

import java.util.Date;

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
	public SsoUser checkLogin(SsoUser ssouser) {
		String loginId=ssouser.getLoginid();
		String password=ssouser.getPassword();
		SsoUser	s=ssoUserMapper.selectByLoginId(loginId);
		if(s!=null&&password.equals(s.getPassword())){
		  //如果验证通过则更新登录次数，以及最后登录时间
		  int loginNum=s.getLoginnum()==null?1:s.getLoginnum()+1;
		  s.setLoginnum(loginNum);
		  s.setLastlogindate(new Date ());
		  ssoUserMapper.updateByPrimaryKey(s);
		}
		return s;
	}

}

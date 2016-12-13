package com.gq.service.imp;

import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.gq.beans.PeRole;
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
	@Override
	public int addUser(SsoUser ssoUser) {
		return ssoUserMapper.insert(ssoUser);
	}
	@Override
	public SsoUser selectByLoginId(String loginId) {
		// TODO Auto-generated method stub
		return ssoUserMapper.selectByLoginId(loginId);
	}
	@Override
	public List<PeRole> selectValideRole() {
		//只查询有效数据
		Integer isvalide=0;
		return ssoUserMapper.selectAllRole(isvalide);
	}
	public List<SsoUser> selectValideUser(){
		//只查询有效数据 
		Integer isvalide=0;
		return ssoUserMapper.selectAllSsoUse(isvalide);
	}
	@Override
	public int delectUserById(Integer id) {
		// TODO Auto-generated method stub
		return ssoUserMapper.delectUserById(id);
	}
	@Override
	public int updateByPrimaryKey(SsoUser ssoUser) {
		// TODO Auto-generated method stub
		return  ssoUserMapper.updateByPrimaryKey(ssoUser);
	}
	@Override
	public SsoUser selectSsoUseById(Integer id) {
		// TODO Auto-generated method stub
		return ssoUserMapper.selectSsoUseById(id);
	}

}

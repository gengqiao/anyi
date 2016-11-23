package com.gq.service;


import com.gq.beans.SsoUser;

public interface SsoService {
	//验证用户信息，并更新登录状态
   public SsoUser checkLogin(SsoUser ssouser);
}

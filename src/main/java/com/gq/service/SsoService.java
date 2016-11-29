package com.gq.service;


import java.util.List;

import com.gq.beans.PeRole;
import com.gq.beans.SsoUser;

public interface SsoService {
	/**
	 * 验证用户信息，并更新登录状态
	 * @param ssoUser
	 * @return
	 */
   public SsoUser checkLogin(SsoUser ssoUser);
   /**
    * 添加新用户
    * @param ssoUser
    * @return
    */
   public int addUser(SsoUser ssoUser);
   /**
    * 通过用户名查询用户信息
    * @param loginId
    * @return
    */
   public SsoUser selectByLoginId(String loginId);
   /**
    * 查询所有有效地角色信息
    * @return
    */
   public List<PeRole> selectValideRole();
   /**
    * 查询有效的用户
    * @return
    */
   public List<SsoUser> selectValideUser();
}

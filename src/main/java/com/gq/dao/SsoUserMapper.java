package com.gq.dao;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.gq.beans.PeRole;
import com.gq.beans.SsoUser;
@Repository("ssoUserMapper")
public interface SsoUserMapper {
	/**
	 * 添加用户
	 * @param ssoUser
	 * @return
	 */
	int insert(SsoUser ssoUser);
	
	/**
	 * 根据id查询用户
	 * @param id
	 * @return
	 */
	SsoUser selectSsoUseById(Integer id);
	/**
	 * 通过用户名查询用户信息
	 * @param loginId
	 * @return
	 */
    SsoUser selectByLoginId(String loginId);
    /**
     * 更新用户信息
     * @param ssoUser
     * @return
     */
    int updateByPrimaryKey(SsoUser ssoUser);
    /**
     * 查询所有的用户角色
     * @param isvalide
     * @return
     */
    List<PeRole> selectAllRole(Integer isvalide);
   /**
    * 查询所有有效用户
    * @param isvalide
    * @return
    */
    List<SsoUser> selectAllSsoUse(Integer isvalide);
    /**
     * 删除用户
     * @param id
     * @return
     */
    public int delectUserById(Integer id);
}
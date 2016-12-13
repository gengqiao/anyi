package com.gq.handlers;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.apache.commons.lang.StringUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.gq.beans.PeRole;
import com.gq.beans.SsoUser;
import com.gq.constant.SsoConstant;
import com.gq.service.SsoService;
import com.gq.util.SendEmail;

@Controller
@RequestMapping("/sso")
public class UserController extends BaseController{
	@Resource(name = "ssoServiceimp")
	SsoService ssoService;
	
	/**
	 * 通过用户id更新用户信息
	 * @param id
	 * @return
	 */
	@ResponseBody  
	@RequestMapping(value = "/updateUserById")
	public Object updateUserById(SsoUser ssoUser){
		int i=ssoService.updateByPrimaryKey(ssoUser);
		if(i==1){
		 return true;
		}
		return false; 
	}
	/**
	 * 通过用户id删除用户
	 * @param id
	 * @return
	 */
	@ResponseBody  
	@RequestMapping(value = "/delectUserById")
	public Object delectUserById(Integer id){
		int i=ssoService.delectUserById(id);
		if(i==1){
		return true;
		}
		return false; 
	}
	
	/**
	 * 展示用户列表
	 * @return
	 */
	@RequestMapping(value = "/showUser")
	public String showUser(){
		List<SsoUser>	userList=new ArrayList<SsoUser>();
		userList=ssoService.selectValideUser();
		request.setAttribute("userList", userList);
		return "/user/showUser.jsp";
	}
	/**
	 * 查询有效的角色
	 * @return
	 */
	@ResponseBody  
	@RequestMapping(value = "/selectValideRole")
	public Object selectValideRole(){
	List<PeRole> rlist=	ssoService.selectValideRole();
	 return rlist;
	}
	
	/**
	 * 更新密码
	 * @param oldPass 旧密码
	 * @param newPass 新密码
	 * @param flag	状态为1时，验证密码是否正确 其余为修改密码
	 * @return
	 */
	@ResponseBody  
	@RequestMapping(value = "/changePassWord")
	public Object changePassWord(String oldPass,String newPass,String flag){
		SsoUser ssoUser=(SsoUser)session.getAttribute(SsoConstant.SSO_USER_SESSION);
		Map<String,String> map=new HashMap<String,String>();
		if("1".equals(flag)){
			if(oldPass.equals(ssoUser.getPassword())){
				map.put("getdata", "true");
			}else{
				map.put("getdata", "false");
			}
		}else{
			ssoUser.setPassword(newPass);
			int i=	ssoService.updateByPrimaryKey(ssoUser);
			if(1==i){
			 map.put("success", "true");
			 session.setAttribute(SsoConstant.SSO_USER_SESSION, ssoUser);
			}else{
			  map.put("success", "false");  
		  }
		}
		return map;
	}
	
	/**
	 * 添加用户时判断用户名是否重复
	 * @param loginId
	 * @return
	 */
	@ResponseBody  
	@RequestMapping(value = "/checkLoginId")
	public Object checkLoginId(String loginId){
		SsoUser ssoUser= ssoService.selectByLoginId(loginId);
		Map<String,String> map=new HashMap<String,String>();
		if(ssoUser!=null&&loginId.equals(ssoUser.getLoginid())){
			map.put("getdata", "false");
		}else{
			map.put("getdata", "true");
		}
		return map;
	}
	/**
	 * 新添加用户
	 * @param ssoUser
	 * @return
	 */
	@ResponseBody  
	@RequestMapping(value = "/addUser")
	public Object addUser(SsoUser ssoUser){
		//设置默认值为有效
		ssoUser.setIsvalide(0);
	   int i=ssoService.addUser(ssoUser);
	   Map<String,Boolean> map=new HashMap<String,Boolean>();
	   if(i==1){
		   map.put("success", true);
		   SendEmail.sendOnRegsterSuccess(ssoUser.getEmail(), ssoUser.getLoginid(),  ssoUser.getPassword());
	   }else{
		   map.put("success", false);
	   }
	   return map;
	}
	/**
	 * 用户退出登录
	 * @return
	 */
	@RequestMapping(value = "/loginOut")
	public String loginOut(){
		session.removeAttribute(SsoConstant.SSO_USER_SESSION);
		return "/login.jsp";
	}
	/**
	 * 用户登录
	 * @param ssoUser
	 * @return
	 */
	@RequestMapping(value = "/login")
	public String login(SsoUser ssoUser) {
		String authCode=request.getParameter("authCode");
		if(StringUtils.isNotEmpty(authCode)&&!authCode.equals(session.getAttribute(SsoConstant.AUTH_CODE))){
			 request.setAttribute("msg", "验证码错误，请重新输入");
			 return "/login.jsp";
		 }
		 SsoUser newUser= ssoService.checkLogin(ssoUser);
		 if(newUser==null){
			 request.setAttribute("msg", "该用户名不存在，请检查用户名是否正确。");
			 return "/login.jsp";
		 }else if(ssoUser.getPassword().equals(newUser.getPassword())){
			 //将登录状态放在session中
			 session.setAttribute(SsoConstant.SSO_USER_SESSION, newUser);
		 }else{
			 request.setAttribute("msg", "密码错误，请重新输入");
			 return "/login.jsp"; 
		 }
		return "/index.html";
	}
}

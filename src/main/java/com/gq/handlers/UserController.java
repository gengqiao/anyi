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

@Controller
@RequestMapping("/sso")
public class UserController extends BaseController{
	@Resource(name = "ssoServiceimp")
	SsoService ssoService;
	
	private List<SsoUser> userList;
	/**
	 * 展示用户列表
	 * @return
	 */
	@RequestMapping(value = "/showUser")
	public String showUser(){
		userList=new ArrayList<SsoUser>();
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
	   Map map=new HashMap();
	   if(i==1){
		   map.put("success", true);
	   }else{
		   map.put("success", false);
	   }
	   return map;
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

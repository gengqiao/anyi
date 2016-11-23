package com.gq.handlers;

import javax.annotation.Resource;

import org.apache.commons.lang.StringUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.gq.beans.SsoUser;
import com.gq.constant.SsoConstant;
import com.gq.service.SsoService;

@Controller
@RequestMapping("/sso")
public class LoginController extends BaseController{
	@Resource(name = "ssoServiceimp")
	SsoService ssoService;
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

package com.gq.handlers;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.gq.beans.SsoUser;
import com.gq.service.SsoService;


@Controller
@RequestMapping("/sso")
public class LoginController  {
	@Resource (name="ssoServiceimp")
	SsoService ssoService;
@RequestMapping(value="/login")
public String login(SsoUser ssoUser){
	
 Boolean flag=ssoService.checkLogin(ssoUser);
   System.out.println("-----------------"+flag);
	return "welcom";
}

}

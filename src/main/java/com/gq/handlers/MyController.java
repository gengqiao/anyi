package com.gq.handlers;

import java.util.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;


@Controller
@RequestMapping("/test")
public class MyController implements org.springframework.web.servlet.mvc.Controller {
	//@Resource(name="studentService")
	//private IStudentService service;
	

/*	@RequestMapping(value="/register.do")
	public String doRegister(Student student){
		System.out.print("ssssssssssss");
		service.addStudent(student);
		
		return "welcome";
	}*/
	@RequestMapping("/list")
	public ModelAndView test(HttpServletRequest request,HttpServletResponse response){
		return null;
	}
	/*@RequestMapping("/{pname}/{age}/test2.do")
	public ModelAndView test2(@PathVariable("pname") String name, @PathVariable int age){
		return null;
	}*/
	/**
	 * 返回json
	 * @return
	 */
	@ResponseBody
	@RequestMapping(value="/test3.do")
	
	public Object test3(){
		Map map=new HashMap();
		map.put("22key", "22value");
		Map m=new HashMap();
		m.put("11", "11value");
		map.put("key", m);
		return map;
	}
	/**
	 * 异常处理
	 */
	@ExceptionHandler()
	
	
	
	
	
	public ModelAndView handleRequest(HttpServletRequest arg0,
			HttpServletResponse arg1) throws Exception {
		ModelAndView mv=new ModelAndView();
		mv.addObject("welcome", "hellow");
		mv.setViewName("WEB-INF/welcome.jsp");
		return mv;
	}

}

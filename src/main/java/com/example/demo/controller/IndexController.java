package com.example.demo.controller;


import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.util.JSONResult;

@Controller
@RequestMapping("/")
public class IndexController {
	
	@RequestMapping("/")
    public String firstPage(){
        
		return "login";

    }
	
	@RequestMapping("/login")
	@ResponseBody
	public JSONResult login(String username,String password
			,HttpServletRequest request, HttpServletResponse response){
		if ("admin".equals(username) && "123".equals(password)) {
			request.getSession().setAttribute("username", username);
			return JSONResult.ok("登录成功");
		}
		return JSONResult.errorMsg("登录失败");
	}
	
	//跳转到index.jsp页面
	@RequestMapping("/index")
	public String index(HttpServletRequest request, HttpServletResponse response) throws IOException {
		if (request.getSession().getAttribute("username")==null) {
			response.sendRedirect(request.getContextPath()+"/");
		}
		return "index";
	}
	
	
}

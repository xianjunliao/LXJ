package cn.lxj.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping
public class IndexController {

	@RequestMapping(value="/index",method=RequestMethod.GET)
	public String list(String p1,HttpServletRequest request) {
		System.out.println(p1);
		System.out.println("aaaa");
		return "index";
	}
	@RequestMapping("/login")
	public String login(String username,String password,HttpServletRequest request) {
		System.out.println(username+": "+password);
		request.setAttribute("ok", "되쩌냥묘haha가가가가가가가가가가가가가hah！");
		return "index";
	}
}

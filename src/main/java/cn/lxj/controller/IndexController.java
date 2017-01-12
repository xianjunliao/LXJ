package cn.lxj.controller;

import java.io.UnsupportedEncodingException;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping
public class IndexController {

	@RequestMapping(value="/index",method=RequestMethod.POST)
	public String list(String p1,HttpServletRequest request) {
		return "index";
	}
	@RequestMapping(value="/login",method=RequestMethod.POST)
	public String login(String username,String password,HttpServletRequest request) throws UnsupportedEncodingException {
		String string = "£ºµÇÂ¼³É¹¦";
		System.out.println("AAAA1:"+string);
//			ChangeCharset.toUTF_8(string);
		System.out.println("AAAA2:"+string);
		request.setAttribute("ok", string);
		return "index";
	}
}

package com.joypupil.study.application;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestController {
	
	@Autowired
	TestSetting wdSetting;
	
	@RequestMapping("/")
	public String welcome(Map<String, Object> model, HttpServletRequest request) {
		return "index";
	}
}

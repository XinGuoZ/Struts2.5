package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.po.Admin;
import com.services.AdminService;

@Controller
public class AdminController {
	
	@Autowired
	private AdminService adminservice;
	
	@Value("${FTP_ADDRESS}")
	private String test;
	@ResponseBody
	@RequestMapping("test")
	public String test() {
		Admin admin = new Admin();
		admin.setAdminname("admin");
		admin.setUserpass(test);
		admin.setState(1);
		adminservice.insert(admin);
		return"sucess";
	}
}

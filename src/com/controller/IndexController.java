package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.po.SInfo;

@Controller
public class IndexController {

	@RequestMapping(value="indexp")
	public String Index(SInfo info) {
		System.out.println(info.getName());
		return"../st/index";
	}
}

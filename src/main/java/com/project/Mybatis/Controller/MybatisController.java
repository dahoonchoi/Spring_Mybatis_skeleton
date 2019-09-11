package com.project.Mybatis.Controller;

import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MybatisController {

	@RequestMapping(value = "/")
	public String index() {

		return "index";
	}

}

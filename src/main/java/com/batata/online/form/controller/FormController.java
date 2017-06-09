package com.batata.online.form.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/form/")
public class FormController {

	@ResponseBody
	@RequestMapping("test.do")
	public String test() {

		return "test";
	}
}

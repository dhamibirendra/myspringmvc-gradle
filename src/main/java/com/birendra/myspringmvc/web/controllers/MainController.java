package com.birendra.myspringmvc.web.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {

	@RequestMapping(method = RequestMethod.GET, value = "/")
	public String getHome(ModelMap modelMap) {

		return "main";
	}

//	@RequestMapping(method = RequestMethod.GET, value = "/")
//	public String getHome(ModelMap modelMap, @RequestParam(value = "errormessage", required = false) String errormessage, @RequestParam(value = "infomessage", required = false) String infomessage,
//			@RequestParam(value = "msg", required = false) String msg) {
//
//		return "redirect:/main";
//
//	}

}

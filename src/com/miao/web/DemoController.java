package com.miao.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.miao.common.web.BaseController;
import com.miao.service.DemoService;

@Controller
@RequestMapping("demo")
public class DemoController extends BaseController {
	@Autowired
	private DemoService demoService;
	@RequestMapping("demo")
	public ModelAndView demo(){
		ModelAndView m = new ModelAndView();
		m.addObject("a","d");
		m.addObject("b", "c");
		m.getModelMap().addAttribute("x","y");
		m.getModel().put("1",demoService.demo());
		return m;
	}
	@RequestMapping("demojsp")
	public ModelAndView demojsp(){
		ModelAndView m = new ModelAndView();
		m.addObject("a","d");
		m.getModelMap().addAttribute("x","y");
		return m;
	} 
}

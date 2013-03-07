package com.miao.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.miao.common.web.BaseController;
import com.miao.model.Demox;
import com.miao.service.DemoxService;


@Controller
@RequestMapping("demo")
public class DemoxController extends BaseController {
	
	@Autowired
	private DemoxService demoxService;
	
	@RequestMapping("save")
	public ModelAndView save(
			
	){
		
		ModelAndView m = new ModelAndView();
		Demox de = new Demox();
		de.setAge(19);
		de.setName("demo");
		de.setSex("M");
		demoxService.save(de);
		m.addObject("success", true);
		return m;
	}
}

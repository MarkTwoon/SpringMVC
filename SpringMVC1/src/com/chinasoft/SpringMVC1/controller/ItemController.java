package com.chinasoft.SpringMVC1.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.chinasoft.SpringMVC1.pojo.Items;

@Controller
@RequestMapping("/")
public class ItemController {
	 @RequestMapping(value = "/itemlist")
	    public ModelAndView itemList(HttpServletRequest request) {

	        // 创建页面需要显示的商品数据(模拟从数据库中取出)
	        List<Items> list = new ArrayList<Items>();
	        list.add(new Items(1, "1华为 荣耀", 2399f, new Date(), "质量好！1"));
	        list.add(new Items(2, "2华为 荣耀", 2399f, new Date(), "质量好！2"));
	        list.add(new Items(3, "3华为 荣耀", 2399f, new Date(), "质量好！3"));
	        list.add(new Items(4, "4华为 荣耀", 2399f, new Date(), "质量好！4"));
	        list.add(new Items(5, "5华为 荣耀", 2399f, new Date(), "质量好！5"));
	        list.add(new Items(6, "6华为 荣耀", 2399f, new Date(), "质量好！6"));

	        /*ModelAndView mav = new ModelAndView();
	        mav.addObject("itemList", list);
	        mav.setViewName("index");*/
	       request.setAttribute("itemList", list);
	        return new ModelAndView("index");
	    }
}

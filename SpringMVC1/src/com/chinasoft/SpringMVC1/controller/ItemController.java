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

	        // ����ҳ����Ҫ��ʾ����Ʒ����(ģ������ݿ���ȡ��)
	        List<Items> list = new ArrayList<Items>();
	        list.add(new Items(1, "1��Ϊ ��ҫ", 2399f, new Date(), "�����ã�1"));
	        list.add(new Items(2, "2��Ϊ ��ҫ", 2399f, new Date(), "�����ã�2"));
	        list.add(new Items(3, "3��Ϊ ��ҫ", 2399f, new Date(), "�����ã�3"));
	        list.add(new Items(4, "4��Ϊ ��ҫ", 2399f, new Date(), "�����ã�4"));
	        list.add(new Items(5, "5��Ϊ ��ҫ", 2399f, new Date(), "�����ã�5"));
	        list.add(new Items(6, "6��Ϊ ��ҫ", 2399f, new Date(), "�����ã�6"));

	        /*ModelAndView mav = new ModelAndView();
	        mav.addObject("itemList", list);
	        mav.setViewName("index");*/
	       request.setAttribute("itemList", list);
	        return new ModelAndView("index");
	    }
}

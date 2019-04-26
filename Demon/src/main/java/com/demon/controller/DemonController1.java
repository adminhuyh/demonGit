package com.demon.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.demon.service.DemonService;
@Controller
@RequestMapping("/demon1")
public class DemonController1{
	
	@Autowired
	@Qualifier
	private DemonService demonService;
	
	@RequestMapping("/getUser1")
    @ResponseBody
	public Map<String,Object> getUser1(){
	   Map map =new HashMap<String, Object>();
			   map.put("status", "ok");
	   return map;		   
			  
	}
	
	@RequestMapping("/getUser2")
	public void getUser2(){
	   System.out.println("xcxcxxc");
	}
			  
	@RequestMapping("/query")
	public void query(){
	   System.out.println("xcxcxxc");
	   demonService.query();
	}
}

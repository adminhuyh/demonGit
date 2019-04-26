package com.demon.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/demon")
public class DemonController {

	@RequestMapping("/getUser")
	public Map<String,Object> getUser(){
	   Map map =new HashMap<String, Object>();
			   map.put("status", "ok");
	   return map;		   
			  
	}
}

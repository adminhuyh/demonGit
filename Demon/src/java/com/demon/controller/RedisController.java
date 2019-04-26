package com.demon.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.demon.service.DemonService;
import com.demon.serviceImp.CacheService;
@Controller
@RequestMapping("/redis")
public class RedisController{
	/**jkkdfjdkfd
	
	*/
	@Autowired
	private CacheService cacheService;
	
	@RequestMapping("/save")
	@ResponseBody
	public String save(String key,String value){
		
		cacheService.saveCache(key, value);
		return "success";
	}
	
	
	@RequestMapping("/getSave")
	@ResponseBody
	public String getQueyr(String key){
		Object o = cacheService.getCache(key);
		return o.toString();
	}
	
	

	@RequestMapping("/saveRedis")
	@ResponseBody
	public String saveRedis(String key,String value){
		
		cacheService.saveJedis(key, value);
		return "success";
	}
	
	
	@RequestMapping("/getSaveRedis")
	@ResponseBody
	public String getSaveRedis(String key){
		Object o = cacheService.getDedis(key);
		return o.toString();
	}
	
}

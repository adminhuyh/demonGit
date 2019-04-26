package com.demon.serviceImp;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.demon.service.DemonService;
@Service
@Qualifier("/a")
public class DemonServiceImpl2 implements DemonService{

	public void query() {
		System.out.println("555555555545");		
	}

	
}

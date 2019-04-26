package com.demon.serviceImp;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.demon.service.DemonService;
@Service
@Qualifier()
public class DemonServiceImpl implements DemonService{

	public void query() {
		System.out.println("qjeyr");		
	}

	
}

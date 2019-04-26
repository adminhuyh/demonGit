package com.demon;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Bean;
import org.springframework.test.context.junit4.SpringRunner;

import com.demon.domain.User;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ApplicationTests {
   
	@Autowired
	private User user;
	
	@Test
	public void loadContext(){
		System.out.println('x');
		
	}
	@org.junit.Before
    public void Before(){
    	System.out.println("before");
    	
    }
	@org.junit.After
    public void After(){
    	System.out.println("after");
    	
    	System.out.println(user.getId());
    	
    	user.setId(23);
    	System.out.println(user.getId());
    	
    }
	
	
	
}

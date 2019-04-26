package com.demon.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.demon.domain.User;

@Configuration
public class MyConfig {
	public MyConfig(){
		System.out.println("myconiffg infdfjd");
	}
    /**
     * dklflkf
     * @Title: getUser
     * @Description: (这里用一句话描述这个方法的作用)
     * @return User (这里描述输出参数的作用)
     * @throws
     * @author zslt_hyh
     * @date 2019年4月26日 下午5:06:34
     */
	@Bean
	public User getUser(){
		User user = new User();
		user.setId(1);
		return user;
	}
	
	/**dnmf对面，nf
	 * kjkdgdflflsd
	 * dklfjdklf
	 * kdfjdf
	
	
	 * GIfnmdf,dsT LERANR IS VERY GOOD
	 * FKLDSFJKAFJKSLAF
	 * jkdfjdslafd
	 * fldflkasfl
	 * iujgjkjg
	 * sdgjkfjgslgslg
	 * fgkfglsgdjgk
	 */
	

}

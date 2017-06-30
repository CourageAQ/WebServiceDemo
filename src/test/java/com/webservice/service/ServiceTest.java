package com.webservice.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
/***
 * 
 * @author Eternity
 *	先启动服务，然后使用单元测试，测试接口程序是否正常
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath*:applicationContext*.xml"})
public class ServiceTest {
	
	@Autowired
	private com.webservice.client.WebServices testService;
	
	@Test
	public void test(){
		System.out.println(testService.sayHello(" good afternoon"));
		System.out.println(testService.save("user", "pwd"));
	}
	

}

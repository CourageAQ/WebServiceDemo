package com.webservice.service;

import javax.jws.WebService;

@WebService
public class WebServiceImpl implements IWebService {

	@Override
	public String sayHello(String string) {
		System.out.println("传递的参数是：" + string);
		return "Hello" + string;
	}

	@Override
	public String save(String name, String pwd) {
		System.out.println("输入的用户名是：" + name + "密码是：" + pwd);
		return "用户名：" + name + "密码是：" + pwd;
	}

}

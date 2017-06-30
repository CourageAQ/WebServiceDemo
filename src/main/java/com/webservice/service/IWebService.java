package com.webservice.service;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public interface IWebService {
	@WebMethod
	public String sayHello(String string);
	
	@WebMethod
	public String save(String name,String pwd);
}

package com.webservice.client;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

@WebService(name = "WebServiceImplService",targetNamespace = "http://service.webservice.com/")
public interface WebServices {
	
	@WebMethod
	public String save(
			@WebParam(name = "arg0")
			String arg0,
			@WebParam(name = "arg1")
			String arg1);

	@WebMethod
	public String sayHello(
			@WebParam(name = "arg0") 
			String arg0);
	
}

package com.webservice.service;

import javax.xml.ws.Endpoint;
/***
 * 
 * @author Eternity
 *	http://localhost:8088/getwebservice?wsdl
 *	访问成功证明发布没问题
 */
public class AppMain {
	public static void main(String[] args) {
		String address = "http://localhost:8088/getwebservice";
		Endpoint.publish(address, new WebServiceImpl());
		System.out.println("webservice服务端启动");
	}
}

package com.webservice.service;

import javax.xml.ws.Endpoint;
/***
 * 
 * @author Eternity
 * 	服务端的发布
 *	http://localhost:8088/getwebservice?wsdl
 */
public class AppMain {
	public static void main(String[] args) {
		String address = "http://localhost:8088/getwebservice";
		Endpoint.publish(address, new WebServiceImpl());
		System.out.println("webservice服务端启动");
	}
}

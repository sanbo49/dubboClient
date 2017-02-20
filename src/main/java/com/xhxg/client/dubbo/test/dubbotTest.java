/**
 * 
 */
package com.xhxg.client.dubbo.test;

import javax.annotation.Resource;

import com.xhxg.server.dubbo.service.DemoServer;

/**
 * @author Administrator
 *
 */
public class dubbotTest {
	@Resource
	private DemoServer demoService;
	private void init(){
		String retStr=demoService.xhxgHelloWorld("中华人民共和国ABCDE");
		System.out.println(retStr);
		
	}
}

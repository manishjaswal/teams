package com.mj.test;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;

public class TestIntercepter extends AbstractInterceptor {

	@Override
	public String intercept(ActionInvocation actionInvocation) throws Exception {
		// TODO Auto-generated method stub
		
		preProcess();

		String result = actionInvocation.invoke();
		
		postProcess(result);
		
		
		return result;
	}
	
	
	private void preProcess()
	{
		System.out.println("Pre Process");
	}
	
	private void postProcess(String string)
	{
		System.out.println("Post Process" + string);
	}

}

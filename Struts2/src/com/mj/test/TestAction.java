package com.mj.test;

import java.util.ArrayList;
import java.util.List;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class TestAction extends ActionSupport {

	private String name="";
	
	private List<String> response= null;
	
	public String getName() {
		return name;
	}
	
	public List<String> getResponse() {
		return response;
	}

	public void setResponse(List<String> response) {
		this.response = response;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String execute()
	{
//		for (int i = 0; i < 1000; i++) {
//			
//		}
		System.out.println("name111:"+		name);
		
		
		response = new ArrayList<String>();
		
		response.add("TEst 1");
		response.add("Test 2");
		response.add("Test 3");
		return "success";
		
		
	}
	
	@Override
	public void validate()
	{
//		System.out.println("Inside Validate");
//		if(name.trim().equals(""))
//		{
//			addFieldError("name", "Name cannot be Blank!");
//		}
	}
}

package com.revature.servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.revature.beans.Bean;

public class BeanServlet extends HttpServlet{
	private static ObjectMapper om = new ObjectMapper();
	private static ArrayList<Bean> beanList = new ArrayList<>();
	{
		beanList.add(new Bean("pinto","grey",3,5.6));
		beanList.add(new Bean("red","red",4,4.6));
		beanList.add(new Bean("green","green",6,.6));
		beanList.add(new Bean("kidney","red",33,5.0));
	}
	
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
		resp.getWriter().write(om.writeValueAsString(beanList.get((new Random().nextInt(4)))));
	}

}

package com.cpapgemini.mywebapp.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class DateServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//current system date and time
		Date date=new Date();
		resp.setContentType("text/html");
		resp.setHeader("refresh", "1");
		//get the context param
		//ServletContext context=getServletContext();
		ServletContext context=getServletContext();
		String contextparamval=context.getInitParameter("mycontextparam");
		//get config param
		ServletConfig config=getServletConfig();
		String configparamva1=config.getInitParameter("myconfigparam");
		
		PrintWriter out=resp.getWriter();
		out.print("<html>");
		out.print("<h2>Current system Date & Time -<br>"+date+"</h2>");
		out.println("<br><br>Context param value="+contextparamval);
		out.println("<br><br>config param value="+configparamva1);
		out.print("</html>");
		
		
	
	}
	

}

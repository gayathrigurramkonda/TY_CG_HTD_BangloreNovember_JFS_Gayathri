package com.cpapgemini.mywebapp.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/getemp")
public class GetEmployeeServlet extends HttpServlet {

	@Override
	protected void doHead(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String idval=req.getParameter("id");
		resp.setContentType("text/html");
		//get the context param
				ServletContext context=getServletContext();
				String contextparamval=context.getInitParameter("mycontextparam");
	
		PrintWriter out=resp.getWriter();
		out.println("<html>");
		out.println("<body>");
		out.println("Employee Id="+idval);
		out.println("Name=mouni");
		out.println("</br>salary=68925");
		out.println("<br><br>Context oaram value="+contextparamval);
		out.println("</body>");
		out.println("</html>");
	}//end of doGet()
	

}//end of class

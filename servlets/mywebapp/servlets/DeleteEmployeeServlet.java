package com.cpapgemini.mywebapp.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.cpapgemini.mywebapp.service.EmployeeService;
import com.cpapgemini.mywebapp.service.EmployeeServiceImpl;

@WebServlet("/deleteEmployee")
public class DeleteEmployeeServlet extends HttpServlet {
	private EmployeeService service=new EmployeeServiceImpl();
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		HttpSession session=req.getSession();
		if(session!=null) {
			int empId=Integer.parseInt(req.getParameter("empId"));
			PrintWriter out=resp.getWriter();
			out.println("<html>");
			out.println("<body>");
			if(service.deleteEmployee(empId)) {
				out.println("<h3 style='color:red'>Emloyee record for"+empId+"Deleted!</h3>");
				
			}else {
				out.println("<h3 style='color:red'>Emloyee record for"+empId+"not found!</h3>");
			}
			out.println("</html>");
			out.println("</body>");
		
			req.getRequestDispatcher(".delete.html").include(req, resp);
		}
		else {
			//invalid session
			PrintWriter out=resp.getWriter();
			out.println("<html>");
			out.println("<body>");
			out.println("<h3 style='color:red'>please login First</h3>");
			out.println("</html>");
			out.println("</body>");
			
			req.getRequestDispatcher("./loginpage.html").include(req, resp);
		}
		
	
	}

}

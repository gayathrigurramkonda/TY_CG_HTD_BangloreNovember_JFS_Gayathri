package com.cpapgemini.mywebapp.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cpapgemini.mywebapp.Dao.EmployeeDao;
import com.cpapgemini.mywebapp.Dao.EmployeeDaoImpl;
import com.cpapgemini.mywebapp.bean.EmployeeInfoBean;
import com.cpapgemini.mywebapp.service.EmployeeService;
@WebServlet("/searchEmployee")
public class SearchEmployeeServlet extends HttpServlet {
	private EmployeeDao employeeService=new EmployeeDaoImpl();
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String empIdVal1=req.getParameter("empId");
		
		int empId=Integer.parseInt(empIdVal1);
		employeeService.SearchEmployee(empId);
		EmployeeInfoBean employeeInfoBean=employeeService.SearchEmployee(empId);
		ServletContext context=getServletContext();
		String contextparamval=context.getInitParameter("mycontextparam");
		resp.setContentType("text/html");
		PrintWriter out=resp.getWriter();
		out.println("<html>");
		out.println("<body>");
		if(employeeInfoBean !=null) {
			out.println("<h3>Employee id"+empId +"Found-</h3>");
			out.println("name=" +employeeInfoBean.getName());
			out.println("<br>Age="+employeeInfoBean.getAge());
			out.println("<br>salary"+employeeInfoBean.getSalary());
			out.println("<br>Designation="+employeeInfoBean.getDesignation());
		}
		else {
			out.println("<h3 style='color:red'>Employee Id"+empId+"NotFound</h3>");
		}
		out.println("<br><br>Context param value= "+contextparamval);
		out.println("</body>");
		out.println("</html>");
		
		
		
		
		
		
		
	}
	

}

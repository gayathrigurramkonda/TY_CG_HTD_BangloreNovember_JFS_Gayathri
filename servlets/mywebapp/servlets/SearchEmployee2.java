package com.cpapgemini.mywebapp.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.cpapgemini.mywebapp.bean.EmployeeInfoBean;
import com.cpapgemini.mywebapp.service.EmployeeService;
import com.cpapgemini.mywebapp.service.EmployeeServiceImpl;
@WebServlet("/searchEmployee2")
public class SearchEmployee2 extends HttpServlet {
private EmployeeService service=new EmployeeServiceImpl();
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		HttpSession session=req.getSession(false);//return null if user is not logedin returns same session if logged in
		resp.setContentType("text/html");
		PrintWriter out=resp.getWriter();
		out.println("<html>");
		out.println("<body>");
		if(session !=null) {
			//valid session
			String empIdval =req.getParameter("empId");
			int empId=Integer.parseInt(empIdval);
			EmployeeInfoBean employeeInfoBean=service.searchEmployee(empId);
			if(employeeInfoBean !=null) {
				out.println("<h3>Employee id"+empId +"Found-</h3>");
				out.println("name=" +employeeInfoBean.getName());
				out.println("<br>Age="+employeeInfoBean.getAge());
				out.println("<br>salary"+employeeInfoBean.getSalary());
				out.println("<br>Designation="+employeeInfoBean.getDesignation());
			}
		}else {
			//invalid session
		out.println("please login user");
		req.getRequestDispatcher("./loginpage.html").include(req, resp);;
			
		}
		out.println("</body>");
		out.println("</html>");
	
	}//End of goGEt()
	

}//end of class

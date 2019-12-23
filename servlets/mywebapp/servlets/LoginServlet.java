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
@WebServlet("/lOgin")
public class LoginServlet extends HttpServlet {
	private EmployeeService service=new EmployeeServiceImpl();

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//get the form data
		String empIdVal=req.getParameter("empId");
		String password=req.getParameter("password");
		
		
		int empId=Integer.parseInt(empIdVal);
		EmployeeInfoBean employeeInfoBean=service.authenicate(empId, password);
		PrintWriter out=resp.getWriter();
		out.println("<html>");
		out.println("<body>");
		if( employeeInfoBean!=null) {
			HttpSession session=req.getSession(true);//during creation of new session we calltrue and logout also same 
			session.setAttribute("employeeInfoBean",employeeInfoBean);
			out.println("<h2 style='color:blue'>Welcome "+employeeInfoBean.getName()+"!</h2>");
			out.println("<br><a href='./add.html'>Add Employee</a>");
			out.println("<br><a href='#'>Update Employee</a>");
			out.println("<br><a href='./searchemp.html'>SearchEmployee</a>");
			out.println("<br><a href='./delete.html'>DeleteEmployee</a>");
			out.println("<br><a href='#'>seeAllEmployee</a>");
			out.println("<br><a href='./logout'>Logout</a>");
			

		}else {
			out.println("<h3 style='color:red'>Invalid credentials </h3>");
			req.getRequestDispatcher("./loginpage.html").include(req, resp);
		}
		out.println("</html>");
		out.println("</body>");
		
	}//end of method
	

}//end of class

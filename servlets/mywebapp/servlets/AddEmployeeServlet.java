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

@WebServlet("/addEmployee")
public class AddEmployeeServlet extends HttpServlet {
	private EmployeeService service=new EmployeeServiceImpl();
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	 HttpSession session=req.getSession();
	 if(session!=null) {
		 //valid session
		 //get the form data
		 int empId=Integer.parseInt(req.getParameter("empId"));
		 String name=req.getParameter("name");
		 int age=Integer.parseInt(req.getParameter("age"));
		 double salary=Double.parseDouble(req.getParameter("salary"));
		 String designation=req.getParameter("designation");
		 String password=req.getParameter("password");
		 EmployeeInfoBean employeeInfoBean=new EmployeeInfoBean(); 
		 employeeInfoBean.setEmpId(empId);	
		 employeeInfoBean.setAge(age);
		 employeeInfoBean.setName(name);
		 employeeInfoBean.setSalary(salary);
		 employeeInfoBean.setPassword(password);
		 employeeInfoBean.setDesignation(designation);
		 boolean isAdded=service.addEmployee(employeeInfoBean);
		 PrintWriter out=resp.getWriter();
		 out.println("<html>");
		 out.println("<body>");
		 if(isAdded) {
			 out.println("<h3 style='color:green'>Employee Added successfully....</h3>");
		 }else {
			 out.println("<h3 style='color:red'>unable to add</h3>");
		 }
		 out.println("</body>");
		 out.println("</html>");
		 req.getRequestDispatcher("./add.html").include(req, resp);
		 
		 
	 }else {
		 PrintWriter out=resp.getWriter();
		 out.println("<html>");
		 out.println("<body>");
		 out.println("<h3 style='color:red'>please login first</h3>");
		 out.println("</html>");
		 out.println("</body>");
		 req.getRequestDispatcher("./loginpage.html").include(req, resp);
		 
	   
	 }
	}

}

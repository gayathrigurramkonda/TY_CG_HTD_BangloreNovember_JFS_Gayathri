package com.capgemini.mywebapp.servletsforjsp;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.cpapgemini.mywebapp.bean.EmployeeInfoBean;
import com.cpapgemini.mywebapp.service.EmployeeService;
import com.cpapgemini.mywebapp.service.EmployeeServiceImpl;

@WebServlet("/addEmpJsp")
public class AddEmployeeServletJsp extends HttpServlet {
	private EmployeeService service=new EmployeeServiceImpl();

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		HttpSession session=req.getSession();
		 if(session!=null) {
			 //valid session
			 //get form data
			 int empId=Integer.parseInt(req.getParameter("empId"));
			 String name=req.getParameter("name");
			 int age=Integer.parseInt(req.getParameter("age"));
			 double salary=Double.parseDouble(req.getParameter("salary"));
			 String Designation=req.getParameter("designation");
			 String  password=req.getParameter("password");
			 EmployeeInfoBean employeeInfoBean=service.searchEmployee(empId);
			 employeeInfoBean.setAge(empId);
			 employeeInfoBean.setAge(age);
			 employeeInfoBean.setName(name);
			 employeeInfoBean.setDesignation(Designation);
			 employeeInfoBean.setSalary(salary);
			 employeeInfoBean.setPassword(password);
			 req.setAttribute("empInfoBean", employeeInfoBean);
			 boolean isAdded=service.addEmployee(employeeInfoBean);
			 if(isAdded) {
				 req.setAttribute("msg", "employee added successfully");
			 }else {
				 req.setAttribute("msg", "unable to add");
			 }
			 req.getRequestDispatcher("./addEmpJsp.jsp").forward(req, resp);
	}else {
		req.setAttribute("msg", "please login first");
		req.getRequestDispatcher("./loginFormJsp").forward(req, resp);
	}
}
}
	

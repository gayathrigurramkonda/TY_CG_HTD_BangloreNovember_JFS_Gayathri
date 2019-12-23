package com.cpapgemini.mywebapp.servlets;

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
@WebServlet("/updateEmpJsp")
public class UpdateEmployeeServlet extends HttpServlet {
	private EmployeeService service=new EmployeeServiceImpl();
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		HttpSession session=req.getSession(false);
	   if(session!=null ) {
		   int empId=Integer.parseInt(req.getParameter("empId"));
			 String name=req.getParameter("name");
			 String ageVal=req.getParameter("age");
			 String  salaryVal=req.getParameter("salary");
			 String Designation=req.getParameter("designation");
			 String  password=req.getParameter("password");
			 EmployeeInfoBean employeeInfoBean=service.searchEmployee(empId);
			 employeeInfoBean.setAge(empId);
			 if(ageVal!=null && !ageVal.isEmpty()) {
				 int age=Integer.parseInt(ageVal);//if we get nullpointer exception
				 employeeInfoBean.setAge(age);
			 }
			 
			 employeeInfoBean.setName(name);
			 employeeInfoBean.setDesignation(Designation);
			 if(salaryVal!=null && !salaryVal.isEmpty()) {
				 int salary=Integer.parseInt(salaryVal);
				 employeeInfoBean.setSalary(salary);
			 }
			 
			 employeeInfoBean.setPassword(password);
			 boolean isUpdated=service.updateEmployee(employeeInfoBean);
			 if(isUpdated) {
				 req.setAttribute("msg", "Employee Details Updated successfully");
			 }else {
				 req.setAttribute("msg", "Update Failed !please try again later");
			 }
	   
	   }else {
		   req.setAttribute("msg", "Please login first");
		   req.getRequestDispatcher("./loginFormJsp").forward(req, resp);
	   }
	}

}

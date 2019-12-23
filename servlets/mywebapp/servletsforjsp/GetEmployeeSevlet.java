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
@WebServlet("/searchEmpJsp")
public class GetEmployeeSevlet extends HttpServlet {
	private EmployeeService service=new EmployeeServiceImpl();
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	 HttpSession session=req.getSession();
	 if(session!=null) {
		 //valid session
		 //get form data
		 int empId=Integer.parseInt(req.getParameter("empId"));
		 EmployeeInfoBean employeeInfoBean=service.searchEmployee(empId);
		 req.setAttribute("empInfoBean", employeeInfoBean);
		 
		 req.getRequestDispatcher("./searchEmpJsp.jsp").forward(req, resp);
	 }else {
		 req.setAttribute("msg", "please login first!");
		 req.getRequestDispatcher("./loginFormjsp").forward(req, resp);
	 }
		
		
		
	}//end of doget

}//end of class

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
@WebServlet("/loginFormjsp")
public class LoginServlet extends HttpServlet {
	private EmployeeService service=new EmployeeServiceImpl();
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int empId=Integer.parseInt(req.getParameter("empId"));
		String password =req.getParameter("password");
	
		EmployeeInfoBean employeeInfoBean=service.authenicate(empId, password);
		if(employeeInfoBean!=null) {
			HttpSession session=req.getSession(true);
			session.setAttribute("employeeInfoBean",employeeInfoBean );
			session.setMaxInactiveInterval(60);
			req.getRequestDispatcher("./homePageJsp.jsp").forward(req, resp);
		}else {
			req.setAttribute("msg", "Invalid Credentials");
			req.getRequestDispatcher("./loginFormjsp").forward(req, resp);
		}
		
	}
	

}

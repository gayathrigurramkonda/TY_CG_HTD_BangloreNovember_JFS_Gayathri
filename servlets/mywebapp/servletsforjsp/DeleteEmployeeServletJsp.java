package com.capgemini.mywebapp.servletsforjsp;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.cpapgemini.mywebapp.service.EmployeeService;
import com.cpapgemini.mywebapp.service.EmployeeServiceImpl;
@WebServlet("/deleteEmployee1")
public class DeleteEmployeeServletJsp extends HttpServlet {
	private EmployeeService service=new EmployeeServiceImpl();
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		HttpSession session=req.getSession(false);
		if(session!=null) {
			int empId=Integer.parseInt(req.getParameter("empId"));
			boolean isDeleted=service.deleteEmployee(empId);
			if(isDeleted) {
				req.setAttribute("msg", "Record for EmpId"+empId+"Deleted");
			}
			else {
				req.setAttribute("msg"," record for EmpId"+empId+"not found");
			}
			req.getRequestDispatcher("./deleteJsp.jsp").forward(req, resp);
		
	}else {
		req.setAttribute("msg", "please login");
		req.getRequestDispatcher("./loginFormJsp").forward(req, resp);
		
	}
	}

}

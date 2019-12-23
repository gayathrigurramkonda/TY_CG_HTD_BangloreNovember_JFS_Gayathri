package com.capgemini.mywebapp.servletsforjsp;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.cpapgemini.mywebapp.bean.EmployeeInfoBean;
import com.cpapgemini.mywebapp.service.EmployeeService;
import com.cpapgemini.mywebapp.service.EmployeeServiceImpl;

@WebServlet("/seeAllEmployees")
public class SeeAllEmployeesServlet extends HttpServlet {
	private EmployeeService service=new  EmployeeServiceImpl();
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		HttpSession session=req.getSession(false);
		if(session!=null) {
		List<EmployeeInfoBean> employeeList=service.getAllEmployees();
		if(employeeList!=null&& employeeList.isEmpty()) {
			req.setAttribute("employeeList", employeeList);
			
		}
		else {
			req.setAttribute("msg", "There is no employee  recrd to display");
		}
		req.getRequestDispatcher("./seeaAllEmployeesJsp.jsp").forward(req, resp);
		}else {
			req.setAttribute("msg", "please login first");
			req.getRequestDispatcher("./loginForm").forward(req, resp);
		}
	}
}

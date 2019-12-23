package com.capgemini.mywebapp.servletsforjsp;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/logout2")
public class LogoutServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	HttpSession session=req.getSession();
	if(session!=null) {
		session.invalidate();
		req.setAttribute("msg", "thank you");
	}else {
		req.setAttribute("msg", "you are not loggedin");
	}
	req.getRequestDispatcher("./loginFormjsp").forward(req, resp);
	
	}

}

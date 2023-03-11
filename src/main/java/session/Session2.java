package session;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/session2")
public class Session2 extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		HttpSession httpSession = req.getSession();
		String name =(String) httpSession.getAttribute("username");
		
		PrintWriter printWriter = resp.getWriter();
		printWriter.write("<html><body><h2>Welcome Back To The New Application " + name + "</h2></body></html>");
		printWriter.write("<h2> <a href='session3'>LogOut </a> </h2>");

	}
}
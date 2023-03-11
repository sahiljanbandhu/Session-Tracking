package session;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/session1")
public class Session1 extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String name = req.getParameter("name");

		HttpSession httpSession = req.getSession();
		httpSession.setAttribute("username", name);

		PrintWriter printWriter = resp.getWriter();
		printWriter.write("<html><body><h2>Welcome To My Page" + " " + name + "</h2></body></html>");
		printWriter.write("<h2> <a href='session2'>Go To Servlet2 </a> </h2>");
	}
}
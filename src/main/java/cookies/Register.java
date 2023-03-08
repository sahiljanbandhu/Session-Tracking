package cookies;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/servlet1")
public class Register extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String name = req.getParameter("name");

		Cookie cookie = new Cookie("username", name);
		resp.addCookie(cookie);

		PrintWriter printWriter = resp.getWriter();
		printWriter.write("<html><body><h2>Welcome To My Page" + " " + name + "</h2></body></html>");
		printWriter.write("<h2> <a href='servlet2'>Go To Servlet2 </a> </h2>");

	}
}

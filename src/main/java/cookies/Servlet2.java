package cookies;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/servlet2")
public class Servlet2 extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String name = req.getParameter("name");

		Cookie cookie[] = req.getCookies();
		String n = "";

		for (Cookie cookie2 : cookie) {
			n = cookie2.getValue();
		}

		for (Cookie cookie2 : cookie) {
			System.out.println(cookie2.getName() + " - is the unique key");
			System.out.println(cookie2.getValue() + " - is the original value");
		}
		PrintWriter printWriter = resp.getWriter();
		printWriter.write("<html><body><h2>Welcome Back To The New Application " + n + "</h2></body></html>");

	}
}
package springbook.temp;

import java.io.IOException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.mock.web.MockHttpServletRequest;

public class SimpleGetServlet extends HttpServlet{
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
		String name = req.getParameter("name");
		
		res.getWriter().print("<HTML><BODY>");
		res.getWriter().print("Hello " + name);
		res.getWriter().print("</BODY></HTML>");
		
	}
}

package springbook.temp;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import java.io.IOException;

import javax.servlet.ServletException;

import org.junit.Test;
import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.mock.web.MockHttpServletResponse;

public class MockHttpServletTest {
	@Test
	public void MockTest() throws ServletException, IOException {
		MockHttpServletRequest req = new MockHttpServletRequest("GET", "/hello");
		MockHttpServletResponse res = new MockHttpServletResponse();
		
		req.addParameter("name", "Spring");
		
		SimpleGetServlet servlet = new SimpleGetServlet();
		servlet.service(req, res);
		
		assertThat(res.getContentAsString().contains("Hello Spring"), is(true));
	}
}

package servlets;

import org.mockito.Mockito;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import static org.junit.Assert.*;

public class AllRequestsServletTest extends Mockito {
    @org.junit.Test
    public void doGet() throws Exception {
        HttpServletRequest request = mock(HttpServletRequest.class);
        HttpServletResponse response = mock(HttpServletResponse.class);
        when(request.getRequestURI()).thenReturn("/page.html");

        AllRequestsServlet tester = new AllRequestsServlet("echo test");

        tester.doGet(request, response);

        assertEquals("devices.html must contain \"test\" now",
                "test", response.toString());
    }

}
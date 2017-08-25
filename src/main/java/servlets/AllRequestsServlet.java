package servlets;

import templater.PageGenerator;
import shell.ExecuteShellCommand;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;


public class AllRequestsServlet extends HttpServlet {

    public void doGet(HttpServletRequest request,
                      HttpServletResponse response) throws ServletException, IOException {

        Map<String, Object> pageVariables = new HashMap<>();

        if (!request.getRequestURI().equals("/page.html")) {

            pageVariables.put("devices", "");

            response.getWriter().println(PageGenerator.instance().getPage("page.html", pageVariables));

            response.setContentType("text/html;charset=utf-8");
            response.setStatus(HttpServletResponse.SC_OK);

        } else {

            ExecuteShellCommand obj = new ExecuteShellCommand();

            String output = obj.executeCommand("lshw -C net");

            pageVariables.put("devices", output);

            response.getWriter().println(PageGenerator.instance().getPage("page.html", pageVariables));
        }
    }

    public void doPost(HttpServletRequest request,
                       HttpServletResponse response) throws ServletException, IOException {
    }
}
